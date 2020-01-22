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
		out.println("</form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		String[] hobbies = request.getParameterValues("hobby");
		int size = hobbies.length-1;
		PrintWriter out = response.getWriter();
		
		out.print("<h3>hola "+name+". Tus aficiones son: "); 
		for (String hobby :hobbies) { 
			
			/* hobbies[size].equals(hobby)?out.print(hobby):out.print(hobby+" "); */
			 
		
			  if(hobbies[size].equals(hobby)) { 
				  out.print(hobby); 
				  } else {
			  out.print(hobby+" "); }
		
		}
		
		out.print("</h3>");

	}

}
