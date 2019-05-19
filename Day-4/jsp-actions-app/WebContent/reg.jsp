<%@page import="dto.User"%>
<%
	User user = new User();

	String ud = request.getParameter("uid");
	int userId = Integer.parseInt(ud);
	String userName = request.getParameter("uname");
	String userPass = request.getParameter("upass");
	String userRole = request.getParameter("urole");
	
	user.setUserId(userId);
	user.setUserName(userName);
	user.setUserPass(userPass);
	user.setUserRole(userRole);
	
	session.setAttribute("usr", user);
	
	response.sendRedirect("info.jsp");
	
	
%>