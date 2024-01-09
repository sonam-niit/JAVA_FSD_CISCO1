package com.cisco.session2.innerclasses;

public class AnnonymousDemo {

	public static void main(String[] args) {
		
		Car c= new Car() {
			@Override
			public void stop() {
				System.out.println("Car Started");
			}
			@Override
			public void start() {
				System.out.println("Car Stopped");
			}
		};
	
		c.start();c.stop();
	}
}
