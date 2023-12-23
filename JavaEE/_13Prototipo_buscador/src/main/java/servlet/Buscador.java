package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Resultado;
import service.BuscadorService;

public class Buscador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BuscadorService buscadorService = new BuscadorService();
		
		List<Resultado> resultado = buscadorService.buscar(request.getParameter("tematica"));
		request.setAttribute("resultado",resultado);
		//transferir peticiones al JSP
		request.getRequestDispatcher("Resultados.jsp").forward(request, response);
		
	}

}
