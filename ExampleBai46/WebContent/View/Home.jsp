<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home Page</title>
	<script type="text/javascript">
		function Validate(){
			var username = document.myform.username.value;
			var password = document.myform.password.value;
			if(username == ""){
				document.getElementById("errorname").innerHTML="Không để trống username";
			}else {
				document.getElementById("errorname").innerHTML="";
			}
			if(password == ""){
				document.getElementById("errorpassword").innerHTML = " Không để trống Password";
			} else {
				document.getElementById("errorpassword").innerHTML = "";
				if(password.length <= 6){
					document.getElementById("errorpassword").innerHTML = "Pass nhỏ hơn 6";
				} else {
					document.getElementById("errorpassword").innerHTML = "";
				}
			}
			
		}
		
		
	</script>
</head>
<body>
	<form name = "myform">
	
		<input type = "text" name = "username" onkeyup = "Validate()"/>
		<p id ="errorname"></p>
		</br>
		<input type = "password" name = "password" onkeyup = "Validate()"/>
		<p id ="errorpassword"></p>
		</br>
		<input type = "button" value = "Validate" onclick = "Validate()"/>
		
	</form>
</body>
</html>