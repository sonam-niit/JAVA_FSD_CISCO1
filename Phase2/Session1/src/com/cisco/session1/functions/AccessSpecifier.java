package com.cisco.session1.functions;

public class AccessSpecifier {

	public int num1=10;
	private int num2=20;
	protected int num3=30;
	int num4=40;//Default
	
	public static void main(String[] args) {
		AccessSpecifier s= new AccessSpecifier();
		System.out.println(s.num1);
		System.out.println(s.num2);
		System.out.println(s.num3);
		System.out.println(s.num4);
	}
}
