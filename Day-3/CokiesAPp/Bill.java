package serv;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Bill")
public class Bill extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<String> items = new ArrayList<String>();
		
		Cookie arr[] = request.getCookies();
		
		if(arr!=null) {
		 for(Cookie c : arr) {
			items.add(c.getValue()); 
		 }
		}
		
		String p1 = request.getParameter("lbox");
		String p2 = request.getParameter("ac");
		
		if(p1!=null) {
			items.add(p1);
		}
		if(p2!=null) {
			items.add(p2);
		}
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("Items");
		for(String s : items) {
			out.print("<h2>"+s+"</h2>");
		}
		out.print("</body>");
		out.print("</html>");
	}

}
