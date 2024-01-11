package com.cisco.session3.synchronization;

public class SynchnizationApp {

	public static void main(String[] args) {
		Printer printer= new Printer();
	
		Laptop laptop1=new Laptop();
		laptop1.setName("Sonam");
		Laptop laptop2=new Laptop();
		laptop2.setName("Pallavi");
		DeskTop desktop= new DeskTop();
		
		laptop1.attachPrinter(printer);
		laptop2.attachPrinter(printer);
		desktop.attachPrinter(printer);
		
		laptop1.start();
		laptop2.start();
		desktop.start();
	}
}
