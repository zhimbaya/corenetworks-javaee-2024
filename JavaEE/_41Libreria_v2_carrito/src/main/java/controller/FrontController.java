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
		String urlView = "";
		switch (op) {
		case "doMostrarTemas":
			request.getRequestDispatcher("MostrarTemasController").include(request, response);
			urlView = "temas.jsp";
			break;
		case "doMostrarLibros":
			request.getRequestDispatcher("BuscarLibroController").forward(request, response);
			return; //en peticiones Ajax la respuesta la lleva a cabo el servlet controlador
		case "doAgregarCarrito":
			request.getRequestDispatcher("AgregarLibrosCarritoController").forward(request, response);
			return;
		case "doQuitarCarrito":
			request.getRequestDispatcher("EliminarCarritoController").forward(request, response);
			return;
		case "toInicio":
			urlView = "inicio.html";
			break;
		}
		request.getRequestDispatcher(urlView).forward(request, response);
	}
}
