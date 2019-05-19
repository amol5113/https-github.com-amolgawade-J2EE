<%@page import="com.cdac.serv.UserServiceImple"%>
<%@page import="com.cdac.serv.UserService"%>
<jsp:useBean id="user" class="com.cdac.dto.User" ></jsp:useBean>
<jsp:setProperty property="*" name="user"/>

<%
	UserService userService = new UserServiceImple();
	userService.modifyUser(user);
	response.sendRedirect("user_list.jsp");
%>