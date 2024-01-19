package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/ContadorServlet")
public class ContadorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// pedimos httpsesion
		HttpSession session = request.getSession();
		// recuperamos el contador, le sumamos 1 y lo volvemos a sumar
		//comprobamos que sea distinto de null, en caso de ser nulo se crea cero
		int actual= 0;
		if(session.getAttribute("contador") != null) {
			actual = (Integer) session.getAttribute("contador");
		}
		
		/*
		 * actual++; session.setAttribute("contador",actual);
		 */
		session.setAttribute("contador", ++actual);
		// transferir petición a JSP
		request.getRequestDispatcher("resultado.jsp").forward(request, response);
	}

}
