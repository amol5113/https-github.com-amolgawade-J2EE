<%@page import="com.cdac.dto.User"%>
<%@page import="com.cdac.serv.UserServiceImple"%>
<%@page import="com.cdac.serv.UserService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
	String p = request.getParameter("userId");
	int userId = Integer.parseInt(p);
	UserService userService = new UserServiceImple();
	User usr = userService.getUserById(userId);
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="user_update.jsp" method="post" >
		<table align="center" style="background-color: gray;color: #ffffff" >
			<tr>
				<td><input type="text" name="userId" readonly="readonly" value="<%=usr.getUserId()%>" ></td>
			</tr>
			<tr>
				<td><input type="text" name="userName" value="<%=usr.getUserName()%>" ></td>
			</tr>
			<tr>
				<td><input type="password" name="userPass" value="<%=usr.getUserPass()%>" ></td>
			</tr>
			<tr>
				<td>
					<select name="userRole" >
					
					<%
						String urole = usr.getUserRole();
						if(urole.equals("admin")){
					%>
					
						<option value="admin" >Admin</option>
						<option value="operator" >Operator</option>
					
					<% }else{ %>
						<option value="operator" >Operator</option>
						<option value="admin" >Admin</option>
						
					<% } %>	
						
					</select>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Update" ></td>
			</tr>
			<tr>
				<td><a href="index.jsp" >Back</a></td>
			</tr>
		</table>
	</form>
</body>
</html>