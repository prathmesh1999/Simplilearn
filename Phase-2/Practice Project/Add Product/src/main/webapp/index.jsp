<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product Registration</title>
</head>
<body>
<form action="Register" method="post">
<table>
<tr><td>Product ID: </td><td><input type="text" name="id"></td></tr>
<tr><td>Product Name: </td><td><input type="text" name="name"></td></tr>
<tr><td>Product Cost: </td><td><input type="text" name="cost"></td></tr>
<tr><td>Quantity: </td><td><input type="text" name="quantity"></td></tr>
<tr><td></td><td><input type="submit" value="Add Product"></td></tr>
</table>
</form>
</body>
</html>