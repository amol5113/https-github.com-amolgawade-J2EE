package p01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main14 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cdac","root","cdac");
		    PreparedStatement st = con.prepareStatement("insert into emp values(?,?,?)");
		    st.setInt(1, 126);
		    st.setString(2, "abcv");
		    st.setFloat(3, 234.56f);
		    boolean flag = st.execute();
		    System.out.println(flag);
		    int i = st.getUpdateCount();
		    System.out.println(i);
		  //  con.close();
		}catch (ClassNotFoundException | SQLException e) {
			System.out.println(e);
		}
		

	}

}
