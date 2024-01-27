package service;

import java.util.ArrayList;
import java.util.List;

import dtos.LibroDto;
import dtos.TemaDto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.Libro;
import model.Tema;
import service.mappers.Mapeador;

public class LibrosService {
	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("libreriaPU");
		return factory.createEntityManager();
	}

	// SE DEVUELVE TEMADTO, LIBRODTO, ...
	public List<TemaDto> getTemas() {
		String jpql = "select t from Tema t";
		TypedQuery<Tema> query = getEntityManager().createQuery(jpql, Tema.class);
		List<Tema> temas = query.getResultList();
		List<TemaDto> temasDto = new ArrayList<>();
		for(Tema t : temas) {
			TemaDto temaDto = Mapeador.temaEntityToDto(t);
			temasDto.add(temaDto);
		}
		return temasDto;
		//programación funcional
		//return query.getResultList().stream().map(l->Mapeador.temaEntityToDto(l)).toList();
	}

	public List<LibroDto> librosTema(int idTema) {
		String jpql = "select l from Libro l";
		TypedQuery<Libro> query;
		if (idTema != 0) {
			jpql += " where l.idTema=?1";
			query = getEntityManager().createQuery(jpql, Libro.class);
			query.setParameter(1, idTema);
		} else {
			query = getEntityManager().createQuery(jpql, Libro.class);
		}
		return query.getResultList().stream().map(l->Mapeador.libroEntityToDto(l)).toList();
	}

	public LibroDto getLibro(int isbn) {
		return Mapeador.libroEntityToDto(getEntityManager().find(Libro.class, isbn));
	}

	public TemaDto getTema(int idTema) {
		return Mapeador.temaEntityToDto(getEntityManager().find(Tema.class, idTema));
	}
}
