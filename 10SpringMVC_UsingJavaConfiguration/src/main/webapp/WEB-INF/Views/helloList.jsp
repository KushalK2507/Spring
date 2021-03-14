<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="com.kushal.spring.springMVC.dto.Employee,java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC</title>
</head>
<body>
	<b>Employees Details<b> <%
 	List<Employee> empDetails = (List<Employee>) request.getAttribute("empDetails");

 	for (Employee emp : empDetails) {
 		out.print(emp.getId());
 		out.print(emp.getName());
 		%>
 		<br>
 		<%
 	}
 %>
</body>
</html>