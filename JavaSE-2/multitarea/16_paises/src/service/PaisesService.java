package service;

import java.util.List;

import model.Pais;

public interface PaisesService {

	List<Pais> paisesPorContienente(String continente);

	List<String> continentes();

}