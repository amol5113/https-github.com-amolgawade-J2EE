package serv;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ValidateServlet")
public class ValidateServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname = request.getParameter("userName");
		String upass = request.getParameter("userPass");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","cdac");
			PreparedStatement s = con.prepareStatement("select * from user where user_name = ? and user_pass = ?");
			s.setString(1, uname);
			s.setString(2, upass);
			ResultSet rs = s.executeQuery();
			if(rs.next()) {
				response.sendRedirect("HomeServlet");
			}else {
				response.sendRedirect("index.html");
			}
			rs.close();
			s.close();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		
		
	}

}
