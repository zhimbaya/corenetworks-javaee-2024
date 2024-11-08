package controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;
import model.Cliente;
import model.Libro;
import service.interfaces.ClientesService;
import service.interfaces.LibrosService;

@Controller
public class LibreriaController {
	@Autowired
	LibrosService librosService;
	@Autowired
	ClientesService clientesService;
	
	@PostMapping(value="alta")
	public String altaCliente(@ModelAttribute Cliente cliente, Model model) {
		if(!clientesService.altaCliente(cliente)) {
			model.addAttribute("mensaje","Usuario repetido, no se pudo registrar");
			return "nuevo";
		}
		return "login";
	}
	@GetMapping(value="login")
	public String login(@RequestParam("usuario") String usuario,
			@RequestParam("password") String password, Model model) {
		if(clientesService.autenticarCliente(usuario, password)==null) {
			model.addAttribute("mensaje", "Usuario no existente, registrese");
			return "login";
		}
		model.addAttribute("temas", librosService.getTemas());
		return "visor";
	}
	
	
	@GetMapping(value="libros",produces="application/json")
	public @ResponseBody List<Libro> librosTema(@RequestParam("idTema") int idTema){
		return librosService.librosTema(idTema);
	}
	@GetMapping(value="agregarCarrito",produces="application/json")
	public @ResponseBody List<Libro> agregarCarrito(@RequestParam("isbn") int isbn,HttpSession sesion){
		Libro libro=librosService.getLibro(isbn);
		List<Libro> carrito=new ArrayList<>();
		if(sesion.getAttribute("carrito")!=null) {
				carrito=(List<Libro>)sesion.getAttribute("carrito");
		}
		carrito.add(libro);
		sesion.setAttribute("carrito", carrito);
		return carrito;
	}
	@GetMapping(value="quitarCarrito",produces="application/json")
	public @ResponseBody List<Libro> quitarCarrito(@RequestParam("pos") int pos,HttpSession sesion){
		List<Libro> carrito=new ArrayList<>();
		if(sesion.getAttribute("carrito")!=null) {
				carrito=(List<Libro>)sesion.getAttribute("carrito");
				carrito.remove(pos);
		}
		
		sesion.setAttribute("carrito", carrito);
		return carrito;
	}
	
}
