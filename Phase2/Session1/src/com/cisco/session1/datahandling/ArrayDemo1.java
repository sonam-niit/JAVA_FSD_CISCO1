package com.cisco.session1.datahandling;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5,6,7,8};
		String fruits[]= {"Apple","banana","Cherry"};
		
		System.out.println("Element at Index 4: "+nums[4]);
		System.out.println("Length of Array: "+nums.length);
		System.out.println("Print Array Use Loops");
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		System.out.println("For Each loop");
		for(String n: fruits) {
			System.out.println(n);
		}
	}
}
