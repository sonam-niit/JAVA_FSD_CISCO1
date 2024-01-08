package com.cisco.session1.datahandling;

import com.cisco.session1.functions.AccessSpecifier;

public class Child extends AccessSpecifier{

	public static void main(String[] args) {
		Child s= new Child();
		
		System.out.println(s.num1);
		//System.out.println(s.num2);
		System.out.println(s.num3);
		//System.out.println(s.num4);
	}
}
