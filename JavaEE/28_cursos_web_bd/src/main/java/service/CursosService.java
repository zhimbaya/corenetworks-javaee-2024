package service;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import model.Curso;

public class CursosService {

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cursosPU");
		return factory.createEntityManager();
	}

	public void agregarCurso(String nombre, int duracion, double precio) {
		Curso pr = new Curso(0, nombre, duracion, precio);
		if (buscarPorDenominacion(nombre) == null) {
			EntityManager em = getEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.persist(pr);
			tx.commit();
		}
	}

	public Curso buscarPorDenominacion(String nombre) {
		String jpql = "select p from Curso p where p.nombre = ?1";
		TypedQuery<Curso> query = getEntityManager().createQuery(jpql, Curso.class);
		query.setParameter(1, nombre);
		
		try {
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
		/* esto tb estaria bien
		List<Curso> cursos = query.getResultList();
		return cursos.size()>0?cursos.get(0):null;*/
	}

	public List<Curso> buscarPorPreciosCursoMax(double precioMax) {
		String jpql = "select p from Curso p where p.precio <= ?1";
		TypedQuery<Curso> query = getEntityManager().createQuery(jpql, Curso.class);
		query.setParameter(1, precioMax);
		return query.getResultList();
	}

	public void eliminarCurso(String nombre) {
		String jpql = "delete from Curso p where p.nombre =?1";
		EntityManager em = getEntityManager();
		Query query = em.createQuery(jpql);
		query.setParameter(1, nombre);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		query.executeUpdate();
		tx.commit();
	}

	public void modificarDuracion(String nombre, int nuevaDuracion) {
		/*
		String jpql = "select p from Curso p where p.duracion=?1";
		TypedQuery<Curso> query = getEntityManager().createQuery(jpql, Curso.class);
		query.setParameter(1, nombre);
		List<Curso> cursos = query.getResultList();
		for (Curso c : cursos) {
			if (c.getNombre().equals(nombre)) {
				c.setDuracion(nuevaDuracion);
				break;
			}
		}*/
		//También podría ser asi
		
		String jpql = "update Curso c set c.duracion=?1 where c.nombre=?2";
		EntityManager em = getEntityManager();
		Query query = em.createQuery(jpql);
		query.setParameter(1, nuevaDuracion);
		query.setParameter(2, nombre);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		query.executeUpdate();
		tx.commit();
	}
}
