<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Result Page</title>
</head>
<body>
	<c:forEach items = "${ListCorrectAnswer}" var  ="ListCorrectAnswer">
		<c:forEach items = "${ListanswerUser}" var  ="ListanswerUser">
		<c:if test="${ListCorrectAnswer.number == ListanswerUser.number}">
			<c:if test="${ListCorrectAnswer.correctanswer == 'A'}">
				<c:if test="${ListanswerUser.answer == 'A'}">
					<h2>${ListCorrectAnswer.number}. ${ListCorrectAnswer.question}</h2>
					<img alt="" src="Image/Correct.png"> ${ListCorrectAnswer.option1}
					</br>
					 ${ListCorrectAnswer.option2}
					</br>
					 ${ListCorrectAnswer.option3}
					</br>
					 ${ListCorrectAnswer.option4}
					</br>
	
				</c:if>
				
				<c:if test="${ListanswerUser.answer == 'B'}">
					<h2>${ListCorrectAnswer.number}. ${ListCorrectAnswer.question}</h2>
					 <img alt="" src="Image/Correct.png"> ${ListCorrectAnswer.option1}
					</br>
					 <img alt="" src="Image/Wrong.png"> ${ListCorrectAnswer.option2}
					</br>
					 ${ListCorrectAnswer.option3}
					</br>
					 ${ListCorrectAnswer.option4}
					</br>
	
				</c:if>
				
				<c:if test="${ListanswerUser.answer == 'C'}">
					<h2>${ListCorrectAnswer.number}. ${ListCorrectAnswer.question}</h2>
					 <img alt="" src="Image/Correct.png"> ${ListCorrectAnswer.option1}
					</br>
					 ${ListCorrectAnswer.option2}
					</br>
					<img alt="" src="Image/Wrong.png"> ${ListCorrectAnswer.option3}
					</br>
					 ${ListCorrectAnswer.option4}
					</br>
	
				</c:if>
				
				<c:if test="${ListanswerUser.answer == 'D'}">
					<h2>${ListCorrectAnswer.number}. ${ListCorrectAnswer.question}</h2>
					<img alt="" src="Image/Correct.png">  ${ListCorrectAnswer.option1}
					</br>
					 ${ListCorrectAnswer.option2}
					</br>
					 ${ListCorrectAnswer.option3}
					</br>
					<img alt="" src="Image/Wrong.png"> ${ListCorrectAnswer.option4}
					</br>
	
				</c:if>
			</c:if>
			
			<c:if test="${ListCorrectAnswer.correctanswer == 'B'}">
				<c:if test="${ListanswerUser.answer == 'A'}">
					<h2>${ListCorrectAnswer.number}. ${ListCorrectAnswer.question}</h2>
					 <img alt="" src="Image/Wrong.png"> ${ListCorrectAnswer.option1}
					</br>
					<img alt="" src="Image/Correct.png"> ${ListCorrectAnswer.option2}
					</br>
					 ${ListCorrectAnswer.option3}
					</br>
					 ${ListCorrectAnswer.option4}
					</br>
	
				</c:if>
				
				<c:if test="${ListanswerUser.answer == 'B'}">
					<h2>${ListCorrectAnswer.number}. ${ListCorrectAnswer.question}</h2>
					 ${ListCorrectAnswer.option1}
					</br>
					 <img alt="" src="Image/Correct.png"> ${ListCorrectAnswer.option2}
					</br>
					 ${ListCorrectAnswer.option3}
					</br>
					 ${ListCorrectAnswer.option4}
					</br>
	
				</c:if>
				
				<c:if test="${ListanswerUser.answer == 'C'}">
					<h2>${ListCorrectAnswer.number}. ${ListCorrectAnswer.question}</h2>
					  ${ListCorrectAnswer.option1}
					</br>
					 <img alt="" src="Image/Correct.png"> ${ListCorrectAnswer.option2}
					</br>
					<img alt="" src="Image/Wrong.png"> ${ListCorrectAnswer.option3}
					</br>
					 ${ListCorrectAnswer.option4}
					</br>
	
				</c:if>
				
				<c:if test="${ListanswerUser.answer == 'D'}">
					<h2>${ListCorrectAnswer.number}. ${ListCorrectAnswer.question}</h2>
					  ${ListCorrectAnswer.option1}
					</br>
					 <img alt="" src="Image/Correct.png"> ${ListCorrectAnswer.option2}
					</br>
					 ${ListCorrectAnswer.option3}
					</br>
					<img alt="" src="Image/Wrong.png"> ${ListCorrectAnswer.option4}
					</br>
	
				</c:if>
			</c:if>
			
			<c:if test="${ListCorrectAnswer.correctanswer == 'C'}">
				<c:if test="${ListanswerUser.answer == 'A'}">
					<h2>${ListCorrectAnswer.number}. ${ListCorrectAnswer.question}</h2>
					 <img alt="" src="Image/Wrong.png"> ${ListCorrectAnswer.option1}
					</br>
					 ${ListCorrectAnswer.option2}
					</br>
					<img alt="" src="Image/Correct.png"> ${ListCorrectAnswer.option3}
					</br>
					 ${ListCorrectAnswer.option4}
					</br>
	
				</c:if>
				
				<c:if test="${ListanswerUser.answer == 'B'}">
					<h2>${ListCorrectAnswer.number}. ${ListCorrectAnswer.question}</h2>
					  ${ListCorrectAnswer.option1}
					</br>
					 <img alt="" src="Image/Wrong.png"> ${ListCorrectAnswer.option2}
					</br>
					 <img alt="" src="Image/Correct.png"> ${ListCorrectAnswer.option3}
					</br>
					 ${ListCorrectAnswer.option4}
					</br>
	
				</c:if>
				
				<c:if test="${ListanswerUser.answer == 'C'}">
					<h2>${ListCorrectAnswer.number}. ${ListCorrectAnswer.question}</h2>
					${ListCorrectAnswer.option1}
					</br>
					 ${ListCorrectAnswer.option2}
					</br>
					<img alt="" src="Image/Correct.png"> ${ListCorrectAnswer.option3}
					</br>
					 ${ListCorrectAnswer.option4}
					</br>
	
				</c:if>
				
				<c:if test="${ListanswerUser.answer == 'D'}">
					<h2>${ListCorrectAnswer.number}. ${ListCorrectAnswer.question}</h2>
					 ${ListCorrectAnswer.option1}
					</br>
					 ${ListCorrectAnswer.option2}
					</br>
					 <img alt="" src="Image/Correct.png"> ${ListCorrectAnswer.option3}
					</br>
					<img alt="" src="Image/Wrong.png"> ${ListCorrectAnswer.option4}
					</br>
	
				</c:if>
			</c:if>
			
			<c:if test="${ListCorrectAnswer.correctanswer == 'D'}">
				<c:if test="${ListanswerUser.answer == 'A'}">
					<h2>${ListCorrectAnswer.number}. ${ListCorrectAnswer.question}</h2>
					<img alt="" src="Image/Wrong.png">s ${ListCorrectAnswer.option1}
					</br>
					 ${ListCorrectAnswer.option2}
					</br>
					 ${ListCorrectAnswer.option3}
					</br>
					<img alt="" src="Image/Correct.png"> ${ListCorrectAnswer.option4}
					</br>
	
				</c:if>
				
				<c:if test="${ListanswerUser.answer == 'B'}">
					<h2>${ListCorrectAnswer.number}. ${ListCorrectAnswer.question}</h2>
					 ${ListCorrectAnswer.option1}
					</br>
					 <img alt="" src="Image/Wrong.png"> ${ListCorrectAnswer.option2}
					</br>
					 ${ListCorrectAnswer.option3}
					</br>
					 <img alt="" src="Image/Correct.png"> ${ListCorrectAnswer.option4}
					</br>
	
				</c:if>
				
				<c:if test="${ListanswerUser.answer == 'C'}">
					<h2>${ListCorrectAnswer.number}. ${ListCorrectAnswer.question}</h2>
					 ${ListCorrectAnswer.option1}
					</br>
					 ${ListCorrectAnswer.option2}
					</br>
					<img alt="" src="Image/Wrong.png"> ${ListCorrectAnswer.option3}
					</br>
					<img alt="" src="Image/Correct.png"> ${ListCorrectAnswer.option4}
					</br>
	
				</c:if>
				
				<c:if test="${ListanswerUser.answer == 'D'}">
					<h2>${ListCorrectAnswer.number}. ${ListCorrectAnswer.question}</h2>
					 ${ListCorrectAnswer.option1}
					</br>
					 ${ListCorrectAnswer.option2}
					</br>
					 ${ListCorrectAnswer.option3}
					</br>
					<img alt="" src="Image/Correct.png"> ${ListCorrectAnswer.option4}
					</br>
	
				</c:if>
			</c:if>
		</c:if>
		</c:forEach>
	
	</c:forEach>
</body>
</html>