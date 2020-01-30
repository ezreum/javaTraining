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
@WebServlet("/GeneraRadio")
public class GeneraRadio extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		out.println("<h1> Generador de radios </h1> \n");
		out.println("Primero dinos el nombre común de los radios");
		out.println("\n");
		out.println("<form>");
		out.println("<input type=\"text\" name=\"name\">");
		out.println("\n");
		out.println("indica cuantos radios vas a querer y luego saldrán las cajas de texto para recolectar los nombres");
		out.println("<input type=\"text\" name=\"number\">");
		out.println("\n");
		out.println("<input type=\"submit\" value=\"enviar\">");
		out.println("<form/>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombre = request.getParameter("name") != null?request.getParameter("name"):null;
		int numero = request.getParameter("number") != null?Integer.parseInt(request.getParameter("number")):null;
		PrintWriter out = response.getWriter();
		if (nombre != null || numero != 0) {
			
		}
		else {
			doGet(request, response);
			out.println("dejaste el nombre o el número de radios en blanco");
		}
	}

}
