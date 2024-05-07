package init.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import init.model.Libro;
import init.service.interfaces.LibrosServices;

@RestController
public class LibrosController {
	@Autowired
	LibrosServices libroService;
	
	@GetMapping(value = "catalogo", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Libro>> catalogo(){
		return new ResponseEntity<>(libroService.catalogo(), HttpStatus.OK);
	}
	
	@GetMapping(value="tematicas", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<String>> tematicas() {
		return new ResponseEntity<>(libroService.buscarTematicas(), HttpStatus.OK);
	}
	
	@GetMapping(value="libro/{isbn}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Libro> libro(@PathVariable("isbn") int isbn){
		Libro lb = libroService.buscarLibro(isbn);
		if(lb != null) {
			return new ResponseEntity<>(lb, HttpStatus.OK);
		}
		return new ResponseEntity<>(lb,HttpStatus.NOT_FOUND);
	}
	public ResponseEntity<Void> alta(@RequestBody Libro libro){
		if(libroService.alta(libro)) {
			return new ResponseEntity<>(HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.CONFLICT);
	}
}
