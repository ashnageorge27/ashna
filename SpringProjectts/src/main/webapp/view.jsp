<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${not empty list }">
<table>
<tr>
<th>ID</th>
<th>NAME</th>
<th>PASSWORD</th>
</tr>
<c:forEach items="${list}" var="list">
<tr>
<td>${list.id}</td>
<td>${list.name}</td>
<td>${list.pass}</td>
<td><a href="editlist/${list.id}">Edit</a></td>  
<td><a href="deletelist/${list.id}">Delete</a></td> 
</tr>
</c:forEach>
</table>
</c:if>



</body>
</html>
