package p01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main7 {

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
			Statement s = con.createStatement();
			String q = "insert into emp values("+empId+",'"+name+"',"+basicSalary+")";
			System.out.println(q);
			int i = s.executeUpdate(q);
			con.close();
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}

	}

}
