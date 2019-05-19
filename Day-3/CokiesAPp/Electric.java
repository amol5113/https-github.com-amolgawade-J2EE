package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Electric")
public class Electric extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("<form action='Electronic' >");
		out.print("<input type='checkbox' name='iron' value='IRON' >IRON<br>");
		out.print("<input type='checkbox' name='fan' value='FAN' >FAN<br>");
		out.print("<input type='submit' value='Next' ><br>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
	}

}
