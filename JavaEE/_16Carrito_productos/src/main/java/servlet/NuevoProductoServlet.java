package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Producto;

@WebServlet("/NuevoProductoServlet")
public class NuevoProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession sesion = request.getSession();
		List<Producto> productos = new ArrayList<>();
		if (sesion.getAttribute("carrito") != null) {
			productos = (List<Producto>) sesion.getAttribute("carrito");
		}
		productos.add(new Producto(request.getParameter("nombre"), Double.parseDouble(request.getParameter("precio")),
				request.getParameter("categoria")));
		sesion.setAttribute("carrito", productos);
		request.getRequestDispatcher("inicio.html").forward(request, response);
	}

}
