package com.cisco.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cisco.rest.model.Product;
import com.cisco.rest.repo.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	@Override
	public Product addProduct(Product product) {
		return productRepository.save(product);
	}
	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}
	@Override
	public Product getProductById(Long id) {
		return productRepository.findById(id).orElse(null);
	}
	@Override
	public void deleteProductById(Long id) {
		productRepository.deleteById(id);
		
	}
	@Override
	public Product updateProductById(Product product, Long id) {
		Product exisctingProduct= getProductById(id);
		if(exisctingProduct!=null) {
			exisctingProduct.setName(product.getName());
			exisctingProduct.setPrice(product.getPrice());
			exisctingProduct.setDescription(product.getDescription());
			exisctingProduct=productRepository.save(exisctingProduct);
		}
		return exisctingProduct;
	}

}
