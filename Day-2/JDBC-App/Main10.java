package p01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id");
		int empId = sc.nextInt();
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter salary");
		float basicSalary = sc.nextFloat();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/cdac","root","cdac");
			PreparedStatement s = con.prepareStatement("insert into emp values(?,?,?)");
			s.setInt(1, empId);
			s.setString(2, name);
			s.setFloat(3, basicSalary);
			int i = s.executeUpdate();
			
			System.out.println(i+" record inserted");
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}

	}

}
