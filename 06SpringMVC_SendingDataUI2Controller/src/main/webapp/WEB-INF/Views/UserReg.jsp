<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Registration</title>
</head>
<body>
	<form action="registerUser" method="post">
		<pre>
		Id: <input type="text" name="id" /> <!-- name in these tag should match exact same as DTO fields --> 
		Name: <input type="text" name="name" />
		Email: <input type="email" name="email" /> 
		<input type="submit" name="Register">
</pre>
	</form>

</body>
</html>