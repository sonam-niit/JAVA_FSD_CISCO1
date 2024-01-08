package com.cisco.session1.conditions;

import java.util.Scanner;

//Even numbers with limit
public class NaturalNumbers {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Limit");
		int limit= sc.nextInt();
		
		for(int i=2;i<=limit;i+=2) {
			System.out.println(i);
		}
		
		sc.close();
	}
}
