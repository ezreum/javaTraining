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
		
		HttpSession session= request.getSession();
		String nombre = session.getAttribute("name")!=null?(String)session.getAttribute("name"):"";
		String pwd = session.getAttribute("key")!=null?(String)session.getAttribute("key"):"";
		String pais = session.getAttribute("country")!=null?(String)session.getAttribute("country"):"";
		String info = session.getAttribute("errors")!=null?(String)session.getAttribute("errors"):null;
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<form method=\"post\">");
		out.println("<label>nombre</label>");
		out.println("<input type=\"text\" name=\"nombre\" value=\""+nombre+"\"   />");
		out.println("<br/>");
		out.println("<label>pass</label>");
		out.println("<input type=\"password\" name=\"clave\" value=\""+pwd+"\" />");
		out.println("<br/>");
		out.println("<select name=\"pais\">");
		out.println("<option>Narnia</option>");
		out.println("<option>Middle Earth</option");
		out.println("</select>");
		out.println("<br/>");
		out.println("<input type=\"submit\" value=\"gogogogogo\"/>");
		out.println("</form>");
		
		if (info!=null) {
			out.println("<h5>"+info+"</h5>");
		}
		
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String nombre = request.getParameter("nombre")==null||request.getParameter("nombre").equals("")?null:(String)request.getParameter("nombre");
		String pwd = request.getParameter("clave")==null||request.getParameter("clave").equals("")?null:(String)request.getParameter("clave");
		String pais = request.getParameter("pais")!=null?(String)request.getParameter("pais"):null;
		
		
		
		  session.setAttribute("name",nombre!=null? nombre:"");
		  session.setAttribute("key",pwd!=null? pwd:"");
		  session.setAttribute("country",pais!=null? pais:"");
		  
		  String check = "" ;
		  
		  if ( nombre == null || pwd== null || pais == null ) {
		  check=nombre==null?"the name is empty":"";
		  check+=pwd==null?" password field is empty":"";
		  check+=pais==null?" Did you happen to choose a country?":"";
		  session.setAttribute("errors", check); 
		  doGet(request, response); 
		  } 
		  else {
		  PrintWriter out = response.getWriter(); 
		  out.println("<h1>Everything is correct</h1>");
		  out.println("<br/>"); 
		  out.println("<h2>Your name is "+nombre+"</h2>");
		  out.println("<h2>your pass is "+pwd+"</h2>");
		  out.println("<h2>and the country you chose is: "+pais+"</h2>"); 
		  session.removeAttribute("errors");
		  }
		 
	}

}
