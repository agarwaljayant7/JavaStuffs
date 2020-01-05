<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	if(session.getAttribute("username")==null)
		response.sendRedirect("Index.jsp");
%>

Welcome ${username}



<form name="OTPForm" action="OTP">
<input type="submit" value="Join as Audeince" name="Join as Audeince">
</form>



<form name="How to Play" action="HowToPlay">
<input type="submit" value="How to play" name="How to play">
</form>
  

</nbsp>
<form name="Start playing" action="StartPlaying">
<input type="submit" value="Start playing" name="Start playing">
</form>
<br><br></br></br></br>



<form action=Logout>
<input type="submit" value="Logout" name="submit"/>
</form>
</body>
</html>