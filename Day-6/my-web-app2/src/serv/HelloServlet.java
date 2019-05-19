package serv;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "hello_serv",urlPatterns = "/ hello")
public class HelloServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletConfig sc = getServletConfig();
		String dname = sc.getInitParameter("driver_class");
		String url = sc.getInitParameter("url");
		response.getWriter().append("MySQL "+dname+" "+url);
		
		ServletContext cntx = request.getServletContext();
		String odname = cntx.getInitParameter("oracle_driver_class");
		String ourl = cntx.getInitParameter("oracle_url");
		response.getWriter().append("Oracle "+odname+" "+ourl);
		
	}

}
