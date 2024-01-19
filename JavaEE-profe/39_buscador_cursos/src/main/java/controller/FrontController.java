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
		String op=request.getParameter("operation");
		//String urlView="";
		switch(op) {
			case "doBuscarDuracionMax":
				request.getRequestDispatcher("BuscarPrecioMaxController").forward(request, response);				
				return;
			case "doBuscarDuracion":
				request.getRequestDispatcher("BuscarDuracionController").forward(request, response);				
				return;			
		}
		
	}

}
