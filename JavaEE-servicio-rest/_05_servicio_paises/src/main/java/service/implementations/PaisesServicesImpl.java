package service.implementations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import model.Pais;
import service.interfaces.PaisesServices;

@Service
public class PaisesServicesImpl implements PaisesServices {

	@Autowired
	RestClient restCliente;

	public List<Pais> paises(){
		String urlBases = "https://restcountries.com/v2/all";
		return Arrays.asList(restCliente.get()
				.uri(urlBases)
				.retrieve()
				.body(Pais[].class)
				);
	}
	
	@Override
	public List<String> continentes() {
		return paises().stream()
				.map(p->p.getContinente()) //transforma Pais en String
				.distinct() //elimina duplicados
				.toList(); //convierte Stream final a lista
	}

	@Override
	public List<Pais> paisesPorContinente(String continente) {
		return paises().stream()
				.filter(p->p.getContinente().equals(continente)) 
				.toList();
	}

	@Override
	public Pais paisMasPoblado() {
		return paises().stream()
				.max(Comparator.comparingLong(p->p.getPoblacion()))
				.orElse(null);
	}
	


}
