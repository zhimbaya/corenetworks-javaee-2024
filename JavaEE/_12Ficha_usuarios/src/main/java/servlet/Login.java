package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Ficha;
import service.UsuarioService;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		UsuarioService service = new UsuarioService();
		RequestDispatcher dispatcher;
		if(service.autenticar(request.getParameter("usuario"),request.getParameter("password"))) {
			//busca la ficha del usuario
			Ficha ficha = service.fichaUsuario(request.getParameter("usuario"));
			//guardamos ficha en atributo petición
			request.setAttribute("ficha",ficha);
			//transferimos petición a correcto.jsp
			dispatcher=request.getRequestDispatcher("correcto.jsp");
		}else {
			//transferimos petición a error.jsp
			dispatcher=request.getRequestDispatcher("error.jsp");
		}
		dispatcher.forward(request, response); 
	}
}
