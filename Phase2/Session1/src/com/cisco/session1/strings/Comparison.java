package com.cisco.session1.strings;

import java.util.Scanner;

public class Comparison {

	public static void main(String[] args) {
		
		String username="Admin";
		String password="Admin123";
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your UserName");
		String uname=sc.next();
		System.out.println("String Password");
		String pass=sc.next();
		if(uname.equalsIgnoreCase(username) && password.equals(pass)) {
			System.out.println("Login Successful");
		}else {
			System.out.println("invalid Credentials");
		}
		
		sc.close();
	}
}
