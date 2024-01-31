package com.cisco.springjdbcdemo.model;

public class Dish {

	private int dishId;
	private String name;
	private int price;
	
	public Dish() {
		
	}
	public Dish(int dishId, String name, int price) {
		super();
		this.dishId = dishId;
		this.name = name;
		this.price = price;
	}

	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Dish [dishId=" + dishId + ", name=" + name + ", price=" + price + "]";
	}
	
}
