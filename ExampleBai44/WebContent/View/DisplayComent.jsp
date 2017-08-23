<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Display Comment	</title>
</head>
<body>
 <table border = '1'>
	<tr>
			<th>Content</th>
			<th>Username</th>
	</tr>
<c:forEach items = "${listcomment}" var = "l">
	<tr>
		<th>
			${l.content}
		</th>
		
		<th>
			${l.username}
		</th>
	
	</tr>
</c:forEach>
</table>

</body>
</html>