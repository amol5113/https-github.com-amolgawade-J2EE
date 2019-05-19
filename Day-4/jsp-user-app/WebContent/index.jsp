<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%
	String emsg = request.getParameter("errorMsg");
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="validate.jsp" method="post" >
		<table align="center" style="background-color: gray;color: #ffffff" >
			<tr>
				<td><input type="text" name="userName" placeholder="Enter user name" ></td>
			</tr>
			<tr>
				<td><input type="password" name="userPass" placeholder="Enter password" ></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login" ></td>
			</tr>
			<tr>
				<td><a href="reg_form.jsp" >Sign Up</a></td>
			</tr>
			<tr>
				<td><%=(emsg!=null)?emsg:""%></td>
			</tr>
		</table>
	</form>
</body>
</html>