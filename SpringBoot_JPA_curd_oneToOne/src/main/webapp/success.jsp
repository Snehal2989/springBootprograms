<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function del()
{
alert("Delete data");
document.fn.action="del";
document.fn.submit();
}

function et()
{
alert("Edit data");
document.fn.action="edit";
document.fn.submit();
}
</script>
</head>
<body>
Welcome !...
 <form name="fn">
 <table border="2">
<tr> 
<th>Select</th>
<th>FirstName</th>
<th>LastName</th>
<th>Age</th>
<th>Email</th>
<th>FacultyId</th>
<th>FacultyName</th>
</tr>

<c:forEach items="${data1}"  var="s">
<tr>
<td><input type="radio" name="sid" value="${s.sid}"></td>
<td><c:out value="${s.sname}"></c:out></td>
<td><c:out value="${s.slast}"></c:out></td>
<td><c:out value="${s.age}"></c:out></td>
<td><c:out value="${s.email}"></c:out></td>
<td><c:out value="${s.faculty.fid}"></c:out></td>
<td><c:out value="${s.faculty.fname}"></c:out></td>
//<td>st.getSname()</td>
</tr>
</c:forEach>
</table> 
</form>
<input type="button" value="Delete" onclick="del()"> 
<input type="button" value="Edit" onclick="et()">
</body>
</html>