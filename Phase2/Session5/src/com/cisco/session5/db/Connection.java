package com.cisco.session5.db;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoIterable;

public class Connection {

	public static void main(String[] args) {
		
		String connectionString=
				"mongodb+srv://sonam_cisco:8yrFVa7N8esFuRaY@cluster0.kggk6aj.mongodb.net/";
		try {
			
			MongoClient mongoClient= MongoClients.create(connectionString);
			
			//MongoDatabase database= mongoClient.getDatabase("ecommerce");
			//Available Databases in my Cluster
			
			MongoIterable<String> databases=mongoClient.listDatabaseNames();
			System.out.println("Available Databases");
			for(String dbName:databases) {
				System.out.println(dbName);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
