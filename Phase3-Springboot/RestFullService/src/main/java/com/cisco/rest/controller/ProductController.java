package com.cisco.rest.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	@GetMapping
	public ResponseEntity<List<Product>> getAllProducts(){
		return ResponseEntity.ok(service.getAllProducts());
	}
	@GetMapping("{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Long id){
		return service.getProductById(id)
				.map(ResponseEntity :: ok)
				.orElse(ResponseEntity.notFound().build());
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable Long id){
		
		if(service.getProductById(id).isPresent()) {
			service.deleteProductById(id);
			return ResponseEntity.ok("Product Deleted Successfully");
		}else {
			return ResponseEntity.notFound().build();
		}
	}
	@PutMapping("{id}")
	public ResponseEntity<Product> updateProduct(@PathVariable Long id,
			@RequestBody Product product){
		if(service.getProductById(id).isPresent()) {
			return ResponseEntity.ok(service.updateProductById(product, id));
		}else {
			return ResponseEntity.notFound().build();
		}
	}
}

















