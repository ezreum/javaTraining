package t7;

import java.io.IOException;
import java.io.PrintWriter;

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
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String info = getServletContext().getServerInfo();
		out.println("<table border='1'>");
		out.println("<tr>");
		out.println("<th>");
		out.println("variable");
		out.println("</th>");
		out.println("<th>");
		out.println("información");
		out.println("</th>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<td>");
		out.println(info);
		out.println("</td>");
		out.println("</tr>");
		
		out.println("</table>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
