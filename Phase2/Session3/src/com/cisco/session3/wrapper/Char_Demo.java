package com.cisco.session3.wrapper;

public class Char_Demo {

	public static void main(String[] args) {
		Character character= new Character('A');
		char ch='B';
		System.out.println(character == ch);
		
		System.out.println("Char Value: "+character.charValue());
		System.out.println("Function: "+Character.isUpperCase(character));
		System.out.println(Character.toLowerCase(ch));
		System.out.println(Character.isLowerCase(ch));
	}
}
