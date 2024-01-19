<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--
	<%
	String name = request.getParameter("email");
	String pass = request.getParameter("pass");
	if (name.equals("admin@gmail.com") && pass.equals("admin@123")) {
	%>
	<jsp:forward page="success.jsp">
		<jsp:param value="<%=name%>" name="email" />
	</jsp:forward>
	<%
	} else {
		out.println("Wrong credentials");
	%>
		
		<jsp:include page="login.html"></jsp:include>
	<%
	}
	%>
	--%>
	${param.email }
	${param.pass }

</body>
</html>