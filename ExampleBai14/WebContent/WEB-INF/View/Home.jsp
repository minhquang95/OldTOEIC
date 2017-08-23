<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-81">
<title>Home Page</title>
</head>
<body>
	<h3>From Personal</h3>
	<h3><%= request.getAttribute("msginsertstudent") != null ? request.getAttribute("msginsertstudent") : " " %></h3>
	<form action="HomeController" method = "post">
	
	Student name : <input type = "text" name = "studentname"/>
	<br/>
	<br/>
	Province :
	<select name = "dropdownprovince">
	 <c:forEach items =  "${listprovince}" var ="l">
	<option value = "${l.provinceid}">${l.provincename}</option>
	</c:forEach>
	</select>
	<br/>
	<br/>
	
	<input type = "submit" value = "OK"/>
	
	<br/>
	<br/>
	
	</form>
	
	
</body>
</html>