<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%ServletContext contextChucNang = getServletContext();
    	contextChucNang.setAttribute("chucNang", "Them");
    %>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Them tai khoan</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="indexcss.css">
</head>
<body>

<div class="container2">
  <h2 class="title-color" align="center">Thêm thông tin thành viên</h2>
  <form class="border-2" action="XuLyThemSuaXoaController" method="post">
    <div>
      <label class="style_buton" for="email">Họ:</label>
      <div class="col-sm-10">
        <input type="text" class="textarea" id="email" name="ho" placeholder="Nhập vào họ" >
      </div>
    </div>
    <div>
      <label class="style_buton" for="pwd">Tên:</label>
      <div>          
        <input type="text" class="textarea" id="pwd" name="ten" placeholder="Nhập vào tên">
      </div>
    </div>
  <div>
      <label class="style_buton" for="pwd">Địa chỉ:</label>
      <div>          
        <input type="text" class="textarea" class="form-control" id="pwd" name="tk" placeholder="Nhập vào tài khoản" >
      </div>
    </div>
    <div class="form-group">        
      <div align="center">
        <button type="submit" class="textarea-button">Thêm</button>
      </div>
    </div>
  </form>
</div>

</body>
</html>