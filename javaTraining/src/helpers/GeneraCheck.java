package helpers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GeneraRadio
 */
@WebServlet("/GeneraCheck")
public class GeneraCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<h1> Generador de checkboxes </h1>");
		out.println("Primero dinos el nombre común de los checks");
		out.println("<br/>");
		out.println("<form method=\"POST\">");
		out.println("<input type=\"text\" name=\"name\">");
		out.println("<br/>");
		out.println("escribe en la caja de texto todos los valores sin espacios y seguidos de #");
		out.println("<br/>");
		out.println("<textarea name=\"content\" cols=\"30\" rows=\"10\"></textarea");
		out.println("<br/>");
		out.println("<input type=\"submit\" value=\"enviar\">");
		out.println("<form/>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("name") != null?request.getParameter("name"):null;
		String content = request.getParameter("content") != null?request.getParameter("content"):null;
		PrintWriter out = response.getWriter();
		CheckHelper helper= new CheckHelper();
		String[] data = content.split("#");
		if (nombre != null || content != null) {
			out.println("<html>");
			out.println("<body>");			
			out.println("<form method=\"get\">");
			out.println(helper.generarCheck(nombre, data));
			out.println("<input type=\"submit\" value=\"enviar\">");
			out.println("</form>");
			out.println("</body>");
			out.println("</html>");
		}
	}

}
