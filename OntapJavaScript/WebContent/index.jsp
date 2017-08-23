<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Example JavaScript</title>
	<script type="text/javascript">
	
		//alert("Minh Quang");
		//document.write("Minh Quang");
		//var number = 10;
		//var str = "Minh Quang";
		//var check = false;
		/*var score = 6;
		if(score > 8){
			alert("Bạn được học sinh giỏi");
		}else{
			alert("Bạn được học sinh khá");
		}*/
		
		function Xuatthongtin(){
			var name = document.myform.name.value;
			if(name==null || name == ""){
				alert("Không được để trống");
				return false;
				
			}
			
		}
		
	
	</script>
</head>
<body>
<form action = "Demo" method = "POST" onsubmit=" return Xuatthongtin()" name = "myform">
		<input type = "text" name = "name"/>
		<input type = "submit" value = "Xuatthongtin">
	</form>
</body>
</html>