<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
</head>
<body>
	<table border = '1'>
	
		<tr> 
			<th>
				Username
			</th>
			
			<th>
				Password
			</th>
	
		</tr>
		
		<c:forEach items = "${listaccount}" var = "q">
		
			<tr>
				<td>
					${q.uname}
				</td>
			
				
				<td>
					${q.pass}	
				</td>
			</tr>
		
		</c:forEach>
	
	</table>
</body>
</html>