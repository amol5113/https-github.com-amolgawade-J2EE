<%@page import="com.cdac.springmvcwebapp.dto.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%
 	User user  = (User)session.getAttribute("user");
 
 %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Welcome ! <%=user.getUserName() %></h3>	
	<a href="user_list.htm" >user list</a>
</body>
</html>