package com.cisco.session2.innerclasses;

class Outer{
	private String name="Simplilearn";
	class Inner{
		void print() {
			System.out.println("Welcome "+name);
		}
	}
}

public class InnerClassDemo {

	public static void main(String[] args) {
		Outer outer= new Outer();
		Outer.Inner inner= outer. new Inner();
		inner.print();
	}
}
