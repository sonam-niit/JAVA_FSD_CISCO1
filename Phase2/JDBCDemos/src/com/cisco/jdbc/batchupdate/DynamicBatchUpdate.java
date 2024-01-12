package com.cisco.jdbc.batchupdate;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.cisco.jdbc.updated.DBConfig;

public class DynamicBatchUpdate {


	public static void main(String[] args) {
		Connection conn= DBConfig.getConnection();
		try {
			PreparedStatement pst= conn.prepareStatement
					("insert into product (name,price,rating,category)values(?,?,?,?)");
			//Record 1
			pst.setString(1, "IPhone");
			pst.setBigDecimal(2, new BigDecimal(1999000));
			pst.setBigDecimal(3, new BigDecimal(4.7));
			pst.setString(4, "Electronics");
			pst.addBatch();
			//Record 2
			pst.setString(1, "Real Me Note 5");
			pst.setBigDecimal(2, new BigDecimal(19000));
			pst.setBigDecimal(3, new BigDecimal(4.3));
			pst.setString(4, "Electronics");
			pst.addBatch();
			
			int resp[]=pst.executeBatch();
			System.out.println(resp.length+" Records Updated");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
