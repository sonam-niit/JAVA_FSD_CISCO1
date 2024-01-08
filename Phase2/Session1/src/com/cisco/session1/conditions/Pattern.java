/*
 * Program: Pattern Creation Using Loops
 * Author: Sonam Soni
 * Date: 08-01-2024
 */
package com.cisco.session1.conditions;

//Nested Loops
public class Pattern {

	public static void main(String[] args) {
		System.out.println("Star pattern");
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();//new Line
		}
		System.out.println("Numeric pattern");
		for(int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col+" ");
			}
			System.out.println();//new Line
		}
		/*
		 * 
		 */
	}
}
