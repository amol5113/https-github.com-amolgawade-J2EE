package p01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main16 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","cdac");
			con.setAutoCommit(false);
		    Statement st = con.createStatement();
		    int i = st.executeUpdate("insert into emp values(108,'hari',9080.50)");
		       System.out.println(i+" record inserted");
		    i = st.executeUpdate("insert into emp values(109,'hari',9080.50)");
		    System.out.println(i+" record inserted");
		    con.commit();
		 //   con.close();
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		

	}

}
