package com.cisco.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cisco.rest.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

//	@Query("from Product where name=:name")
//	public Product findByName(String name);
	
	//Queries based on other fields like Id
	//public Product findByName(String name);
}
