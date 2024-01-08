package com.cisco.session1.strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb1= new StringBuffer("Hello");
		System.out.println(sb1);
		sb1.append(" World");
		System.out.println("Updated "+sb1);
		System.out.println("Length: "+sb1.length());
		System.out.println(sb1.capacity());
		sb1.reverse();
		System.out.println(sb1);
		
		//convert StringBuffer into String
		String myString= sb1.toString();
		System.out.println(myString);
		
	}
}
