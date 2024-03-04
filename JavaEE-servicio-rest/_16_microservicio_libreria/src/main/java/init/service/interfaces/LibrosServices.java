package init.service.interfaces;

import java.util.List;

import init.model.Libro;

public interface LibrosServices {

//	-catalogo de libros
	List<Libro> catalogo();
//	-lista de tematicas
	List<String> buscarTematicas();
//	-buscador de libro por ISBN
	Libro buscarLibro (int isbn);
//	-alta de nuevos libros
	boolean alta(Libro libro);
}
