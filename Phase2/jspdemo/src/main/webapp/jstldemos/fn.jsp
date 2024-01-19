<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false" %>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="name" value="Sonam Soni"/>

<c:out value="${fn:toLowerCase(name)} "/><br>
<c:out value="${fn:toUpperCase(name)} "/><br>
<c:out value="${fn:contains(name,'Sonam')} "/><br>
<c:out value="${fn:contains(name,'Sonam Soni')} "/><br>
</body>
</html>