package controller;

import java.io.IOException;

import dtos.ClienteDto;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.interfaces.ClientesService;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	
	@Inject
	ClientesService clientesService;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClienteDto dto=clientesService.autenticarCliente(request.getParameter("usuario"), request.getParameter("password"));
		request.setAttribute("autenticado", dto!=null);
	}

}
