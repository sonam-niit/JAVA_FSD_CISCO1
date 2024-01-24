package com.cisco.appcontextdemo.bean;

public class Student {

	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void myInit() {
		System.out.println("[Student] myInit Executed for user: "+name);
	}
	public void myDestroy() {
		System.out.println("[Student] myDestroy Executed for user: "+name);
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
