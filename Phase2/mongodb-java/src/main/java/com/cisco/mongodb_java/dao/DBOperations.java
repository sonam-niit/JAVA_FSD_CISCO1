package com.cisco.mongodb_java.dao;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.cisco.mongodb_java.model.Customer;
import com.cisco.mongodb_java.util.Util;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoClients;

public class DBOperations {

	MongoClient client;
	MongoDatabase database;
	MongoCollection collection;
	
	public DBOperations(){
		String connectionString = "mongodb+srv://sonam_cisco:8yrFVa7N8esFuRaY@cluster0.kggk6aj.mongodb.net/";
		
		client= MongoClients.create(connectionString);
		System.out.println("Connection created");
		database= client.getDatabase(Util.DB_NAME);
		System.out.println("Database Selected as "+Util.DB_NAME);
		collection=database.getCollection(Util.COLLECTION_NAME);
		System.out.println("Collection selected "+Util.COLLECTION_NAME);
	}
	public void insertCustomer(Customer customer) {
		try {
			collection.insertOne(createDocument(customer));
			System.out.println("Customer Object Inserted Successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void insertCustomers(List<Customer> customers) {
		try {
			List<Document> documents= new ArrayList<Document>();
			for(Customer c:customers) {
				documents.add(createDocument(c));
			}
			collection.insertMany(documents);
			System.out.println(customers.size()+" Customers Inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void getAllCustomers(){
		try {
			List<Document> documents= (List<Document>) collection.find().into(new ArrayList<Document>());
			for(Document d:documents) {
//				System.out.println(d.toJson());
				System.out.println(d.get("name")+" "+d.get("email"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public Document createDocument(Customer customer) {
		Document doc= new Document()
				.append("name", customer.getName())
				.append("phone", customer.getPhone())
				.append("email", customer.getEmail())
				.append("intime", customer.getIntime())
				.append("outtime", customer.getOuttime());
		return doc;
	}
}
