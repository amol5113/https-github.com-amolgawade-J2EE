package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/HomeApplience")
public class HomeApplience extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String p1 = request.getParameter("mobile");
		String p2 = request.getParameter("pc");
		
		if(p1!=null) {
			Cookie c = new Cookie("mobile", p1);
			c.setMaxAge(60*60*60);
			response.addCookie(c);
		}
		if(p2!=null) {
			Cookie c = new Cookie("pc", p2);
			response.addCookie(c);
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
