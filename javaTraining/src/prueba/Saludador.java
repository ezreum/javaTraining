package prueba;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Saludador
 */
@WebServlet("/Saludador")
public class Saludador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Saludador</h1>"
				+ "<form method=\"post\">"
				+ "Nombre"
				+ "<input type=\"text\" name=\"nombre\"/>"
				+ "</br>"
				+ "Apellido"
				+ "<input type=\"text\" name=\"apellido\"/>"
				+ "</br>"
				+ "<input type=\"submit\" value=\"saludar\"/>"
				+ "</form>"
				+ "</br>");
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		String nombre = request.getParameter("nombre");
		String apellido = request.getParameter("apellido");
		PrintWriter out = response.getWriter();
		out.println("<h1>hola "+request.getParameter("nombre")+" "+request.getParameter("apellido")+"</h1>");
	}

}
