package p01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","cdac");
		    Statement st = con.createStatement();
		    int i = st.executeUpdate("insert into emp values(102,'hari',9080.50)");
		    System.out.println(i+" record inserted");
		    con.close();
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		

	}

}
