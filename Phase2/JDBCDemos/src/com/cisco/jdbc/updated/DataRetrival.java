package com.cisco.jdbc.updated;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataRetrival {

	public static void main(String[] args) {
		
		Connection conn= DBConfig.getConnection();
		try {
			PreparedStatement pst= conn.prepareStatement("select * from employee");
			ResultSet result=pst.executeQuery();
			while(result.next()) {
				System.out.println("------------------------------------");
				System.out.println("Id: "+result.getInt("id"));//column name
				System.out.println("Name: "+result.getString("name"));
				System.out.println("Email: "+result.getString(3));//column index
				System.out.println("Age: "+result.getInt(4));
				System.out.println("Phone: "+result.getBigDecimal(5));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
