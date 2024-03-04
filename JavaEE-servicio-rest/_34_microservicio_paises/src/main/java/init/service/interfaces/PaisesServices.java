package init.service.interfaces;

import java.util.List;

import init.model.Pais;

public interface PaisesServices {
	List<String> continentes();
	List<Pais> paisesPorContinente(String continente);
	Pais paisMasPoblado();
}
