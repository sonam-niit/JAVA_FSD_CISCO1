<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://localhost:3306/ums" user="root" password="Sonam@123"
		var="conn" />
	<sql:query var="rs" dataSource="${conn }">
		select * from user
	</sql:query>
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Country</th>
		</tr>
		<c:forEach var="user" items="${rs.rows }">
			<tr>
				<td><c:out value="${user.id} " /></td>
				<td><c:out value="${user.name} " /></td>
				<td><c:out value="${user.email} " /></td>
				<td><c:out value="${user.country} " /></td>
			</tr>
		</c:forEach>
	</table>
	<!-- <c:out value="${conn }"/>
	<br><br>
	<c:choose>
		<c:when test="${conn!=null }">
			Connected
		</c:when>
		<c:otherwise>
			Not Connected
		</c:otherwise>
	</c:choose> -->

</body>
</html>