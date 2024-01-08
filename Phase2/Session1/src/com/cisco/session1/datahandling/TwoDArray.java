package com.cisco.session1.datahandling;

public class TwoDArray {

	public static void main(String[] args) {
		
		//int arr[][]=new int[3][3];
		int arr[][]= {{1,2,3},{2,3},{6,7,9,10}};
		
		System.out.println("Print Array");
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+"\t");
			}
			System.out.println();
		}
		System.out.println("Print using for each loop");
		for(int row[]:arr) {
			for(int col:row) {
				System.out.print(col+"\t");
			}
			System.out.println();
		}
	}
}
