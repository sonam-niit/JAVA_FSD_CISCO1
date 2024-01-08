package com.cisco.session1.basic;

import java.util.Scanner;

public class TernaryOp {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ANy Number");
		float num1= sc.nextFloat();
		System.out.println("Enter ANy Number");
		float num2= sc.nextFloat();
		
		float res=(num1>num2)? num1 :num2;
		System.out.println("Larger Number: "+res);
		sc.close();
	}
	//Get Number from Scanner and check its even or Odd using Ternary
}
