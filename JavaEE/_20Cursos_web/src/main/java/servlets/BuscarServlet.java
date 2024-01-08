package servlets;

import java.io.IOException;
import java.util.ArrayList;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Curso;
import service.CursosService;

@WebServlet("/BuscarServlet")
public class BuscarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		var service = new CursosService();
		ArrayList<Curso> cursos = service.preciosCursoMax(Double.parseDouble(request.getParameter("precio")));
		
		//GUARDAMOS ARRAYLIST EN ATRIBUTO DE PETICIÓN ANTES DE TRANSFERIR PETICIÓN AL JSP.
		request.setAttribute("cursos", cursos);
		request.getRequestDispatcher("cursos.jsp").forward(request, response);
	}

}
