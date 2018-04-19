<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Students</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>

</head>

<body>

	<input type="hidden" id="id"> First Name: <input type="text" id="first_name" required="required" name="first_name">
	
	<br> Last Name: <input type="text" id="last_name" required="required" name="last_name">
	
	<br> Genter: <input type="text" id="gender" required="required" name="gender">
	
	<br> Birthday: <input type="date" id="birthday" required="required" name="birthday">
	<br>
	<!-- <button onclick="submit();">Submit</button> -->



	<table id="table" border=1>
		<tr>
			<th>Fisrt Name</th>
			<th>Last Name</th>
			<th>Genter</th>
			<th>Birthday</th>
		</tr>
	</table>

</body>
</html>