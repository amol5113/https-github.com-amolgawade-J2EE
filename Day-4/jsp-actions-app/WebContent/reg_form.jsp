<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
				<td><input type="text" name="uid" placeholder="Enter user name" ></td>
			</tr>
			<tr>
				<td><input type="text" name="uname" placeholder="Enter user name" ></td>
			</tr>
			<tr>
				<td><input type="password" name="upass" placeholder="Enter password" ></td>
			</tr>
			<tr>
				<td>
					<select name="urole" >
						<option value="admin" >Admin</option>
						<option value="operator" >Operator</option>
					</select>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Register" ></td>
			</tr>

		</table>
	</form>
</body>
</html>