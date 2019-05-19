package p01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main13 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","cdac");
		    PreparedStatement st = con.prepareStatement(
		    		"select * from emp");
		    boolean flag = st.execute();
		    ResultSet rs = st.getResultSet();
		    while(rs.next()) {
		    	System.out.println(
		    rs.getInt(1)+" "+rs.getString(2)+" "+rs.getFloat(3));
		    }
		    System.out.println(flag);
		   
//		    con.close();
		    
		}catch (Exception e) {
			//System.out.println(e);
		}
		

	}

}
