package com.cisco.rest.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cisco.rest.model.Order;
import com.cisco.rest.repo.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	RestTemplate restTemplate;
	@Override
	public Order addOrder(Order order) {
		return orderRepository.save(order);
	}

	@Override
	public Optional<Order> getOrderById(Long id) {
		return orderRepository.findById(id);
	}

	@Override
	public String getProductDetails(Long productId) {
		
		ResponseEntity<String> productResonse=
		restTemplate.getForEntity("http://localhost:8080/api/products/"+productId, String.class);
		return productResonse.getBody();
	}

}
