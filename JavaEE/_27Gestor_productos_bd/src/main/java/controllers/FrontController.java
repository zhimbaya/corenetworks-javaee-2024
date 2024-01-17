package controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String op = request.getParameter("operation");
		String urlView = "";
		switch (op) {
		case "doAlta":
			request.getRequestDispatcher("AltaController").include(request, response);
			urlView = "inicio.html";
			break;
		case "doBuscarProducto":
			request.getRequestDispatcher("BuscarProductoController").include(request, response);
			urlView = "producto.jsp";
			break;
		case "doEliminarPorNombre":
			request.getRequestDispatcher("EliminarProductoController").include(request, response);
			urlView = "inicio.html";
			break;
		case "doBuscarPorCategoria":
			request.getRequestDispatcher("BuscarCategoriaController").include(request, response);
			urlView = "productos.jsp";
			break;
		case "toNuevo":
			urlView = "alta.html";
			break;
		case "toBuscarProducto":
			urlView = "buscarProducto.html";
			break;
		case "toEliminarPorNombre":
			urlView = "eliminarProducto.html";
			break;
		case "toBuscarPorCategoria":
			urlView = "buscarProductoCategoria.html";
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
