<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form name="index" method="post" action="insert">
 <label><b>User Name</b></label>
<input type="text" placeholder="Enter Username" name="name" required> <br>
  <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="pass" required> <br>
 
                <button type="submit">Login</button>
                <a href="student/all">view</a>
                <a href="student/byname">byname</a>
                <a href="student/bypass">bypass</a>
                <a href="student/byid">byid</a>
                

</form>

</body>
</html>