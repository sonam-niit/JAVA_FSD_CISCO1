package com.cisco.session2.oops;

public class Student {

	// State
	int id;
	String name;
	String email;
	String address;
	// Behavior
	public void setData(int i, String n, String e, String a) {
		id = i;
		name = n;
		email = e;
		address = a;
	}
	public void speak() {
		System.out.println(name + " is speaking");
	}
	public void eat() {
		System.out.println(name + " is eating");
	}
	public String toString() {
		return "[Student, Id: "+id+
				", Name: "+name+", Email: "+email+
				", Address: "+address+
				"]";
	}
}
