<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
	
	<script type="text/javascript">
	
		function Display() {
			var xhttp;
			var name = document.myform.name.value;
			var url = "HomeController?name="+name;
			if(window.XMLHttpRequest){
				xhttp = new XMLHttpRequest();
			} else {
				xhttp = new ActiveXObject("Microsoft.XMLHTTP");
			}
			
			xhttp.onreadystatechange = function () {
				if(xhttp.readyState == 4){
					var data = xhttp.responseText;
					document.getElementById("ketqua").innerHTML=data;
				}
			}
			xhttp.open("POST",url,true);
			xhttp.send();
		}
	
	</script>

<body>

	<p id="ketqua"></p>
	<form name = "myform">
	
		<input type = "text" name = "name"/>
		</br>
		<input type = "button" value = "Display" onclick = "Display()"/>
	
	</form>
</body>
</html>