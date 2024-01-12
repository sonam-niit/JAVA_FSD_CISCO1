package com.cisco.jdbc.updated;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertDynamicRecords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roll No");
		int id = sc.nextInt();
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter Email");
		String email = sc.next();
		System.out.println("Enter Age");
		int age = sc.nextInt();
		System.out.println("Enter Phone");
		BigInteger phone = sc.nextBigInteger();

		Connection conn = DBConfig.getConnection();
		String sql = "insert into employee (id,name,email,age,phone) values(?,?,?,?,?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.setString(2, name);
			stmt.setString(3, email);
			stmt.setInt(4, age);
			stmt.setBigDecimal(5, new BigDecimal(phone));
			
			int i= stmt.executeUpdate();
			System.out.println(i+" Records inserted in DB");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			sc.close();
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
