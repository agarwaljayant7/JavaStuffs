<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Welcome Page</title>
</head>

<body>

<h1>Welcome ${fname }</h1>
<h2> Your user id is: ${user}</h2>


<table border="1"> 
	
			<tbody>
				<tr> 
					<td> First Name: </td>
					<td>${fname }</td>
				</tr>
				<tr>
					<td> Last Name: </td>
					<td>${lname}</td>
				</tr>
				<tr> 
					<td> Email: </td>
					<td>${email}</td>
				</tr>
					
				<tr> 
					<td> Gender: </td>
					<td>${gen}</td>
				</tr>
					
				<tr> 
					<td> State: </td>
					<td>${st}</td>
				</tr>
					
			</tbody>
</table>
					



</body>
</html>