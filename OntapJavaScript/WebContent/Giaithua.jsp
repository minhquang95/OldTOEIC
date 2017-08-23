<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Giai Thua</title>
<script type="text/javascript">
	
	function Tinhgaithua() {
		var n = document.myform.socantinh.value;
		var number  = parseInt(n); 
		var i=1;
		var kq=1;
		while(i<=number){
			kq=kq*i;
			i++;
		}
		document.getElementById("ketqua").innerHTML = "Kết quả" + kq;
	}

</script>
</head>
<body>
	<div id = "ketqua"></div>
	<form name = "myform">
		Nhập số : <input type ="text" name = "socantinh"/>
		<input type = "button" value = "Tính Giai Thừa" onclick="Tinhgaithua()"/> 
	</form>
</body>
</html>