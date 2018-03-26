<%@ page pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Java Server</title>
</head>

<body>
	<h1>Nhập tên và địa chỉ nhân viên để thực hiện phương thức doGet()</h1>
	
	<a href="index.html?name=Bùi Quang Thi&diachi=28 Nhật Tảo"> Lấy tên & Địa chỉ</a>
	<form action="index.html">
		Nhập tên:<br/><input name="name"><br/>
		Nhập địa chỉ:<br/><input name ="diachi"/> <br/><br/>
		<button formmethod="get">Gửi</button>
	</form>
	
</body>
</html>