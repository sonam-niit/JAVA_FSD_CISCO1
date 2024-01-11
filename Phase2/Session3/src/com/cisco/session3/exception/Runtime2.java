package com.cisco.session3.exception;

import java.util.Scanner;

public class Runtime2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any thing");
		String name= sc.next();
		try {
			int num= Integer.parseInt(name);
			System.out.println(num);
		} catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}finally {
			sc.close();
		}
		
	}
}
