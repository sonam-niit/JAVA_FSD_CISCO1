package com.cisco.session3.exception;

import java.util.Scanner;

public class RunTime1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		try {
			int div= num1/num2;
			System.out.println("Division: "+div);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Error Occured, Please try after Sometime.");
		}finally {
			sc.close();
			System.out.println("Scanner Closed successfully");
		}
	}
}
