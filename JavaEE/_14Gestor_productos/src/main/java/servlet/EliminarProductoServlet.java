package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Producto;
import service.ProductoService;

import java.io.IOException;
import java.util.List;

@WebServlet("/EliminarProductoServlet")
public class EliminarProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ProductoService productoService = new ProductoService();
		productoService.eliminarProducto(request.getParameter("nombre"));
		
		request.getRequestDispatcher("Inicio.html").forward(request, response);
	}

}
