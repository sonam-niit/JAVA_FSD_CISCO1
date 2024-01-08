package com.cisco.session1.strings;

public class StringMethods {

	public static void main(String[] args) {
		String s1="Hello World";
		System.out.println("Length: "+ s1.length());
		System.out.println("Character at Index 3: "+s1.charAt(3));
		System.out.println("Upper Case: "+s1.toUpperCase());
		System.out.println("Sub String: "+s1.substring(6, 9));
		
		System.out.println(("       Sonam Soni   ".trim()).length());
		System.out.println(s1.concat(" Welcome"));
		
		char array[]=s1.toCharArray();
	}
}
