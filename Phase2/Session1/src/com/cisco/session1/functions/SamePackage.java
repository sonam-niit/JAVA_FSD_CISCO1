package com.cisco.session1.functions;

public class SamePackage {

	public static void main(String[] args) {
		AccessSpecifier s= new AccessSpecifier();
		System.out.println(s.num1);
		//System.out.println(s.num2);
		//In same package Private is not accessible
		System.out.println(s.num3);
		System.out.println(s.num4);
	}
}
