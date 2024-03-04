package init.service.implementations;

import java.util.Arrays;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import init.model.Libro;
import init.service.interfaces.TiendaService;

@Service
public class TiendaServiceImpl implements TiendaService {

	@Autowired
	RestClient restClient;
	@Value("${app.user}")
	String usuario;
	@Value("${app.password}")
	String pass;
	String urlBase="http://localhost:8800/";
	
	@Override
	public List<Libro> buscarLibro(String tematica) {
		return Arrays.asList(restClient.get()
				.uri(urlBase+"catalogo")
				.header("Authorization", "Basic "+getBase64(usuario,pass))
				.retrieve()
				.body(Libro[].class)
			)
			.stream()
			.filter(b->b.getTematica().equals(tematica))
			.toList();
	}

	@Override
	public List<String> catalogo() {
		return Arrays.asList(restClient.get()
				.uri(urlBase+"catalogo")
				.retrieve()
				.body(String[].class)
				);
	}
	private String getBase64(String us, String pwd) {
		String cad=us+":"+pwd;
		return Base64.getEncoder().encodeToString(cad.getBytes());
	}

}
