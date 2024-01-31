package com.cisco.rest;

import java.util.Date;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/user")
public class UserService {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String registerUserWithPlainResponse() {
		return "[PLAIN TEXT] User Registered Successfully at "+new Date();
	}
//	@GET
//	@Produces(MediaType.TEXT_HTML)
//	public String registerUserWithHTMLResponse() {
//		String resp= "<html><body>"+
//					"<h3>[HTML TEXT] User Registered Successfully at "+new Date()+"</h3>"
//					+"</body></html>";
//		return resp;
//	}
//	
//	@GET
//	@Produces(MediaType.TEXT_XML)
//	public String registerUserWithXMLResponse() {
//		String resp= "<?xml version='1.0' encoding='UTF-8'?>"+
//					"<response>[XML TEXT] User Registered Successfully at "+new Date()+
//					"</response>";
//		return resp;
//	}
//	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public String registerUserWithJSONResponse() {
//		String resp= "{"+
//					"'response':'[JSON TEXT] User Registered Successfully at "+new Date()+
//					"'}";
//		return resp;
//	}
	
}
