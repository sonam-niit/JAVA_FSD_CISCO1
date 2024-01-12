package com.cisco.jdbc.updated;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateRecord {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Id to update record");
		int id= sc.nextInt();
		System.out.println("Enter you name");
		String name=sc.next();
		System.out.println("Enter age");
		int age= sc.nextInt();
		try {
			Connection conn= DBConfig.getConnection();
			PreparedStatement pst= conn.prepareStatement("update employee set name=?, age=? where id=?");
			pst.setString(1, name);
			pst.setInt(2,age);
			pst.setInt(3, id);
			int i= pst.executeUpdate();
			System.out.println(i+" Record Updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
}
