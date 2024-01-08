package com.cisco.session1.conditions;

public class LoopsDemo {

	public static void main(String[] args) {
		int i=1;
		System.out.println("While Loop");
		while(i<=5) {
			System.out.println(i);
			i++; //increment Operator
		}
		System.out.println("Do While Loop");
		do {
			System.out.println(i);
			i++;
		}while(i<=10);
		System.out.println("For Loop");
		for(i=11;i<=15;i++) {
			System.out.println(i);
		}
	}
}
