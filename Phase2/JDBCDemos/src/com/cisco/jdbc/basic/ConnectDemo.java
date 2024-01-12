package com.cisco.jdbc.basic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDemo {

	public static void main(String[] args) {
		
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/techABC";
		String username="root";
		String password="Sonam@123";
		//load driver
		try {
			Class.forName(driver);
			Connection conn=DriverManager.getConnection(url,username,password);
			if(conn!=null) {
				System.out.println("Connected");
			}else {
				System.out.println("Not Connected with DB");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
