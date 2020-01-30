package aficion;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Form")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<form method=\"POST\">");
		out.println("<label>Nombre</label>");
		out.println("<input type=\"text\" name=\"name\">\n");
		out.println("<h2>Aficiones</h2>\n\n");
		out.println("<label>Bailar</label>");
		out.println("<input type=\"checkbox\" name=\"hobby\" value=\"bailar\">");
		out.println("<label>Cantar</label>");
		out.println("<input type=\"checkbox\" name=\"hobby\" value=\"cantar\">");
		out.println("\n");
		out.println("<input type=\"submit\" value=\"enviar aficiones\">");		
		out.println("</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		PrintWriter out = response.getWriter();
		if ( name == null || name.isEmpty() ) {
			doGet(request, response);
			out.println("Necesita que se escriba un nombre");
		}
		else {
		String[] hobbies=null;
		hobbies = request.getParameterValues("hobby")!=null?request.getParameterValues("hobby"):null;
		
		
		
		String resultado = "<h3>hola "+name+". Tus aficiones son: ";
		if (hobbies!=null ) {
			int size = hobbies.length>0?hobbies.length-1:0;
		for (String hobby :hobbies) { 
			
			/* hobbies[size].equals(hobby)?out.print(hobby):out.print(hobby+" "); */
			 
		
			  if(hobbies[size].equals(hobby)) { 
				  resultado+=" "+hobby;
				  }
			  else {
			  resultado+=hobby+" "; }
		
		}
		}
		else {
			resultado="<h3>hola "+name+". No te gusta nada";
		}
		resultado+="</h3>";
		out.println(resultado);

		}
	}

}
