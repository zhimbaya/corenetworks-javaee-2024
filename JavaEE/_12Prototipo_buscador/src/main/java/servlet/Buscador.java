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

/**
 * Servlet implementation class Buscador
 */
public class Buscador extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		BuscadorService buscadorService = new BuscadorService();
		
		List<Resultado> resultado = buscadorService.buscar(request.getParameter("tematica"));
		String tematica = request.getParameter("tematica");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		out.println("<html><body><center>");
		out.println("<h1>Lista de " + tematica + "</h1>");
		for (Resultado r : resultado) {
			out.println("<h2><a href='" + r.getUrl() + "'>" + r.getTematica() + "</a></h2>");
			out.println("<h4>" + r.getDescripcion() + "</h4><br>");
		}
		out.println("<a href='Inicio.html'>Volver</a>");
		out.println("</center></body></html>");
		out.close();
	}

}
