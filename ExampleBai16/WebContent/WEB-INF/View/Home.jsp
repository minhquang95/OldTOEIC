<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>

   <!--link href="/Bootstrap/css/bootstrap.min.css" rel="stylesheet">
   <script src="/Bootstrap/js/jquery-3.1.1.min.js"></script>
   <script src="/Bootstrap/js/bootstrap.min.js"></script-->
   
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
<center>
	<table border = '1'>
			<tr>
			<th>
				id
			</th>
			
			<th>
				name
			</th>
			
			<th>
				salary
			</th>
			
			</tr>
			<c:forEach items = "${listemp}" var="l">
			<tr>
				<td>${l.id}</td>
				<td>${l.name}</td>
				<td>${l.salary}</td>
			</tr>
			</c:forEach>
	</table>
	<ul class = "pagination">
   		<li><a href = "HomeForward?${numberpage-1}">&laquo;</a></li>
   		<li><a href = "HomeForward?pageid=1">1</a></li>
   		<li><a href = "HomeForward?pageid=2">2</a></li>
   		<li><a href = "HomeForward?${numberpage+1}">&raquo;</a></li>
   
	</ul>
	</center>
</body>
</html>