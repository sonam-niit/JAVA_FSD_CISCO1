package com.cisco.session2.inheritance;

public class MethodOverload {

	public void add(int num1,int num2) {
		System.out.println(num1+num2);
	}
	public void add(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
	}
	public void add(double num1,double num2) {
		System.out.println(num1+num2);
	}
	public void add(float num1,float num2) {
		System.out.println(num1+num2);
	}
	public static void main(String[] args) {
		MethodOverload m= new MethodOverload();
		m.add(12.00, 45.00);//double method
		m.add(12,23);
		m.add(12, 5, 6);
		m.add(3.4f, 8.9f);
	}
}
