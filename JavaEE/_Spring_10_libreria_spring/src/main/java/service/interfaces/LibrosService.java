package service.interfaces;

import java.util.List;

import model.Libro;
import model.Tema;

public interface LibrosService {
	List<Tema> getTemas();

	List<Libro> getLibrosByTema(int idTema);

	Libro getLibro(int isbn);

	Tema getTema(int idTema);
}
