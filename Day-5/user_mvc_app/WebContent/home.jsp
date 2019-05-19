<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<jsp:useBean id="user" class="com.cdac.dto.User" scope="session" ></jsp:useBean>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="reg.jsp" method="post" >
		<table align="center" style="background-color: gray;color: #ffffff" >
			<tr>
				<td>
					Welcome ! <%=user.getUserName() %>
				</td>
			</tr>
			<tr>
				<td>
					<a href="user_list.jsp" >User List</a>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>