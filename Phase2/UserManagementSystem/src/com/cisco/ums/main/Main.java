package com.cisco.ums.main;

import java.util.Iterator;
import java.util.List;
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
				System.out.println("Enter Id for Update");
				int id= sc.nextInt();
				System.out.println("Enter Name");
				String name1= sc.next();
				System.out.println("Enter Country");
				String country1= sc.next();
				User newUser= new User();
				newUser.setName(name1);
				newUser.setCountry(country1);
				User resp=dao.updateUser(newUser, id);
				if(resp!=null) {
					System.out.println("User Updated successfully, below is the updated User");
					System.out.println(resp);
				}else {
					System.out.println("No User available for Update");
				}
				break;
			case 3:
				List<User> list= dao.getAllUsers();
				if(list.size()==0) {
					System.out.println("No user Added in DB yet");
				}else {
					Iterator<User> itr= list.iterator();
					while(itr.hasNext()) {
						System.out.println(itr.next());
					}
				}
				break;
			case 4:
				System.out.println("Enter the ID which you want to delete");
				int id2= sc.nextInt();
				if(dao.deleteUser(id2)) {
					System.out.println("User deleted successfully");
				}else{
					System.out.println("No User found for Delete");
				}
				break;
			case 5:
				System.out.println("Enter the ID which you want to search");
				int id1= sc.nextInt();
				User u= dao.getUserById(id1);
				if(u!=null) {
					System.out.println(u);
				}else {
					System.out.println("No user Found");
				}
				break;
			case 6: System.exit(0); break;
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
