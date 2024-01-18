package controllers;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String op = request.getParameter("operation");
//		String urlView = "";
		switch (op) {
//		
		case "doBuscarPorCategoria":
			request.getRequestDispatcher("BuscarCategoriaController").forward(request, response);
			return;
//		
		}
		//request.getRequestDispatcher(urlView).forward(request, response);
	}
}
