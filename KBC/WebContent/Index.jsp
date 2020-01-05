<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>KBC</title>

</head>
<body>
	<h1>
		<center>ABC</center>
	</h1>

	<form name="kbcForm" action="Login" method="post">
		<table>
			<tbody>
				<tr>
					<td>Login:</td>
				</tr>
				<table border="1">
					<tr>
						<td>User Name:</td>
						<td><input type="text" name="uname" value="" size="30" /></td>

					</tr>
					<tr>
						<td>Password:</td>
						<td><input type="password" name="pass" value="" size="30" /></td>

					</tr>
					</tbody>
				</table>

				<br>
				<input type="submit" value="Login" name="submit" />
				<br>
				<br>
				<br>
				<tr>
					<td>New User:</td>
				</tr>
		</table>

	</form>

	<form name="signupForm" action="SignUp">
		<input type="submit" value="Sign Up" name="submit" />
	</form>

</body>

</html>