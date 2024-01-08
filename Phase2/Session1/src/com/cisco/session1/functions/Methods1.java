package com.cisco.session1.functions;

public class Methods1 {

	public void print() {
		System.out.println("Print Method Called");
	}
	public void fullName(String fname,String lname) {
		System.out.println("Welcome "+fname+" "+lname);
	}
	public int cube(int n) {
		return n*n*n;
	}
	public boolean checkValidity(int age) {
		return age>=18;
	}
	
	public static void main(String[] args) {
		Methods1 obj= new Methods1();
		obj.print();
		obj.fullName("Sonam", "soni");
		System.out.println("Cube of: "+obj.cube(4));
		System.out.println("User Validity "+obj.checkValidity(34));
	}
}
