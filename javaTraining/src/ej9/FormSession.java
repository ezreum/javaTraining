package ej9;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FormSession
 */
@WebServlet("/FormSession")
public class FormSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormSession() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<form method=\"post\">");
		out.println("<label>nombre</label>");
		out.println("<input type=\"text\" name=\"nombre\"/>");
		out.println("<br/>");
		out.println("<label>pass</label>");
		out.println("<input type=\"password\" name=\"clave\" />");
		out.println("<br/>");
		out.println("<select name=\"pais\">");
		out.println("<option>Narnia</option>");
		out.println("<option>Middle Earth</option");
		out.println("</select>");
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String nombre = request.getAttribute("nombre")!=null?(String)request.getAttribute("nombre"):null;
		String pwd = request.getAttribute("clave")!=null?(String)request.getAttribute("clave"):null;
		String pais = request.getAttribute("pais")!=null?(String)request.getAttribute("pais"):null;
		
		session.setAttribute("name",nombre!=null? nombre:"");
		session.setAttribute("key",pwd!=null? pwd:"");
		session.setAttribute("country",pais!=null? pais:"");
		doGet(request, response);
	}

}
