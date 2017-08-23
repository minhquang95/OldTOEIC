<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register</title>
</head>
<body>
	<h1><%= request.getAttribute("msgregister") != null ? request.getAttribute("msgregister") : "" %></h1>
	<form action="RegisterController" method = "POST">
		Username :<input type = "text" value = "" name = "uname"/>
		<br></br>
		<br></br>
		Password :<input type = "password" value = "" name = "pass"/>
		<br></br>
		<br></br>
		<input type = "submit" value = "Đăng nhập"/>
	</form>
</body>
</html>