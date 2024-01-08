package com.cisco.session1.datahandling;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int arr[]= new int[5];//Create new Int array with length 5
		
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter any Number");
			arr[i]= sc.nextInt();
		}
		System.out.println("Print Array");
		for(int a: arr) {
			System.out.println(a);
		}
		
		sc.close();
	}
}
