package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Tabla
 */
public class Tabla extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int numero = Integer.parseInt(request.getParameter("numero"));
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html><body><center>");
		out.println("<h1>Tabla del " + numero + "</h1>");
		for (int i = 1; i <= 10; i++) {
			out.println(numero + " X " + i + " = " + numero * i + "</br>");
		}
		out.println("<a href='numero.html'>Volver</a>");
		out.println("</center></body></html>");
		out.close();
	}

}
