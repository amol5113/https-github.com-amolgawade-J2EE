package serv;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		request.setAttribute("reqAttr", "Request Object");
		
		HttpSession session = request.getSession(true);
		session.setAttribute("sessAttr", "Session Object");
		
	//	RequestDispatcher rd = request.getRequestDispatcher("SecondServlet");
	//	rd.forward(request, response);
		
		response.sendRedirect("SecondServlet");
		
	}

}
