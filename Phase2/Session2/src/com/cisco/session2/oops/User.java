package com.cisco.session2.oops;

import java.util.Date;

public class User {
	// State
	String name;
	String phone;
	String email;
	char gender;
	Date birthdate;
	String password;

	// Default Constructor
	public User() {
		System.out.println("Constrcutor called");
		name = "TestUser";
		phone = "+91 1234567890";
		email = "test@gmail.com";
		gender = 'F';
		birthdate = new Date(); // object of Date class
		password = "secret";
	}

	// Parameterized Constructor
	public User(String name, String phone, String email, char gender, Date birthdate, String password) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.birthdate = birthdate;
		this.password = password;
	}

	public void updateUserData(String name, String phone, String email, char gender, Date birthdate, String password) {
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gender = gender;
		this.birthdate = birthdate;
		this.password = password;
	}

	public void showUserData() {
		System.out.println("----------------------------------");
		System.out.println("Name: " + name + " ,Phone: " + phone);
		System.out.println("Email: " + email);
		System.out.println("Gender: "+((gender == 'M') ? "Male" : (gender == 'F') ? "Female" : "Other"));
		System.out.println("Date of Birth: " + birthdate);
		System.out.println("Password: " + password);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", phone=" + phone + ", email=" + email + ", gender=" + gender + ", birthdate="
				+ birthdate + ", password=" + password + "]";
	}

	public static void main(String[] args) {
		User users[] = { 
				new User("Sonam", "+91 8765432109", "sonam@gmail.com", 'F', new Date(), "123456"),
				new User("Shivam", "+91 882346272", "shiv@gmail.com", 'M', new Date(), "kumar12"),
				new User("Pooja", "+91 882346272", "poo@gmail.com", 'F', new Date(), "9876554")
				};
		for(User u:users) {
			u.showUserData();
		}

	}
}
