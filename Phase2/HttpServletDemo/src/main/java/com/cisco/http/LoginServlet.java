package com.cisco.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out= resp.getWriter();
		String email= req.getParameter("email");
		String password= req.getParameter("password");
		resp.setContentType("text/html");
		
		if(email.equals("admin@gmail.com") && password.equals("admin@123")){
			
			out.println("<form action='dashboard' method='post'>");
			out.println("<input type='hidden' name='email' value='"+email+"'>");
			out.println("<button type='submit'>View Dashboard</button>");
//			RequestDispatcher dispatcher= req.getRequestDispatcher("/dashboard");
//			dispatcher.forward(req, resp);
		}else {
			out.println("<h3 style='color:red'>Invalid Credentials</h3>");
			RequestDispatcher dispatcher= req.getRequestDispatcher("/login.html");
			dispatcher.include(req, resp);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
