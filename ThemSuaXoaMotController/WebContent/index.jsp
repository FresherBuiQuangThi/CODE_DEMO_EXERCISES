<%@page import="java.sql.ResultSet"%>
<%@page import="model.MyConnectDB"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<link rel="stylesheet" href="indexcss.css">
	<title>Demo Connect DTB</title>
</head>
<body>
	<div class="container"> 
		<h2 align="center" class="title-color">QUẢN LÝ THÔNG TIN SINH VIÊN</h2> 
		<div> 
			<div > 
				<a href="ThemTaiKhoan.jsp"><button class="text_color_button">Thêm thành viên</button></a>
				<div> 
					<div> 
						<h3 class="panel-title">Danh sách thành viên</h3> 		
					</div> 
					<%
					MyConnectDB con = new MyConnectDB();
					//ResultSet rs = con.chonDuLieuTuDTB("select * from ThanhVien");
					ResultSet rs = con.chonDuLieuTuDTB("select * from quanlysinhvien.thanhvien");
					%>
					<table class="border" id="dev-table"> 
						<thead> 
							<tr> 
								<th>STT</th> 
								<th>Họ</th> 
								<th>Tên</th> 
								<th>Địa chỉ</th> 
								<th>Xóa</th>
								<th>Sửa</th>
							</tr> 
						</thead> 
						<tbody>
						<%int count=0;
						while(rs.next()){count++;
						%>
						
						<tr> 
							<td><%=count %></td> 
							<td><%=rs.getString(2) %></td> 
							<td><%=rs.getString(3) %></td> 
							<td><%=rs.getString(4) %></td> 
							<td><a href="XuLyThemSuaXoaController?id=<%=rs.getString(1)%>&chucNang=Xoa"><button class="style_buton2">Xóa</button></a></td>
							<td><a href="SuaTaiKhoan.jsp?id=<%=rs.getString(1)%>"><button class="style_buton2">Sửa</button></a></td>
						</tr> 
						<%
						}
						%>
						
					</tbody></table> 
				</div> 
			</div> 
		</div>
	</div>
	
	</body>
	</html>