package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String operation=request.getParameter("operation");
		String urlView="";
		switch(operation) {
			case "doLogin":
				request.getRequestDispatcher("LoginController").include(request, response);
				boolean autenticado=(Boolean)request.getAttribute("autenticado");
				if(!autenticado) {
					urlView="login.html";
					break;
				}
				//si está autenticado, debe hacer lo que se indica en el caso doTemas, por tanto
				//no ponemos el break y así entra directamente
			case "doTemas":
				request.getRequestDispatcher("TemasController").include(request, response);
				urlView="visor.jsp";
				break;
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
			case "doAlta":
				request.getRequestDispatcher("AltaController").include(request, response);
				urlView="login.html";
				break;
			case "toNuevo":
				urlView="nuevo.html";
		}
		
			
			
		request.getRequestDispatcher(urlView).forward(request, response);
	}

}
