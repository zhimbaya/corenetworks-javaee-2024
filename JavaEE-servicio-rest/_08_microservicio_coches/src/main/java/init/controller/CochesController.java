package init.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import init.model.Coche;
import init.service.interfaces.CocheService;

@RestController
public class CochesController {
	@Autowired
	CocheService service;
	
	@PostMapping(value="alta" , consumes=MediaType.APPLICATION_JSON_VALUE)
	public void alta(@RequestBody Coche coche) {
		service.alta(coche);
	}
	
	@DeleteMapping(value="eliminar", produces=MediaType.APPLICATION_JSON_VALUE)
	public Coche eliminar(@RequestParam("matricula") String matricula) {
		return service.eliminarCoche(matricula);
	}
	
	@GetMapping(value="buscarcoches/{marca}", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Coche> marca(@PathVariable("marca") String marca){
		return service.buscar(marca);
	}
	
	@GetMapping(value="buscarcoche/{max}" , produces =MediaType.APPLICATION_JSON_VALUE)
	public List<Coche> precio(@PathVariable("max") double precioMax){
		return service.buscarCoche(precioMax);
	}
	
	@GetMapping(value="buscar", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Coche> buscar(){
		return service.buscar();
	}
	
	@PutMapping(value="actualizar" ,produces="application/json",consumes=MediaType.APPLICATION_JSON_VALUE)
	public void actualizar(@RequestBody Coche coche) {
		service.actualizarCoches(coche);
	}
}
