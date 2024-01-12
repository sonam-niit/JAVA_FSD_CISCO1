package com.cisco.jdbc.updated;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Utility Class for getting connection
public class DBConfig {

	public static Connection getConnection() {

		Connection conn = null;
		// load driver
		try {
			Class.forName(Util.DRIVER);
			conn = DriverManager.getConnection(Util.URL,Util.USERNAME,Util.PASSWORD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}

}
