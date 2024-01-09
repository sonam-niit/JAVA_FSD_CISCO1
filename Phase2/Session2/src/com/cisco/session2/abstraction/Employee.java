package com.cisco.session2.abstraction;

public abstract class Employee {

	private String name;
	private int employeeId;
	private double salary;
	//Parameterized constructor
	public Employee(String name, int employeeId, double salary) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.salary = salary;
	}
	//getters
	public String getName() {
		return name;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public double getSalary() {
		return salary;
	}
	public abstract double calculateBonus();
	
	public void displayInfo() {
		System.out.println("Name: "+name);
		System.out.println("Employee Id: "+employeeId);
		System.out.println("Salary: $"+salary);
	}
	
}
