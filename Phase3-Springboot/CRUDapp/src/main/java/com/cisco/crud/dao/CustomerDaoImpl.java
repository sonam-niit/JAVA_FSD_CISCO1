package com.cisco.crud.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cisco.crud.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao{

	List<Customer> customers= new ArrayList<Customer>();
	@Override
	public Customer createCustomer(Customer cust) {
		customers.add(cust);
		return cust;
	}

	@Override
	public List<Customer> getAllCustomers() {
		return customers;
	}

	@Override
	public void removeCustomer(int id) {
		Iterator<Customer> itr= customers.iterator();
		Customer found=null;
		while(itr.hasNext()) {
			Customer c= itr.next();
			if(c.getId()==id) {
				found=c;
				break;
			}
		}
		if(found!=null)
			customers.remove(found);//remove customer object
	}

	
}
