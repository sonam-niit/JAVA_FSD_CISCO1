package com.cisco.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cisco.crud.model.Customer;
import com.cisco.crud.service.CustomerService;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@GetMapping
	public List<Customer> getAllCustomers(){
		return service.getAllCustomers();
	}
	@PostMapping
	public String addNewCustomer(@RequestBody Customer cust) {
		service.createCustomer(cust);
		return "Customer Added Successfully";
	}
	@DeleteMapping("{id}")
	public String deleteCustomer(@PathVariable int id) {
		service.removeCustomer(id);
		return "User Deleted Successfully";
	}
	
}




