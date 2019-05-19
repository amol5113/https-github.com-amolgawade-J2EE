package p01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int empId = sc.nextInt();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cdac","root","cdac");
			PreparedStatement s = con.prepareStatement("delete from emp where emp_id = ?");
			s.setInt(1, empId);
			int i = s.executeUpdate();
			
			System.out.println(i+" record deleted");
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}

	}

}
