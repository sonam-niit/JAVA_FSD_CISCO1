package com.cisco.dependencyinjection.bean;

import java.util.List;

public class Restaurant {

	private String name;
	private String phone;
	private String operatingHours;
	private float rating;
	private List<String> searchKeywords;//1-M relationship
	private Address address; //HAS A relationship 1-1
	public Restaurant() {
		System.out.println("[Restaurant] Object Created");
	}
	
	public Restaurant(Address address) {
		super();
		this.address = address;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getOperatingHours() {
		return operatingHours;
	}
	public void setOperatingHours(String operatingHours) {
		this.operatingHours = operatingHours;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<String> getSearchKeywords() {
		return searchKeywords;
	}
	public void setSearchKeywords(List<String> searchKeywords) {
		this.searchKeywords = searchKeywords;
	}

	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", phone=" + phone + ", operatingHours=" + operatingHours + ", rating="
				+ rating + ", searchKeywords=" + searchKeywords + ", address=" + address + "]";
	}

	
	
}
