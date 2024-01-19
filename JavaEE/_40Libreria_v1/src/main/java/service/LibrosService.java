package service;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.Libro;
import model.Tema;

public class LibrosService {

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("libreriaPU");
		return factory.createEntityManager();
	}

	public List<Tema> getTemas() {
		String jpql = "select t from Tema t";
		TypedQuery<Tema> query = getEntityManager().createQuery(jpql, Tema.class);
		return query.getResultList();
	}
	public List<Libro> getLibros(){
		String jpql = "select l from Libro l";
		TypedQuery<Libro> query = getEntityManager().createQuery(jpql, Libro.class);
		return query.getResultList();
	}
	
	public List<Libro> getLibrosTemas(int idTema){
		String jpql = "select l from Libro l where l.idTema =?1";
		TypedQuery<Libro> query = getEntityManager().createQuery(jpql, Libro.class);
		query.setParameter(1, idTema);
		return query.getResultList();
	}

}
