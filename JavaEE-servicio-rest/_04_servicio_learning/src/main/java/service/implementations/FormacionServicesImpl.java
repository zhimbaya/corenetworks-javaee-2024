package service.implementations;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import model.Formacion;
import service.interfaces.FormacionServices;

@Service
public class FormacionServicesImpl implements FormacionServices {

	@Autowired
	RestClient restClient;
	
	String urlBases = "http://localhost:8080/02_servicio_crud_cursos/";
	
	@Override
	public List<Formacion> catalogo() {
		
		return Arrays.asList(restClient.get()
				.uri(urlBases + "cursos")
				.retrieve()
				.body(Formacion[].class));
		 
	}

	@Override
	public List<Formacion> catalogoPorDuracion(int max) {
		return catalogo()
				.stream()
				.filter(f->f.getHoras()<=max)
				.toList();
	}

	@Override
	public void alta(Formacion foramacion) {
		restClient.post()
		.uri(urlBases+"alta")
		.contentType(MediaType.APPLICATION_JSON)
		.body(foramacion)
		.retrieve();
	}

}
