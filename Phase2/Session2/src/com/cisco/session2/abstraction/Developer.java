package com.cisco.session2.abstraction;

public class Developer extends Employee{
	
	private String progLang;

	public Developer(String name, int employeeId, 
			double salary,String progLang) {
		super(name, employeeId, salary);
		this.progLang=progLang;
	}
	@Override
	public double calculateBonus() {
		return 5000;
	}
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Programming Language: "+progLang);
	}
}
