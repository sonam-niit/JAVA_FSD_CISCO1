package com.cisco.jdbc.batchupdate;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.cisco.jdbc.updated.DBConfig;

public class StaticBatchUpdate {

	public static void main(String[] args) {
		Connection conn= DBConfig.getConnection();
		try {
			Statement stmt= conn.createStatement();
			stmt.addBatch("insert into product (name,price,rating,category) values ('Pen',10,4.5,'stationary')");
			stmt.addBatch("insert into product (name,price,rating,category) values ('Pencil',5,4.3,'stationary')");
			stmt.addBatch("insert into product (name,price,rating,category) values ('HeadPhone',599,4.9,'electronics')");
			stmt.addBatch("insert into product (name,price,rating,category) values ('Laptop',98000,4.2,'electronics')");
			
			int arr[]=stmt.executeBatch();
			System.out.println(arr.length+" Records updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
