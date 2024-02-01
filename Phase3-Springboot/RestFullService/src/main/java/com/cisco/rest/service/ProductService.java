package com.cisco.rest.service;

import java.util.List;

import com.cisco.rest.model.Product;


public interface ProductService {

	public Product addProduct(Product product);
	public List<Product> getAllProducts();
	public Product getProductById(Long id);
	public void deleteProductById(Long id);
	public Product updateProductById(Product product,Long id);
}
