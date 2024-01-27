package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operation=request.getParameter("operation");
		String urlView="";
		switch(operation) {
			
			case "doLibros":
				request.getRequestDispatcher("LibrosController").forward(request, response);
				return; //en peticiones AJAX la respuesta la lleva a cabo
						//el servlet controlador
			case "doAgregarCarrito":
				request.getRequestDispatcher("AgregarCarritoController").forward(request, response);
				return; //en peticiones AJAX la respuesta la lleva a cabo
						//el servlet controlador
			case "doQuitarCarrito":
				request.getRequestDispatcher("QuitarCarritoController").forward(request, response);
				return; //en peticiones AJAX la respuesta la lleva a cabo
						//el servlet controlador
			case "toLogin":
				urlView="login.html";
				break;
			case "doLogin":
				request.getRequestDispatcher("LoginController").include(request, response);
				boolean autenticado = (Boolean)request.getAttribute("autenticado");
				if(!autenticado) {
					urlView = "login.html";
					break;
				}
				//SI ESTA AUTENTICADO DEBE HACER LO QUE SE INDICA EN EL CASO DOTEMAS,
				//POR TANTO NO PONEMOS EL BREAK Y ASÍ ENTRA DIRECTAMENTE.
			case "doTemas":
				request.getRequestDispatcher("TemasController").include(request, response);
				urlView="visor.jsp";
				break;
				
			case "toRegistrar":
				urlView="registrar.html";
				break;
			
			case "doRegistrar":
				request.getRequestDispatcher("RegistrarController").include(request, response);
				urlView="login.html";
				break;
			
				
		}
		request.getRequestDispatcher(urlView).forward(request, response);
	}

}
