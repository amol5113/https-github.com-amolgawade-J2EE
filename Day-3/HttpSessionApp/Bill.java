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
import javax.servlet.http.HttpSession;

@WebServlet("/Bill")
public class Bill extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ArrayList<String> items = new ArrayList<String>();
		
		HttpSession session = request.getSession(false);
		

		String p1 = request.getParameter("lbox");
		String p2 = request.getParameter("ac");
		
		String s1 = (String)session.getAttribute("iron");
		if(s1!=null) {
			items.add(s1);
		}
		
		String s2 = (String)session.getAttribute("fan");
		if(s2!=null) {
			items.add(s2);
		}
		
		String s3 = (String)session.getAttribute("mobile");
		if(s3!=null) {
			items.add(s3);
		}
		
		String s4 = (String)session.getAttribute("pc");
		if(s4!=null) {
			items.add(s4);
		}
		
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
