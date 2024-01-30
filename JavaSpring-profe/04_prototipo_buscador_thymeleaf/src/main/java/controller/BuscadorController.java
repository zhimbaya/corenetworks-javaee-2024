package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import model.Resultado;
import service.interfaces.BuscadorService;

@Controller
public class BuscadorController {
	@Autowired
	BuscadorService buscadorService;
	@GetMapping(value="buscar")
	public String buscar(@RequestParam("tematica") String tematica,Model model) {
		List<Resultado> resultados=buscadorService.buscar(tematica);
		model.addAttribute("resultados", resultados); //equivale al request.setAttribute(...)
		return "resultados"; //nombre de la página a la que debe dirigirnos el FrontController
	}
	
	
	@PostMapping(value="alta")//para volcado de parámetros en JavaBean
	public String alta(@ModelAttribute Resultado resultado) {
		buscadorService.agregar(resultado);
		return "menu";
	}
	
	
}
