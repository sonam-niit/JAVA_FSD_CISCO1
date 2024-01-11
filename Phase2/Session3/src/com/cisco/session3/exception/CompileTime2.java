package com.cisco.session3.exception;

import java.util.Scanner;

public class CompileTime2 {

	public void check(int age) throws Exception{
		if(age>=18) {
			System.out.println("Valid");
		}else {
			throw new Exception("Age is not Valid");
		}
	}
	public void adharCheck(int age, String adharNo) throws Exception{
		check(age);
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Age");
		int age= sc.nextInt();
		
		CompileTime2 obj= new CompileTime2();
		try {
			obj.adharCheck(age, "1234-5678-8901-1234");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			sc.close();
		}
	}
}
