<html>
<body>
<h2>Hello World!</h2>
<!-- Declaration  -->
<%! String name="Sonam Soni" ;%>
<!-- Expression -->
<%= "Welcome "+name %>
<br><br>
<!-- Scriptlet -->
<%
	int num1=10;
	int num2=20;
	out.println("Result is "+(num1+num2));
%>
<br><br>
<%! int cube(int n){
	return n*n*n;
} %>

<%= "Cube of 3 is "+cube(3) %>
<%
	session.setAttribute("name", "Sonam Soni");
%>
<br><br>
<%@ include file="datedemo.jsp" %>
<a href="next.jsp">Next Page</a>
</body>
</html>










