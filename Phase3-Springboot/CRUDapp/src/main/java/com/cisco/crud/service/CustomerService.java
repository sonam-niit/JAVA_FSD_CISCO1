package com.cisco.crud.service;

import java.util.List;

import com.cisco.crud.model.Customer;

public interface CustomerService {

	public Customer createCustomer(Customer cust);
	public List<Customer> getAllCustomers();
	public void removeCustomer(int id);
}
