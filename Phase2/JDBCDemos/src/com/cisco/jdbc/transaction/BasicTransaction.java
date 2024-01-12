package com.cisco.jdbc.transaction;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.cisco.jdbc.updated.DBConfig;

public class BasicTransaction {

	public static void main(String[] args) throws SQLException {
		Connection conn= DBConfig.getConnection();
		try {
			conn.setAutoCommit(false);
			//Execute statements
			Statement stmt= conn.createStatement();
			
			stmt.executeUpdate("update employee set salary=50000 where id=34");
			stmt.executeUpdate("update employee set salary=50000 where id=1");
			//if everything goes fine then
			conn.commit();//transaction committed
			System.out.println("Transaction completed successsfully");
			
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}//rollback the transaction
			e.printStackTrace();
		}finally {
			conn.setAutoCommit(true);
		}
	}
}
