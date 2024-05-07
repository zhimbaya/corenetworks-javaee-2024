package init.service.implementations;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClient;

import init.model.Formacion;
import init.service.interfaces.FormacionService;
@Service
public class FormacionServiceImpl implements FormacionService {
	@Autowired
	RestClient restClient;
	
	String urlBase="http://localhost:8500/";

	@Override
	public List<Formacion> catalogo() {
		return Arrays.asList(restClient.get()
				.uri(urlBase+"cursos")
				.retrieve()
				.body(Formacion[].class) //Formacion[].class
				);
	}

	@Override
	public List<Formacion> catalogoPorDuracionMax(int max) {		
		return catalogo().stream()
				.filter(f->f.getHoras()<=max)
				.toList();
	}

	@Override
	public void alta(Formacion formacion) {
		try {
				
		restClient.post()
		.uri(urlBase+"alta")
		.contentType(MediaType.APPLICATION_JSON)
		.body(formacion)
		.retrieve()
		.toBodilessEntity(); //ResponseEntity<void>
		}catch(HttpClientErrorException ex) {
			//TRATAMIENTO DEL ERROR
			System.out.println("**********error**********");
			ex.printStackTrace();
		}
	}

}
