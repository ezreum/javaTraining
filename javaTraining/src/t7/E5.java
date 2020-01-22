package t7;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class E5
 */
@WebServlet("/t7/E5")
public class E5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		Map<String, String> info = new HashMap<String, String>();
		
		info.put("server_software", getServletContext().getServerInfo());
		info.put("servletConfig", getServletConfig().toString());
		info.put("servletName", getServletName());

		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<th>");
		out.println("variable");
		out.println("</th>");
		out.println("<th>");
		out.println("información");
		out.println("</th>");
		out.println("</tr>");
		for (String parte : info.keySet()) {
			out.println("<tr>");
			out.println("<td>");
			out.println(parte);
			out.println("</td>");
			out.println("<td>");
			out.println(info.get(parte));
			out.println("</td>");
			out.println("</tr>");
		}
		
		
		out.println("</table>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
