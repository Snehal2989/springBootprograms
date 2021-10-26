<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="reg">
<pre>
Name:<input type="text" name="name">
Mobilenum:<input type="text" name="mbno">
Username:<input type="text" name="login.Username">
Password:<input type="text" name="login.Password">
Role<select name=r1.rname id=rname>
<option>Select</option>
<option value="Admin">Admin</option>
<option value="Trainer">Trainer</option>
<option value="Student">Student</option>
</select>
<input type="submit" value="Register"> 
</pre>
</form>
</body>
</html>