
<jsp:useBean id="user" class="dto.User" scope="session" ></jsp:useBean>

<jsp:setProperty name="user" property="*" />


<% response.sendRedirect("info.jsp"); %>
