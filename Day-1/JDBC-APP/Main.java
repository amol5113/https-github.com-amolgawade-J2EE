package p01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// load the jdbc driver class
		try {
		Class.forName("com.mysql.jdbc.Driver");
		// creating jdbc connection
		Connection con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/cdac","root","cdac");
		// create the query statement
		Statement st = con.createStatement();
		// execute the query
		int i = st.executeUpdate("create table emp(emp_id int primary key,emp_name varchar(25),basic_salary float)");
		System.out.println(i+" created");
		// closing the connection
	//	con.close();
		
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		

	}

}
