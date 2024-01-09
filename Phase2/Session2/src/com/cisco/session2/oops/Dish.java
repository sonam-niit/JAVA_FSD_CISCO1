package com.cisco.session2.oops;

public class Dish {

	//Not static Variables available with Object
	String name;
	int price;
	int quantity;
	
	static int noOfDishes=1;
	//This is class level variables
	//Default Constructor
	public Dish(){
		name="Salad";
		price=100;
		quantity=1;
		noOfDishes++;
	}
	public void incQuantity() {quantity++;}
	public void decQuantity() {quantity--;}
	//Parameterized constructor
	public Dish(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public void showData() {
		System.out.println("Dish Details: "+name+" "+price+" "+quantity);
	}
}
