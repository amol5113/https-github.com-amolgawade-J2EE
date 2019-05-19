package p01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main5 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","cdac");
		    Statement st = con.createStatement();
		    int i = st.executeUpdate(
		    "delete from emp where emp_id = 101");
		    System.out.println(i+" record deleted");
		    con.close();
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		

	}

}
