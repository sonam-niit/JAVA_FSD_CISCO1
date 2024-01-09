package com.cisco.session2.abstraction;

public class Manager extends Employee {

	private double bonusPercentage;
	public Manager(String name, int employeeId, 
			double salary,double bonusPercentage) {
		super(name, employeeId, salary);
		this.bonusPercentage=bonusPercentage;
	}

	@Override
	public double calculateBonus() {
		return getSalary()*bonusPercentage/100;
	}
}
