package com.cisco.session1.basic;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// Scanner class to take input from User
		Scanner sc = new Scanner(System.in); // object created of Scanner class
		System.out.println("Enter First Number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();
		System.out.println("Enter + for Addition - for Subtraction" + "* from Multiplication and / for Division");
		String op = sc.next();
		switch (op) {
		case "+":
			System.out.println("Addition: " + (num1 + num2));
			break;
		case "-": 
			System.out.println("Subtraction: " + (num1 - num2));
			break;
		case "*":
			System.out.println("Multiplication: " + (num1 * num2));
			break;
		case "/":
			if(num2!=0)
				System.out.println("Division: " + (num1 / num2));
			else
				System.out.println("Number can not be divide by Zero");
			break;
		default:
			System.out.println("Enter Correct Options");
		}
		sc.close(); // close the object once its use completed
	}

}
