<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello World</title>
</head>
<body>

<center>
	<form name = "LoginForm" action="LoginController" method="POST">
	
	User name<input type = "text" name ="username"/><br>
	Password<input type = "password" name ="userpass"/><br>
	
	<input type = "submit" value = " Login "/>
</form>
</center>

</body>
</html>