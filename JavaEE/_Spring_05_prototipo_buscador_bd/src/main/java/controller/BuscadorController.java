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

@Controller //spring
public class BuscadorController {
	
	@Autowired //equivalente al inject - para que spring inyecte
	BuscadorService buscadorService;
	
	@GetMapping(value="buscar")
	public String buscar(@RequestParam("tematica")String tematica, Model model) {
		List<Resultado> resultados = buscadorService.buscar(tematica);
		model.addAttribute("resultados", resultados);//equivale al request.setAttribute(...)
		return "resultados"; //nombre de la página a la que debe dirigirnos el FrontController.
	}
	
	@PostMapping(value = "guardar")
	//public void guardar(@RequestParam("url")String url, @RequestParam("tematica")String tematica, @RequestParam("descripcion")String descripcion,Model model) {
	public String guardar(@ModelAttribute Resultado resultado) { //si son muchos parámetros
		buscadorService.guardar(resultado);
		return "menu";
	}
}
