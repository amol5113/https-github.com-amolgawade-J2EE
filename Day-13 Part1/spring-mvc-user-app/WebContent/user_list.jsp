<%@page import="com.cdac.springmvcwebapp.dto.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%
 	List<User> userList = (List<User>)request.getAttribute("ul");
 %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table>
		<%
			for(User u : userList){
		%>
			<tr>
				<td><%=u.getUserId() %></td>
				<td><%=u.getUserName() %></td>
				<td><%=u.getUserPass() %></td>
				<td><%=u.getUserRole() %></td>
				<td><a href="delete_user.htm?userId=<%=u.getUserId() %>" >Delete</a></td>
				<td><a href="select_user.htm?userId=<%=u.getUserId() %>" >Select</a></td>
			</tr>
		<% }  %>
	</table>
</body>
</html>