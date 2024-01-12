package com.cisco.mongodb_java;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.cisco.mongodb_java.dao.DBOperations;
import com.cisco.mongodb_java.model.Customer;

public class App {
	public static void main(String[] args) {
		DBOperations op = new DBOperations();

//		Customer c = new Customer("Sonam Soni", "+91 9876543210", "sonam@gmail.com", new Date(), new Date());
//		op.insertCustomer(c);
//		
//		List<Customer> customers=new ArrayList<Customer>();
//		customers.add(new Customer("Fionna", "+91 9999876543", "fiona@gmail.com", new Date(), new Date()));
//		customers.add(new Customer("Mike", "+91 9999912345", "mike@gmail.com", new Date(), new Date()));
//		customers.add(new Customer("Alex", "+91 9999976548", "alex@gmail.com", new Date(), new Date()));
//		
//		op.insertCustomers(customers);
		op.getAllCustomers();
	}
}
