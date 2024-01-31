<%@page import="com.cisco.test.TestClient"%>
<%@page import="jakarta.ws.rs.client.WebTarget"%>
<%@page import="jakarta.ws.rs.core.UriBuilder"%>
<%@page import="java.net.URI"%>
<%@page import="org.glassfish.jersey.client.ClientConfig"%>
<%@page import="jakarta.ws.rs.client.ClientBuilder"%>
<%@page import="jakarta.ws.rs.client.Client"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Test My Restful Service</h3>
<%!
	TestClient client= new TestClient();
%>
Plain Response: <%= client.getPlainResponse() %>
<br><br>

<br><br>
</body>
</html>