package init.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import init.model.Libro;

public interface LibroDao extends JpaRepository<Libro, Integer> {
//-catalogo de libros

//-lista de tematicas
//List<Libro> buscar(String tematica);
	@Query("select distinct l.tematica from libro l")
	public List<String> findByTematica();
//-buscador de libro por ISBN
//Libro buscarLibro (String isbn);
	
//-alta de nuevos libros
}
