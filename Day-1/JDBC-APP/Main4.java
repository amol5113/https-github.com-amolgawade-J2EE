package p01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main4 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","cdac");
		    Statement st = con.createStatement();
		    ResultSet rs = st. executeQuery(
		    		"select * from emp");
		    while(rs.next()) {
		    	System.out.println(
		    rs.getInt("emp_id")+" "+rs.getString("emp_name")+" "+rs.getFloat("basic_salary"));
		    }
		    con.close();
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		

	}

}
