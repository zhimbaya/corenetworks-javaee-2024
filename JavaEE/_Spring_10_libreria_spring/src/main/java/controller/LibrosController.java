package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;
import model.Cliente;
import model.Libro;
import service.interfaces.ClientesService;
import service.interfaces.LibrosService;

@Service
public class LibrosController {

	@Autowired
	LibrosService librosService;
	@Autowired
	ClientesService clientesService;

	@GetMapping(value = "login")
	public String login(@RequestParam("usuario") String usuario, @RequestParam("password") String pwd, Model model) {
		
		if(clientesService.autenticationCliente(usuario, pwd)==null) {
			model.addAttribute("mensaje", "usuario no existe, registrese.");
			return "login";
		}
		model.addAttribute("temas",librosService.getTemas());
		return "visor";
	}
	
	@PostMapping(value = "registrar")
	public String registrar(@RequestParam("usuario") Cliente cliente, Model model) {
		
		if(!clientesService.registerCliente(cliente)) {
			model.addAttribute("mensaje", "usuario repetido, no se puedo registrar");
			return "regitrar";
		}
		return "login";
	}

	@GetMapping("libros")
	public @ResponseBody List<Libro> librosTema(@RequestParam("idTema")int idTema){
		return librosService.getLibrosByTema(idTema);
	}
	
	@GetMapping("agregarCarrito")
	public @ResponseBody List<Libro> agregarCarrito(@RequestParam("isbn") int isbn, HttpSession session){
		Libro libro = librosService.getLibro(isbn);
		List<Libro> carrito = new ArrayList<>();
		if (session.getAttribute("carrito") != null) {
			carrito = (List<Libro>) session.getAttribute("carrito");
		}
		carrito.add(libro);
		session.setAttribute("carrito", carrito);
		return carrito;
	}
	
	@GetMapping("quitarCarrito")
	public @ResponseBody List<Libro> quitarCarrito(@RequestParam("pos") int pos, HttpSession session){
		List<Libro> carrito = new ArrayList<>();
		if (session.getAttribute("carrito") != null) {
			carrito = (List<Libro>) session.getAttribute("carrito");
			carrito.remove(pos);
		}

		session.setAttribute("carrito", carrito);
		return carrito;
	}

}
