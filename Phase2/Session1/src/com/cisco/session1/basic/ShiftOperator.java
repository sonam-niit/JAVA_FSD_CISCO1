package com.cisco.session1.basic;

public class ShiftOperator {

	public static void main(String[] args) {
		int num=10;
		//Left Shift Multiplication
		System.out.println(num<<2);//num* (2^2)//
		System.out.println(num<<3);//num* (2^3)
		//Right Shift Division
		System.out.println(8>>2);//8 / (2^2)//2
		System.out.println(40>>2);// 40 / (2^2) //10
		System.out.println(32>>3);//32 / (2^3) //4
		//>>> (num>0 then >> >>> both works same
		System.out.println(-20>>2);
		System.out.println(-20>>>2);//Parity of MSB changes to 0
	}
}
