package com.cisco.session1.conditions;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age= sc.nextInt();
		if(age>=18) {
			System.out.println("Enter Your Weight");
			float weight= sc.nextFloat();
			if(weight>50) {
				System.out.println("You are Eligible for Boxing Championship");
			}else {
				System.out.println("You should gain some weight and try again");
			}
		}else{
			System.out.println("Kindly try after "+(18-age) +"years");
		}
		sc.close();
	}
}
