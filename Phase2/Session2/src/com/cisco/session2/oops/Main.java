package com.cisco.session2.oops;

public class Main {
	public static void main(String[] args) {
		Student s1= new Student();
		s1.setData(1, "Sonam", "sonam@gmail.com",
				"Mumbai");
		
		s1.speak();
		s1.eat();
		System.out.println(s1);
		
		Student s2= new Student();
		s2.setData(2, "Ayushi", "ayu@gmail.com",
				"Banglore");
		System.out.println(s2);
	}
}
