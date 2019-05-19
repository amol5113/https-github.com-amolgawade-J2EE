<%@page import="dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean id="user" class="dto.User" scope="session" ></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:getProperty property="userId" name="user"/><br>
	<jsp:getProperty property="userName" name="user"/><br>
	<jsp:getProperty property="userPass" name="user"/><br>
	<jsp:getProperty property="userRole" name="user"/><br>
</body>
</html>
