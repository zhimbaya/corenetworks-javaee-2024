package servlet;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Producto;
import service.ProductoService;

@WebServlet("/ListarProductosServlet")
public class ListarProductosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductoService productoService = new ProductoService();
		
		List<Producto> listar = productoService.buscarPorCategoria(request.getParameter("categoria"));
		request.setAttribute("listar",listar);
		//transferir peticiones al JSP
		request.getRequestDispatcher("Listados.jsp").forward(request, response);
	}

}
