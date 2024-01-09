package com.cisco.session2.finaldemo;

final class MyClass{
	
	void print() {
		System.out.println("Hello World");
	}
}
//Final class Can not be Inherited
//class Child extends MyClass{
//	
//}

class Check{
	final boolean valid(int age) {
		return age>=18;
	}
}
class ValidateUser extends Check{
//	@Override
//	 boolean valid(int age) {
//			return age>=18;
//		}
}
public class FinalDemo {

	private final double pi=3.14;
	
	public static void main(String[] args) {
		
		FinalDemo obj= new FinalDemo();
		
		System.out.println("Pi: "+obj.pi);
		
		//obj.pi=22/7; //final value can no be changes
	}
}
