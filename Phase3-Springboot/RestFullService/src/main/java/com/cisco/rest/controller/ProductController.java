package com.cisco.rest.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.rest.model.Product;
import com.cisco.rest.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductService service;
	
	@PostMapping
	public ResponseEntity<Product> addNewProduct(@RequestBody Product product){
		Product newProduct= service.addProduct(product);
		String location="/api/products/"+newProduct.getId();
		return ResponseEntity.created(URI.create(location)).body(newProduct);
	}
}
