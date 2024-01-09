package com.cisco.session2.inheritance;

class Parent {
	String fname;
	String lname;
	int wealth;
	Parent(){
		fname="John";
		lname="Watson";
		wealth=1000000;
		System.out.println("Parent Value Initialized with default Constructor");
	}
	void showData() {
		System.out.println("Parent Details: "+fname+" "+lname+" "+wealth);
	}
}
class Child extends Parent{
	Child(){
		//super(); //It will call its Parent class Constructor First
		System.out.println("Child Class constructor Called");
	}
}
public class InheritanceDemo{
	public static void main(String[] args) {
		Child c= new Child();
		c.fname="sonam";//Child can access states of Parent class
		c.showData();//Child can access behaviors of Parent class
	}
}