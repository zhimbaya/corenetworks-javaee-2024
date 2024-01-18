package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.CursosService;

@WebServlet("/GuardarController")
public class GuardarController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CursosService service = new CursosService();
		service.agregarCurso(request.getParameter("nombre"), Integer.parseInt(request.getParameter("duracion")),
				Double.parseDouble(request.getParameter("precio")));

	}

}
