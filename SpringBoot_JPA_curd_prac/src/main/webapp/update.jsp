<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update">
<pre>
<input type="hidden" value="${u.uid}" name="uid">
<label>Name</label>      			 <!--  bz of i/p tag only form will open in updating form -->
<input type="text" name="name" value="${u.name}">
<label>Username</label>
<input type="text" name="uname" value="${u.uname}">
<label>Password</label>
<input type="text" name="pass" value="${u.pass}">
<label>Email</label>
<input type="text" name="email" value="${u.email}">
<label>Mobile</label>
<input type="text" name="mobile" value="${u.mobile}">
<input type="submit" value="update">
</pre>

<!-- if u want to open in updating mode then following code is there -->

</form>
</body>
</html>