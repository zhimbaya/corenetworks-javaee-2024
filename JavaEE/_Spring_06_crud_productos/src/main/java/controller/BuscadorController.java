package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import model.Producto;
import service.interfaces.ProductosService;

@Controller // spring
public class BuscadorController {

	@Autowired // para que spring inyecte
	ProductosService productosService;

	@PostMapping(value = "agregar")
	public String guardar(@ModelAttribute Producto producto, Model model) { // si son muchos parámetros
		if (!productosService.guardar(producto)) {
			model.addAttribute("mensajeAlta", "Producto " + producto.getNombre() + " repetido, no se añadió!!!");
		}else {
			model.addAttribute("mensajeAlta","El producto "+ producto.getNombre() + " se añadió!!!");
		}
		
		return "menu";
	}

	@GetMapping(value = "buscar")
	public String buscar(@RequestParam("categoria") String categoria, Model model) {
		List<Producto> productos = productosService.buscar(categoria);
		model.addAttribute("productos", productos);// equivale al request.setAttribute(...)
		return "productos"; // nombre de la página a la que debe dirigirnos el FrontController.
	}

	@PostMapping(value = "eliminar")
	public String eliminar(@RequestParam("nombre") String nombre, Model model) {

		Producto prod=productosService.eliminar(nombre);
		if(prod!=null) {
			model.addAttribute("mensajeEliminar","se ha eliminado el producto "+nombre+" de la categoría "+prod.getCategoria());
		}else {
			model.addAttribute("mensajeEliminar","el producto "+nombre+ " no existe!!!");
		}
		return "menu";
	}

	@PostMapping(value = "modificar")
	public String modificar(@RequestParam("nombre") String nombre, @RequestParam("precio") double precio, Model model) {
		productosService.modificar(nombre, precio);
		return "menu";
	}

}
