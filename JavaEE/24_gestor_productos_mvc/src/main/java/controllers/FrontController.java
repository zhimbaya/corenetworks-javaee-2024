package controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String op = request.getParameter("operation");
		String urlView = "";
		switch (op) {
		case "doAlta":
			// include vuelve a pasar el control al frontcontroller
			request.getRequestDispatcher("AltaController").include(request, response);
			urlView = "inicio.html";
			break;
		case "doBuscar":
			// include vuelve a pasar el control al frontcontroller
			request.getRequestDispatcher("BuscarController").include(request, response);
			urlView = "productos.jsp";
			break;
		case "doEliminar":
			// include vuelve a pasar el control al frontcontroller
			request.getRequestDispatcher("EliminarController").include(request, response);
			urlView = "inicio.html";
			break;
		case "toNuevo":
			urlView = "alta.html";
			break;
		case "toBuscar":
			urlView = "buscar.html";
			break;
		case "toEliminar":
			urlView = "eliminar.html";
			break;
		case "toInicio":
			urlView = "inicio.html";
			break;
		default:
			break;
		}
		request.getRequestDispatcher(urlView).forward(request, response);
	}
}
