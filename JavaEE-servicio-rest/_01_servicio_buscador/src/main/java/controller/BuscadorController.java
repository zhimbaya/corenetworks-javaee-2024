package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import model.Resultado;
import service.interfaces.BuscadorService;

@CrossOrigin("*")//spring permitir llamas desde un cliente origen
@RestController
public class BuscadorController {
	
	@Autowired
	BuscadorService buscadorService;
	
	@GetMapping(value="buscar", produces ="application/json")
	public List<Resultado> buscar(@RequestParam("tematica")String tematica) {
		return buscadorService.buscar(tematica);
	}
	
	@PostMapping(value = "guardar", consumes = "application/json") //PARA VOLCADO DEL CUERPO DE LA PETICIÓN EN EL JAVABEAN
	public void guardar(@RequestBody Resultado resultado) {
		buscadorService.guardar(resultado);
	}
	
	@DeleteMapping(value="eliminar", produces ="application/json")
	public List<Resultado> eliminar(@RequestParam("url") String url){
		return buscadorService.eliminarResultado(url);
	}
	
	@PutMapping(value="actualizar", produces ="application/json", consumes = "application/json") //ORDEN DA IGUAL
	public Resultado actualizar(@RequestBody Resultado resultado) {
		return buscadorService.actualizarDescripcion(resultado.getUrl(), resultado.getDescripcion());
	}
}
