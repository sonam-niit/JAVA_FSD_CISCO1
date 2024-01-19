<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var="name" value="Sonam Soni"></c:set>
	<c:set var="uname" value="SonamSoni"></c:set>
	Name:
	<c:out value="${name }" />
	<br>
	<br> User Name:
	<c:out value="${uname }" />

</body>
</html>