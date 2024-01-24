package com.cisco.autowiredemo.bean;

public class Order {

	private int orderId;
	private String dateTimeStamp;
	private int amount;
	public Order() {
		System.out.println("[Order] - Object created");
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getDateTimeStamp() {
		return dateTimeStamp;
	}
	public void setDateTimeStamp(String dateTimeStamp) {
		this.dateTimeStamp = dateTimeStamp;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", dateTimeStamp=" + dateTimeStamp + ", amount=" + amount + "]";
	}
}
