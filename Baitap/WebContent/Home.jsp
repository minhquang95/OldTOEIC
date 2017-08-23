<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Kết quả</title>
</head>
<body>
	<h1><%= session.getAttribute("sessionname") %></h1>
	<a href="show.jsp" >Lon</a>
	<a href="Login.jsp" >Ngoc</a>	
	
	<form action="LogOutSeverlet" method = "POST">
	
	<input type = "submit" value = "Trở lại"/>
	
	</form>
</body>
</html>