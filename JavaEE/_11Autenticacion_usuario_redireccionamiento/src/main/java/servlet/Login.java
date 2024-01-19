package servlet;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.UsuarioService;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		UsuarioService service = new UsuarioService();
		if(service.autenticar(request.getParameter("usuario"),request.getParameter("password"))) {
			//redireccionamos a correcto.jsp
			response.sendRedirect("correcto.jsp?usuario="+request.getParameter("usuario"));
		}else {
			//redireccionamos a error.jsp
			response.sendRedirect("error.jsp?usuario="+request.getParameter("usuario")+
					"&password="+request.getParameter("password"));
		}
	}
}
