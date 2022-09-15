<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inputs</title>
</head>
<body>
	<h1>Enter 2 integers and an operator</h1>
	<form action="MathServlet" method="get">
		First Number: <input type="text" name="num1"><br>
		Second Number: <input type="text" name="num2"><br>
		Operator: <input type="text" name="operator"><br>
		<input type="submit">
	</form>
</body>
</html>