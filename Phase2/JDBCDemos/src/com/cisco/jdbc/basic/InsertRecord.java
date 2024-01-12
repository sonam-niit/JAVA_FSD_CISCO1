package com.cisco.jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRecord {

public static void main(String[] args) {
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/techABC";
		String username="root";
		String password="Sonam@123";
		//load driver
		try {
			Class.forName(driver);
			Connection conn=DriverManager.getConnection(url,username,password);
			//Static Insertion
			Statement statement= conn.createStatement();
			
			String sql= "insert into employee (id,name,email,age,phone) values"
					+ "(1,'Alex','alex@gmail.com',34,9876543210)";
			
			int i=statement.executeUpdate(sql);
			System.out.println(i+" Records Inserted in DB");
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
