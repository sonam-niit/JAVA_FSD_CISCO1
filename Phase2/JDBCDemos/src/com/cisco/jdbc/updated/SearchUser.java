package com.cisco.jdbc.updated;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SearchUser {

public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("ENter your name");
		String name= sc.next();
		Connection conn= DBConfig.getConnection();
		try {
			PreparedStatement pst= conn.prepareStatement("select * from employee where name=?");
			pst.setString(1, name);
			ResultSet result=pst.executeQuery();
			int count=0;
			while(result.next()) {
				count++;
				System.out.println("------------------------------------");
				System.out.println("Id: "+result.getInt("id"));//column name
				System.out.println("Name: "+result.getString("name"));
				System.out.println("Email: "+result.getString(3));//column index
				System.out.println("Age: "+result.getInt(4));
				System.out.println("Phone: "+result.getBigDecimal(5));
			}
			
			if(count==0) {
				System.out.println("No Records found in DB with name "+name);
			}else {
				System.out.println(count+" records found with Name ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		sc.close();
	}
}
