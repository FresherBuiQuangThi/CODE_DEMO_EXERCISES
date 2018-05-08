<%@page import="model.MyConnectDB"%>
<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%ServletContext contextChucNang = getServletContext();
    	contextChucNang.setAttribute("chucNang", "Sua");
    	ServletContext contextID = getServletContext();
    	contextID.setAttribute("id", request.getParameter("id"));
    %>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Sửa thông tin thành viên</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="indexcss.css">
</head>
<body>
	<div class="container2">
		<h2 align="center" class="title-color">Sửa thông tin thành viên</h2>
		<%String id = request.getParameter("id");
  		ResultSet rs = new MyConnectDB().chonDuLieuTuDTB("select * from quanlysinhvien.thanhvien where id='"+id+"'");
  		//ResultSet rs = new MyConnectDB().chonDuLieuTuDTB("select * from ThanhVien where id='"+id+"'");
  		while(rs.next()){
  %>
		<form class="border-2" action="XuLyThemSuaXoaController" method="post">
			<div>
				<label class="style_buton" for="email">Họ:</label>
				<div>
					<input type="text" class="textarea" id="email" name="ho"
						placeholder="Nhập vào họ"
						value="<%
       	 out.print(rs.getString(2));
        %>">
				</div>
			</div>
			<div>
				<label class="style_buton" for="pwd">Tên:</label>
				<div>
					<input type="text" class="textarea" id="pwd" name="ten"
						placeholder="Nhập vào tên"
						value="<%
        	 	 out.print(rs.getString(3));
        %>">
				</div>
			</div>
			<div>
				<label class="style_buton" for="pwd">Địa chỉ:</label>
				<div class="col-sm-10">
					<input type="text" class="textarea" id="pwd" name="tk"
						placeholder="Nhập vào tài khoản"
						value="<%
        	 	 out.print(rs.getString(4));
        %>">
				</div>
			</div>
			<%} %>
			<div>
				<div align="center">
					<button type="submit" class="textarea-button">Sửa</button>
				</div>
			</div>
		</form>
	</div>

</body>
</html>