package servlets;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ContadorServlet")
public class ContadorServlet extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// pedimos HttpSession y ServletContext
		HttpSession session = request.getSession();
		ServletContext context = request.getServletContext();
		// recuperamos el contador, le sumamos 1 y lo volvemos a guardar
		// comprobando que sea distinto de null, en caso de ser nulo
		// se crea a cero
		int actual = 1;
		int global = 1;
		if (session.getAttribute("contador") != null) {
			actual = (Integer) session.getAttribute("contador");
		}
		if (context.getAttribute("global") != null) {
			global = (Integer) context.getAttribute("global");
		}
		/*
		 * actual++; session.setAttribute("contador", actual);
		 */
		session.setAttribute("contador", ++actual);
		context.setAttribute("global", ++global);
		// transferir petición a JSP
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
	}

}
