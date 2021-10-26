<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
     <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="d"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function edt()
{
	alert("in edit")
	document.fn.action="edit"
	document.fn.submit();
}

function del()
{
	alert("in delete")
	document.fn.action="delete"
	document.fn.submit();
}
</script>

</head>
<body>
<form name="fn">
<table border="2px">
<tr>
<th>Select</th>
<th>Name</th>
<th>Username</th>
<th>Password</th>
<th>Email</th>
<th>Mobile</th>
<tr>

<d:forEach items="${data}" var="u">
<tr>
<td>
<input type="radio" name="uid" value="${u.uid}"></td>
<td><d:out value="${u.name}"></d:out></td>
<td><d:out value="${u.uname}"></d:out></td>
<td><d:out value="${u.pass}"></d:out></td>
<td><d:out value="${u.email}"></d:out></td>
<td><d:out value="${u.mobile}"></d:out></td>
</tr>
</d:forEach>

</table>
</form>
<input type="button" value="Edit" onclick="edt()">
<input type="button" value="Delete" onclick="del()">
</body>
</html>