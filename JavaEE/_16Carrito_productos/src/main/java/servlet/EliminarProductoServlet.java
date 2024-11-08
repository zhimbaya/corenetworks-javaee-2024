package servlet;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Producto;

@WebServlet("/EliminarProductoServlet")
public class EliminarProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		List<Producto> productos = (List<Producto>)session.getAttribute("carrito");

		productos.removeIf(p->p.getNombre().equals(request.getParameter("nombre")));
		
		//no es necesario hacer un setAttribute de productos, pues la variable productos
		//y el el atributo de sesión apuntan a la misma lista. Si la lista se modifica a través de 
		//la variable productos, ya queda modificada para la sesión.
		request.getRequestDispatcher("inicio.html").forward(request, response);
	}

}
