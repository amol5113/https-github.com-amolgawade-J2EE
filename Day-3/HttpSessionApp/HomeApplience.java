package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/HomeApplience")
public class HomeApplience extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String p1 = request.getParameter("mobile");
		String p2 = request.getParameter("pc");
		
		HttpSession session = request.getSession(false);
		
		if(p1!=null) {
			session.setAttribute("mobile", p1);
		}
		if(p2!=null) {
			session.setAttribute("pc", p2);
		}
		
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("<form action='Bill' >");
		out.print("<input type='checkbox' name='lbox' value='LBOX' >LBOX<br>");
		out.print("<input type='checkbox' name='ac' value='AC' >AC<br>");
		out.print("<input type='submit' value='Bill' ><br>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
	}

}
