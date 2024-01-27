package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import model.Producto;
import service.interfaces.ProductosService;

@Controller
public class Controllers {

	@Autowired
	ProductosService service;

	@PostMapping(value = "agregar")
	public String agregar(Producto producto) {
		service.agregarProducto(producto);
		return "menu";
	}

	@GetMapping(value = "buscar")
	public String buscar(@RequestParam("categoria") String categoria, Model model) {
		List<Producto> productos = service.buscarPorCategoria(categoria);
		model.addAttribute("productos", productos);
		return "productos";
	}
	
	@PostMapping(value="eliminar")
	public String eliminar(@RequestParam("nombre") String nombre) {
		service.eliminarProducto(nombre);
		return "menu";
	}

}
