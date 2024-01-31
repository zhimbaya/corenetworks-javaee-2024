package controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import model.Producto;
import service.interfaces.ProductosService;

@Controller // spring
public class BuscadorController {

	@Autowired // para que spring inyecte
	ProductosService productosService;

	@PostMapping(value = "agregar")
	public String guardar(@ModelAttribute Producto producto, Model model) {
		if (!productosService.agregar(producto)) {
			model.addAttribute("mensajeAlta", "Producto " + producto.getNombre() + " repetido, no se añadió!!!");
		}else {
			model.addAttribute("mensajeAlta","El producto "+ producto.getNombre() + " se añadió!!!");
		}
		return "menu";
	}

	//JSON
	@GetMapping(value = "buscar", produces = "application/json") //ESTO ES OPCIONAL, POR DEFECTO JSON
	public @ResponseBody List<Producto> buscar(@RequestParam("categoria") String categoria, Model model) { //@RESPONSEBODY PARA JSON
		return productosService.buscar(categoria);
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
