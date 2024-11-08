package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.ProductosService;

import java.io.IOException;

@WebServlet("/EliminarProductoController")
public class EliminarProductoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ProductosService productosService = new ProductosService();
		productosService.eliminarPorNombre(request.getParameter("nombre"));
	}

}
