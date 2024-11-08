package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String op = request.getParameter("operation");
		switch (op) {
		case "doBuscarPrecioMax":
			request.getRequestDispatcher("BuscarPrecioMaxController").include(request, response);
			break;
			
		case "doBuscarDuracion":
			request.getRequestDispatcher("BuscarDuracionController").include(request, response);
			break;
		}

	}

}
