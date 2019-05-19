package p01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main9 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","cdac");
		    PreparedStatement st = con.prepareStatement(
		    		"select * from emp");
		    ResultSet rs = st.executeQuery();
		    while(rs.next()) {
		    	System.out.println(
		    rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
		    }
		    System.out.println("===========================");
		    rs = st.executeQuery();
		    while(rs.next()) {
		    	System.out.println(
		    rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
		    }
//		    con.close();
		    
		}catch (Exception e) {
			//System.out.println(e);
		}
		

	}

}
