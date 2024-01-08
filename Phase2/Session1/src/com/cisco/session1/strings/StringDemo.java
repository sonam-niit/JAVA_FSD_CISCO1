package com.cisco.session1.strings;

public class StringDemo {

	public static void main(String[] args) {
		
		String str1="Hello World";
		String str2="Hello World";
		
		System.out.println(str1==str2);
		String obj1=new String("Hello World");
		String obj2= new String("Hello World");
		System.out.println(obj1==obj2);
		//objects are Different
		
		str1= str1+" Sonam";//Changing the string
		
		//We can not change the value of string objects
		//Immutable Strings
		//If you change then it will create another object
		
	}
}
