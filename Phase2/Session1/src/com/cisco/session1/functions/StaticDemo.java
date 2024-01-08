package com.cisco.session1.functions;

public class StaticDemo {

	public static void sample() {
		System.out.println("Static Method Called");
	}
	
	public static void main(String[] args) {
		StaticDemo.sample();
		//no need to create Object you can call directly with Class Name
	}
}
