package com.cisco.autowiredemo.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class User {

	private String name;
	private String email;
	@Autowired
	private Order order; //1 to 1 Relationship
	
	public User() {
		System.out.println("[User] - Object created");
	}
	public User(Order order) {
		System.out.println("[User] object created with order parameter in constructor");
		this.order = order;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", order=" + order + "]";
	}
}
