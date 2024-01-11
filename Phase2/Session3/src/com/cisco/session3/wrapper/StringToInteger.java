package com.cisco.session3.wrapper;

public class StringToInteger {

	public static void main(String[] args) {
		Integer num1= new Integer("45");
		System.out.println(num1);
		
		String str="100";
		Integer num2= Integer.valueOf(str);
		System.out.println(num2);
		
		Float float_num= new Float(10.77);
		System.out.println("Float Value: "+float_num.toString());
	}
}
