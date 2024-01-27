package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Libro;
import service.LibrosService;

@WebServlet("/AgregarLibrosCarritoController")
public class AgregarLibrosCarritoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int isbn = Integer.parseInt(request.getParameter("isbn"));
		
		HttpSession sesion = request.getSession();
		LibrosService service = new LibrosService();
		Libro libros = service.getLibro(isbn);
		List<Libro> carrito = new ArrayList<>();
		
		if (sesion.getAttribute("carrito") != null) {
			carrito = (List<Libro>) sesion.getAttribute("carrito");
		}
		carrito.add(libros);
		sesion.setAttribute("carrito", carrito);
		//
		Gson gson = new Gson();
		PrintWriter out = response.getWriter();
		response.setContentType("application/json");
		out.println(gson.toJson(carrito));
	}

}
