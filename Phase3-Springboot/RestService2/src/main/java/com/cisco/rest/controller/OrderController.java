package com.cisco.rest.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.rest.model.Order;
import com.cisco.rest.model.OrderResponse;
import com.cisco.rest.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

	@Autowired
	private OrderService service;
	
	@PostMapping
	public ResponseEntity<Order> addOrder(@RequestBody Order order){
		Order newOrder= service.addOrder(order);
		return ResponseEntity.created(URI.create("/api/orders/"+newOrder.getId()))
				.body(newOrder);
	}
	
	//return Response in the form of String
//	@GetMapping("{id}")
//	public ResponseEntity<String> getOrderById(@PathVariable Long id){
//				
//		Order order=service.getOrderById(id).orElse(null);
//		if(order!=null) {
//			String productDetails= service.getProductDetails(order.getProductId());
//			return ResponseEntity.ok("Order Details: "+order.getId()+" Custome name: "
//			+order.getCustomerName()+" Product Details: "+productDetails);
//		}else 
//			return ResponseEntity.notFound().build();
//	}
	
	//Return Response in the Form of Product Object
	@GetMapping("{id}")
	public ResponseEntity<OrderResponse> getOrderById(@PathVariable Long id){
				
		Order order=service.getOrderById(id).orElse(null);
		if(order!=null) {
			OrderResponse resp= 
					new OrderResponse(order.getId(), 
							service.getCleanProductDetails(order.getProductId()),
							order.getCustomerName());
			return ResponseEntity.ok().body(resp);
		}else 
			return ResponseEntity.notFound().build();
	}
	
}
