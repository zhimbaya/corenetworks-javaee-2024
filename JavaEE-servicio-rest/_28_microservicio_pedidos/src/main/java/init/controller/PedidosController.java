package init.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import init.model.Pedido;
import services.interfaces.PedidosService;
@CrossOrigin("*") //para gateway
@RestController
public class PedidosController {
	@Autowired
	PedidosService service;

	@PostMapping(value="alta",consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> alta(@RequestBody Pedido pedido){
			service.alta(pedido);
			return new ResponseEntity <> (HttpStatus.OK);
	}
	
	@GetMapping(value="pedidos", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity <List<Pedido>> pedidos(){
		return new ResponseEntity<> (service.pedidos(),HttpStatus.OK);
	}
}
