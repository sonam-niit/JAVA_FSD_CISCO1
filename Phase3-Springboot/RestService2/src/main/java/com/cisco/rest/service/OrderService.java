package com.cisco.rest.service;

import java.util.Optional;

import com.cisco.rest.model.Order;
import com.cisco.rest.model.Product;

public interface OrderService {

	public Order addOrder(Order order);
	public Optional<Order> getOrderById(Long id);
	public String getProductDetails(Long productId);
	public Product getCleanProductDetails(Long productId);
}
