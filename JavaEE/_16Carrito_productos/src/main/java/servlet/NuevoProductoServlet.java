package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.ProductoService;

@WebServlet("/NuevoProductoServlet")
public class NuevoProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ProductoService productoService = new ProductoService();
		productoService.agregarProducto(request.getParameter("nombre"),
				Double.parseDouble(request.getParameter("precio")), 
				request.getParameter("categoria"));

		request.getRequestDispatcher("inicio.html").forward(request, response);
	}

}
