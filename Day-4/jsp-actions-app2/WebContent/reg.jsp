
<jsp:useBean id="user" class="dto.User" scope="session" ></jsp:useBean>

<jsp:setProperty name="user" param="uid" property="userId" />
<jsp:setProperty name="user" param="uname" property="userName" />
<jsp:setProperty name="user" param="upass" property="userPass" />
<jsp:setProperty name="user" param="urole" property="userRole" />

<% response.sendRedirect("info.jsp"); %>
