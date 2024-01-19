package com.cisco.ums.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cisco.ums.dao.UserDAO;
import com.cisco.ums.daoimpl.UserDAOImpl;
import com.cisco.ums.model.User;

@WebServlet("/updatepage")
public class UpdatePageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		UserDAO dao= new UserDAOImpl();
		int id= Integer.parseInt(req.getParameter("id"));
		User user=dao.getUserById(id);
		
		out.print("<h1>update User Page</h1>");
		out.print("<form action='update' method='post'>");
		out.print("<input type='hidden' name='id' value='"+user.getId()+"'");
		out.print("<label>Name:</label><input type='text' value='"+user.getName()+"' name='name'><br><br>");
		out.print("<label>Email:</label><input type='text'"
				+ "disabled value='"+user.getEmail()+"' name='email'><br><br>");
		out.print("<label>Country:</label><input type='text' value='"+user.getCountry()+"' name='country'><br><br>");
		out.print("<input type='submit' value='Update User'>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
