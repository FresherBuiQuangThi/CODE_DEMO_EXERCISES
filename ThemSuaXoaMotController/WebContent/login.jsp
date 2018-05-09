<%@page import="model.MyConnectDB"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%ServletContext contextChucNang = getServletContext();
    	contextChucNang.setAttribute("chucNang", "Login");
    	ServletContext contextID = getServletContext();
    	contextID.setAttribute("user", request.getParameter("user"));
    %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Login</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="indexcss.css">
</head>

<body>
	<div class="container"> 
		<h2 align="center" class="title-color">QUẢN LÝ ĐĂNG NHẬP</h2> 
	</div>
	
	<form class="border-2" action="XuLyDangNhap" method="post">
		<div>
			<label class="style_buton" for="email">User:</label>
			<div>
				<input type="text" class="textarea" id="email" name="user" placeholder="Nhập vào user">
			</div>
		</div>
		<div>
			<label class="style_buton" for="email">Password:</label>
			<div>
				<input type="text" class="textarea" id="email" name="pass" placeholder="Nhập vào password">
			</div>
			<div align="center">
				<button type="submit" class="textarea-button">Login</button>
			</div>
		</div>
	</form>
</body>
</html>