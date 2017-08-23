<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Search Page</title>
	<script type="text/javascript">
	
		function Search(){
			var name = document.myform.name.value;
			var xhttp;
			if (name !=""){
				var url = "SearchController?name="+name;
				if(window.XMLHttpRequest){
					xhttp = new XMLHttpRequest();
				}else{
					xhttp = new ActiveXObject("Microsoft.XMLHTTP");
				}
				
				xhttp.onreadystatechange = function(){
					if(xhttp.readyState == 4){
						var data = xhttp.responseText;
						document.getElementById("searchresult").innerHTML = data;
					}
				}
				
				xhttp.open("POST",url,true);
				xhttp.send();
			} else {
				document.getElementById("searchresult").innerHTML = "";
			}
			
		}	
			
		
	</script>
</head>
<body>
	<form name = "myform">
	
		<input type = "text" name = "name" onkeyup="Search()">
		</br>
		
	</form>
	
	<div id = "searchresult"></div>
</body>
</html>