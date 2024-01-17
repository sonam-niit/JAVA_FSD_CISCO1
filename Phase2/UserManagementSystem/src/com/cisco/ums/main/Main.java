package com.cisco.ums.main;

import java.util.Scanner;

import com.cisco.ums.dao.UserDAO;
import com.cisco.ums.daoimpl.UserDAOImpl;
import com.cisco.ums.model.User;

public class Main {

	public static void main(String[] args) {
		UserDAO dao= new UserDAOImpl();
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to User Management Sytem");
		while(true) {
			
			System.out.println("Enter \n1 For Create New User\n2 For Update "
					+ "User\n3 for View All Users\n4 for Delete User\n5 get User By Id"
					+ "\n6 to exit the System");
			int input= sc.nextInt();
			switch (input) {
			case 1: 
				System.out.println("Enter your Name:");
				sc.nextLine();
				String name= sc.nextLine();
				System.out.println("Enter your Email");
				String email=sc.nextLine();
				System.out.println("Enter your Country Name");
				String country= sc.nextLine();
				User user= new User(name,email,country);
				if(dao.createUser(user)>0) {
					System.out.println("User Created successfully");
				}else {
					System.out.println("Some issue while cretaing User Try again..!");
				}
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			default:
				System.out.println("Kindly enter the Correct Input");
				
			}
			
			System.out.println("Enter y to continue, press any key to exit");
			String op= sc.next();
			if(op.equals("y")||op.equals("Y")){
				continue;
			}else {
				break;
			}
		}
		
		sc.close();
		
	}
}
