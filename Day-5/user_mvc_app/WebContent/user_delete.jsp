<%@page import="com.cdac.serv.UserServiceImple"%>
<%@page import="com.cdac.serv.UserService"%>
<%
	String p = request.getParameter("userId");
	int userId = Integer.parseInt(p);
	UserService userService = new UserServiceImple();
	userService.removeUser(userId);
	response.sendRedirect("user_list.jsp");
%>