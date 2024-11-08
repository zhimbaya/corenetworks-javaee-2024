package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class FrontController extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String op=request.getParameter("operation");
		String urlView="";
		switch(op) {
			case "doAlta":
				request.getRequestDispatcher("AltaController").include(request, response);
				urlView="inicio.html";
				break;
			case "doBuscar":
				request.getRequestDispatcher("BuscarController").include(request, response);
				urlView="productos.jsp";
				break;
			case "doEliminar":
				request.getRequestDispatcher("EliminarController").include(request, response);
				urlView="inicio.html";
				break;	
			case "toAlta":
				urlView="alta.html";
				break;
			case "toBuscar":
				urlView="buscar.html";
				break;
			case "toEliminar":
				urlView="eliminar.html";
				break;
			case "toInicio":
				urlView="inicio.html";
				break;			
		}
		request.getRequestDispatcher(urlView).forward(request, response);
	}

}
