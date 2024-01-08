package com.cisco.session1.conditions;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ANy Number");
		int num1= sc.nextInt();
		
		if(num1%2==0)
			System.out.println(num1+" is Even");
		else
			System.out.println(num1+" is Odd");
		
		sc.close();
	}
}
