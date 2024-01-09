package com.cisco.session2.encaptulation;

public class Product {

	private int id;
	private String name;
	private String desc;
	private double price;
	private double rating;
	
	//get method always returns a value of the same datatype of that Variable
	public int getId() {
		return id;
	}
	//Setter method always void and accept one data to set value
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
}
