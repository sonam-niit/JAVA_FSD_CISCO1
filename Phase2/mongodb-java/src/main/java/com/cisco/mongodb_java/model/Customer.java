package com.cisco.mongodb_java.model;

import java.util.Date;

public class Customer {

	String name;
	String phone;
	String email;
	Date intime;
	Date outtime;
	//Default Constructor
	public Customer() {}
	//Field Constructor
	public Customer(String name, String phone, String email, Date intime, Date outtime) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.intime = intime;
		this.outtime = outtime;
	}
	//To String Method
	@Override
	public String toString() {
		return "Customer [name=" + name + ", phone=" + phone + ", email=" + email + ", intime=" + intime + ", outtime="
				+ outtime + "]";
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getEmail() {
		return email;
	}
	public Date getIntime() {
		return intime;
	}
	public Date getOuttime() {
		return outtime;
	}
	
	
}
