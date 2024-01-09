package com.cisco.session2.abstraction;

public class EmployeeSystem {

	public static void main(String[] args) {
		Manager manager= new Manager("Varun Shukla", 101,78900,10);
		Developer developer= new Developer("Sonam", 290, 56000, "JAVA");
		
		manager.displayInfo();
		System.out.println("Managers Bonus: $"+manager.calculateBonus());
		
		developer.displayInfo();
		System.out.println("Developers Bonus: $"+developer.calculateBonus());
	}
}
