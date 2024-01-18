package com.cisco.ums.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cisco.ums.dao.UserDAO;
import com.cisco.ums.daoimpl.UserDAOImpl;
import com.cisco.ums.model.User;

@WebServlet("/adduser")
public class AddUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserDAO dao= new UserDAOImpl();
		
		String name= request.getParameter("name");
		String email= request.getParameter("email");
		String country=request.getParameter("country");
		
		User user= new User(name, email, country);
		int x=dao.createUser(user);
		if(x>0) {
			response.getWriter().print("User Added Successfully");
		}else{
			response.getWriter().print("Error while Adding user in DB");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
