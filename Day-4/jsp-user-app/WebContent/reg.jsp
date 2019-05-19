<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%
	String uname = request.getParameter("userName");
	String upass = request.getParameter("userPass");
	String urole = request.getParameter("userRole");
	
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/cdac","root","cdac");
		PreparedStatement s = con.prepareStatement(
				"insert into user(email,user_pass,user_role) values(?,?,?)");
		s.setString(1, uname);
		s.setString(2, upass);
		s.setString(3, urole);
		int i = s.executeUpdate();
	//	con.close();
	}catch(ClassNotFoundException | SQLException e){
		e.printStackTrace();
	}
	
	response.sendRedirect("index.jsp");
	
%>