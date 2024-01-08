package com.cisco.session1.conditions;

import java.util.Scanner;

public class ElseIf {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ANy Number");
		int percentage= sc.nextInt();
		
		if(percentage>=70 && percentage<=100) {
			System.out.println("Congratulations... You Got Distinction");
		}else if(percentage>=60 && percentage<70) {
			System.out.println("Congratulations... You Got First Class");
		}else if(percentage>=50 && percentage<60) {
			System.out.println("Congratulations... You Got Second Class");
		}else if(percentage>=35 && percentage<50) {
			System.out.println("Congratulations... You Got Pass Class");
		}else if(percentage>=0 && percentage<35) {
			System.out.println("Sorry... You are Fail");
		}else {
			System.out.println("Kindly Enter the correct Marks");
		}
		sc.close();
	}
}
