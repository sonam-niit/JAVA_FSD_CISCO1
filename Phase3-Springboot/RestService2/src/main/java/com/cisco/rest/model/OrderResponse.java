package com.cisco.rest.model;

public class OrderResponse {

	Long id;
	Product productDetails;
	String customerName;
	
	public OrderResponse(Long id, Product productDetails, String customerName) {
		super();
		this.id = id;
		this.productDetails = productDetails;
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "OrderResponse [id=" + id + ", productDetails=" + productDetails + ", customerName=" + customerName
				+ "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Product getProductDetails() {
		return productDetails;
	}
	public void setProductDetails(Product productDetails) {
		this.productDetails = productDetails;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
	
}
