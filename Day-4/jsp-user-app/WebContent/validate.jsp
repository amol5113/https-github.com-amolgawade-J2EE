<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
<%
	String uname = request.getParameter("userName");
	String upass = request.getParameter("userPass");
	
	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/cdac","root","cdac");
		PreparedStatement s = con.prepareStatement(
				"select * from user where email = ? and user_pass = ?");
		s.setString(1, uname);
		s.setString(2, upass);
		ResultSet rs = s.executeQuery();
		if(rs.next()){
			response.sendRedirect("home.jsp");
		}else{
			response.sendRedirect("index.jsp?errorMsg=wrong information");
		}
	//	con.close();
	}catch(ClassNotFoundException | SQLException e){
		e.printStackTrace();
	}
	
%>