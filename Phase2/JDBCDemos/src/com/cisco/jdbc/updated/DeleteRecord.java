package com.cisco.jdbc.updated;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteRecord {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Id to delete record");
		int id= sc.nextInt();
		
		try {
			Connection conn= DBConfig.getConnection();
			PreparedStatement pst= conn.prepareStatement("delete from employee where id=?");
			pst.setInt(1, id);
			int i= pst.executeUpdate();
			System.out.println(i+" Record deleted");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		sc.close();
	}
}
