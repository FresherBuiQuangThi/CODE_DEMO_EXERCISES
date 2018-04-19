<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Students</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>

</head>

<body onload="load();">

	<input type="hidden" id="id"> 
	<br>First Name: 
	<br><input type="text" id="first_name" required="required" name="first_name">
	
	<br> Last Name:
	<br><input type="text" id="last_name" required="required" name="last_name">
	
	<br> Genter:
	<br><input type="text" id="gender" required="required" name="gender">
	
	<br> Birthday: 
	<br><input type="date" id="birthday" required="required" name="birthday">
	<br>
	<br><button onclick="submit();">Submit</button><br><br>

	<table id="table" border=1>
		<tr>
			<th>Fisrt Name</th>
			<th>Last Name</th>
			<th>Genter</th>
			<th>Birthday</th>
		</tr>
	</table>
	
	
	
	<script type="text/javascript">
	data = "";
	submit = function(){
			$.ajax({
				url:'saveOrUpdate',
				type:'POST',
				data:{id:$("#id").val(), first_name:$('#first_name').val(), last_name:$('#last_name').val(), gender:$('#gender').val(), birthday:$('#birthday').val() },
				success: function(response){
						alert(response.message);
						load();		
				}				
			});			
	}
	
	delete_ = function(id){		 
		 $.ajax({
			url:'delete',
			type:'POST',
			data:{id:id},
			success: function(response){
					alert(response.message);
					load();
			}				
		});
	}
	
	edit = function (index){
		$("#id").val(data[index].id);
		$("#first_name").val(data[index].first_name);
		$("#last_name").val(data[index].last_name);
		$("#gender").val(data[index].gender);
		$("#birthday").val(data[index].birthday);
	}
	
	load = function(){	
		$.ajax({
			url:'list',
			type:'POST',
			success: function(response){
					data = response.data;
					$('.tr').remove();
					for(i = 0; i<response.data.length; i++){					
						$("#table").append("<tr class='tr'> <td> "+response.data[i].first_name+" </td> <td> "+response.data[i].last_name+" </td> <td> "+response.data[i].gender+" </td>  <td> "+response.data[i].birthday+" </td>     <td> <a href='#' onclick= edit("+i+");> Edit </a>  </td> </td> <td> <a href='#' onclick='delete_("+response.data[i].id+");'> Delete </a>  </td> </tr>");
					}			
			}				
		});
		
	}	
	</script>

</body>
</html>