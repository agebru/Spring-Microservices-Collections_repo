package com.client.model;

public class Order {
	private int orderId;
	private String orderType;
	private double price;
	
	public Order() {
		
	}
	

	public Order(int orderId, String orderType, double price) {
		super();
		this.orderId = orderId;
		this.orderType = orderType;
		this.price = price;
	}


	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
