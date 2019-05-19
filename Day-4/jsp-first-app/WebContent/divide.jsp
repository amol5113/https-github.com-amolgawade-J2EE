<%@ page import="java.util.Date" %>
<%@ page errorPage="error.jsp" %>
<%!
	private int res;
	void div(int i,int j){
		res = i/j;
	}
%>
<%
	String p1 = request.getParameter("num1");
	String p2 = request.getParameter("num2");
	int i = Integer.parseInt(p1);
	int j = Integer.parseInt(p2);
	div(i,j);
%>
<%=res%>
<br>
<%=new Date()%>