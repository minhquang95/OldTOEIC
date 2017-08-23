<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Conmment</title>

<script type="text/javascript">
	
	function Comment() {
		var xhttp;
		var username = document.myform.username.value;
		var content = document.myform.content.value;
		var url = "CommentController?content="+content+"&username="+username;
		if(window.XMLHttpRequest){
			xhttp = new XMLHttpRequest();
		} else {
			xhttp = new ActiveXObject("Microsoft.XMLHTTP");
		}
	
		xhttp.onreadystatechange = function () {
			if(xhttp.readyState == 4){
				var data = xhttp.responseText;
				document.getElementById("mycomment").innerHTML=data;
			}
		}
		xhttp.open("POST",url,true);
		xhttp.send();
	}

</script>

</head>
<body>
	<form name = "myform">
	
		Username : <input type = "text" name = "username"/>
		</br>
		</br>
	
		<textarea style ="width: 300px;height:100px" name = "content">
		
		
		</textarea>
		</br>
		</br>
		<input type = "button" value = " Hiển thị" onclick ="Comment()"/>
		
		<div id = "mycomment"></div>
	
	</form>
</body>
</html>