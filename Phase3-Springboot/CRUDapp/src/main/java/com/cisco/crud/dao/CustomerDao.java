package com.cisco.crud.dao;

import java.util.List;

import com.cisco.crud.model.Customer;

public interface CustomerDao {

	public Customer createCustomer(Customer cust);
	public List<Customer> getAllCustomers();
	public void removeCustomer(int id);
}
