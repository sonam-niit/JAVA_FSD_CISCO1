package com.cisco.session3.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CompileTime1 {
	//Exception Declaration
	void readFile(String fileName) throws FileNotFoundException {
		FileReader fileReader= new FileReader(fileName);
	}
	void getConnection(String URL)throws SQLException {
		DriverManager.getConnection(URL);
	}
	public static void main(String[] args) {
		CompileTime1 obj= new CompileTime1();
		try {
			obj.readFile("D:/test.txt");
			obj.getConnection("DB URL");
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
