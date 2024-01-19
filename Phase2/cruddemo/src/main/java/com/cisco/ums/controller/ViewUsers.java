package com.cisco.ums.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cisco.ums.dao.UserDAO;
import com.cisco.ums.daoimpl.UserDAOImpl;
import com.cisco.ums.model.User;

@WebServlet("/viewall")
public class ViewUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out= resp.getWriter();
		resp.setContentType("text/html");
		out.println("<h2>User's List</h2>");
		out.print("<table> <tr><th>Id</th><th>Name</th><th>Email</th>"
				+ "<th>Country</th><th>Op</th></tr>");
		UserDAO dao= new UserDAOImpl();
		List<User> users= dao.getAllUsers();
		
		for(User user:users) {
			out.println("<tr>");
			out.println("<td>"+user.getId()+"</td>");
			out.println("<td>"+user.getName()+"</td>");
			out.println("<td>"+user.getEmail()+"</td>");
			out.println("<td>"+user.getCountry()+"</td>");
			out.println("<td><a href='delete?id="+user.getId()+"'>X</td>");
			out.println("<td><a href='updatepage?id="+user.getId()+"'>edit</td>");
			out.println("</tr>");
		}
		out.print("</table>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
