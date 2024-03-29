package service.interfaces;

import java.util.List;

import model.Pais;

public interface PaisesServices {
	List<String> continentes();
	List<Pais> paisesPorContinente(String continente);
	Pais paisMasPoblado();
}
