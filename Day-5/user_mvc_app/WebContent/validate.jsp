<%@page import="com.cdac.serv.UserServiceImple"%>
<%@page import="com.cdac.serv.UserService"%>
<jsp:useBean id="user" class="com.cdac.dto.User" scope="session" ></jsp:useBean>
<jsp:setProperty property="*" name="user"/>

<%
	UserService userService = new UserServiceImple();
	boolean b = userService.login(user);
	if(b){
		response.sendRedirect("home.jsp");
	}else{
		response.sendRedirect("index.jsp?errorMsg=wrong info");
	}
%>