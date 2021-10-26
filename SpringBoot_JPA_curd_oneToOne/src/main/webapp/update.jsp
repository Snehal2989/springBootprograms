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
<input type="hidden" value="${s1.sid}" name="sid">
<label>Firstname</label>
<input type="text" name="sname" value="${s1.sname}">
<label>Lastname</label>
<input type="text" name="slast" value="${s1.slast}">
<label>Age</label>
<input type="text" name="age" value="${s1.age}">
<label>E-mail</label>
<input type="text" name="email" value="${s1.email}">
<label>Facultyname</label>
<input type="text" placeholder="fname" name="faculty.fname" value="${s1.faculty.fname}">
<input type="submit" value="Update">
</pre>
</form>
</body>
</html>