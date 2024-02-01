package com.cisco.rest.model;

public class OrderResponse {

	Long id;
	String productDetails;
	String customerName;
	
	public OrderResponse(Long id, String productDetails, String customerName) {
		super();
		this.id = id;
		this.productDetails = productDetails;
		this.customerName = customerName;
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductDetails() {
		return productDetails;
	}
	public void setProductDetails(String productDetails) {
		this.productDetails = productDetails;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
}
