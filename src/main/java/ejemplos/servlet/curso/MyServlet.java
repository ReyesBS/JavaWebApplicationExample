package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {



	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();


		out.println("<html>");
		out.println("<head><title>My Servlet</title></head>");
		out.println("<body>");
		out.println("<h1>¡Hola mundo!</h1>");
		out.println("<p>Si quieres ver la otra página, escribe tu nombre</p>");
		out.println("<form action=/myServlet2>");
		out.println(
				"<label>Nombre</label><br> <input type=\"text\"required id=\"nombre\" name=\"nombre\" autofocus/> <br>"+
				"<label>Apellidos</label><br> <input type=\"text\"required id=\"apellidos\" name=\"apellidos\"/> <br>"+
				"<input type=\"submit\" value=\"¡Vamos!\" id=\"boton\"/>" +
				"<input type=\"reset\" value=\"Limpiar campos\" id=\"boton\"/>"
		);
		out.println("</form>");
		out.println("</body></html>");
	}

}