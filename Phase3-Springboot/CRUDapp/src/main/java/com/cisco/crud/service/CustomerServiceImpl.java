package com.cisco.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cisco.crud.dao.CustomerDao;
import com.cisco.crud.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	CustomerDao dao;
	
	@Override
	public Customer createCustomer(Customer cust) {
		return dao.createCustomer(cust);
	}
	@Override
	public List<Customer> getAllCustomers() {
		return dao.getAllCustomers();
	}
	@Override
	public void removeCustomer(int id) {
		dao.removeCustomer(id);
		
	}
}
