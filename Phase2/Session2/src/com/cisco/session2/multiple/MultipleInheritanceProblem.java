package com.cisco.session2.multiple;

class Parent1{
	public void flat() {
		System.out.println("Parent 1 Flat");
	}
}
class Parent2{
	public void flat() {
		System.out.println("Parent 2 Flat");
	}
}
//Below line gives and Error Because of Ambiguity
//class Child extends Parent1,Parent2{
//	
//}
//One class can only extends 1 class
public class MultipleInheritanceProblem {

}
