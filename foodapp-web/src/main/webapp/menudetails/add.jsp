<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Menu</title>
</head>
<body>
	<h2>Enter Menu Detail</h2>
	<form action="insert">
		Id:<input type="text" name="id" placeholder="Enter Menu Id"
			autofocus="autofocus" required="required"> Name:<input
			type="text" name="name" placeholder="Enter Menu Name"
			autofocus="autofocus" required="required">
		<button type="submit">Add</button>
	</form>
	<a href="food/logout">Sign Out</a>
</body>
</html>