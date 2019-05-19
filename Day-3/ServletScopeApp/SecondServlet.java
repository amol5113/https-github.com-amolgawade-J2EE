package serv;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String req = (String)request.getAttribute("reqAttr");
	
		HttpSession session = request.getSession(true);
	//	String ses = (String)session.getAttribute("sessAttr");
		session.removeAttribute("sessAttr");
		session.invalidate();
		
		request.getSession(true);
		
		session = request.getSession(true);
		String ses = (String)session.getAttribute("sessAttr");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("Request "+req);
		out.print("<br>Session "+ses);
		out.flush();
		out.close();
	}

}
