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

	public List<Curso> buscarPorPreciosCursoMax(double precioMax) {
		String jpql = "select p from Curso p where p.precio <= ?1";
		TypedQuery<Curso> query = getEntityManager().createQuery(jpql, Curso.class);
		query.setParameter(1, precioMax);
		return query.getResultList();
	}

	private Curso buscarPorDenominacion(String nombre) {
		String jpql = "select c from Curso c where c.nombre=?1";
		TypedQuery<Curso> query = getEntityManager().createQuery(jpql, Curso.class);
		query.setParameter(1, nombre);
		try {
			return query.getSingleResult();
		} catch (NoResultException ex) {
			return null;
		}

		/*
		 * List<Curso> cursos=query.getResultList(); return
		 * cursos.size()>0?cursos.get(0):null;
		 */
	}

	public List<Curso> cursosPorDuracion(int min, int max) {
		String jpql = "select c from Curso c where c.duracion>=?1 and c.duracion<=?2";
		TypedQuery<Curso> query = getEntityManager().createQuery(jpql, Curso.class);
		query.setParameter(1, min);
		query.setParameter(2, max);
		return query.getResultList();
	}

	public List<Curso> preciosCursoMax(double precioMax) {
		String jpql = "select c from Curso c where c.precio<=?1";
		/*
		 * TypedQuery<Curso> query=getEntityManager().createQuery(jpql,Curso.class);
		 * query.setParameter(1, precioMax); return query.getResultList();
		 */
		Query query = getEntityManager().createQuery(jpql);
		query.setParameter(1, precioMax);
		return (List<Curso>) query.getResultList();
	}
}
