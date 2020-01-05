<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KBC</title>

</head>
<body>
<h1> <center>Kaun banega Crorepati</center></h1>
	<form name="kbcForm" action="Results" method="post"> 
		<table> 
			<tbody>
				<tr> 
					<td> First Name: </td>
					<td> <input type="text" name="first" value="" size="50"/></td>
				</tr>
				<tr>
					<td> Last Name: </td>
					<td><input type="text" name="last" value="" size="50"/></td>
				</tr>
				<tr>
					<td> Email: </td>
					<td><input type="text" name="email"	value="" size="50"/></td>
				</tr>
				<tr>
					<td>Gender: </td>
					<td> 
						<input type="radio" name="gender" value="Male" />Male
						<input type="radio" name="gender" value="Female"/>Female
					</td>
				</tr>
				<tr>
					<td> Enter username:</td>
					<td> 
						<input type="text" name="uname" value="username"/>
					</td>
				</tr>
				<tr>
					<td> Enter password:</td>
					<td> 
						<input type="password" name="pass" value=""/>
					</td>
				</tr>
				
				<tr> 
					<td> Where did you born	</td>
					<td> 
						<select name="state">
							<option value=" "> Choose a state...</option>
							<option value="JH">Jharkhand</option>
							<option value="KA">Karnataka</option>
							<option value="DL">Delhi</option>
							<option value="other">Other</option>
						</select>
						</td>
					</tr>
			
			</tbody>
		</table>
		
		<input type="reset" value="Clear" name="clear"/>
		<input type="submit" value="Submit" name="submit"/>


</form>

</body>

</html>