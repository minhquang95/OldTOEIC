<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>QuizOnline Page</title>
</head>
<body>
	<form action="QuizController" method = "post">
		<c:forEach items = "${listincomplete}" var = "l">
			<h3>${l.number}. ${l.question}</h3>
			<input type = "radio" name ="ans[${l.stt}]" value = "A"> ${l.option1}
			</br>
			<input type = "radio" name ="ans[${l.stt}]" value = "B"> ${l.option2}
			</br>
			<input type = "radio" name ="ans[${l.stt}]" value = "C"> ${l.option3}
			</br>
			<input type = "radio" name ="ans[${l.stt}]" value = "D"> ${l.option4}
			</br>
			</br>
		</c:forEach>
		</br>	
		
		<input type = "submit" value = "TapeScript"/> 
	</form>
	
</body>
</html>