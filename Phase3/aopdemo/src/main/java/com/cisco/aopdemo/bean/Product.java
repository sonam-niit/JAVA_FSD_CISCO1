package com.cisco.aopdemo.bean;

public class Product {

	private int id;
	private String name;
	private int price;
	private String brand;
	private int stock;
	
	private boolean canBuy;
	
	public Product() {
		System.out.println("[Product] object created");
	}

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	public boolean isCanBuy() {
		return canBuy;
	}
	public void setCanBuy(boolean canBuy) {
		this.canBuy = canBuy;
	}

	//Business Method
	public void purchaseProduct(String deliveryLocation,String deliveryTime,
			String userEmail) {
		if(canBuy) {
			System.out.println("---------------------------------");
			System.out.println("Bank Transaction started: "+name+" of price "+price);
			System.out.println("Thank You "+userEmail+" for buying "+name +" of "+brand);
			System.out.println("-------------------------------------------");
		}else {
			System.out.println("We are out of the stock, Please try after sometime");
		}
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", brand=" + brand + ", stock=" + stock
				+ "]";
	}
	
}
