package service;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import model.Producto;

public class ProductosService {
	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("productosPU");
		return factory.createEntityManager();
	}

	public Producto buscarProducto(int idProducto) {
		return getEntityManager().find(Producto.class, idProducto);
	}

	public List<Producto> buscarPorCategoria(String categoria) {
		// String jpql = "select p from Producto p where p.categoria = '"+categoria+"'";
		// String jpql = "select p from Producto p where p.categoria = :cat";
		// CONSULTAS PARAMETRIZADAS POR POSICIÓN
		String jpql = "SELECT p FROM Producto p WHERE p.categoria=?1";
		TypedQuery<Producto> query = getEntityManager().createQuery(jpql, Producto.class);
		// SUSTITUIMOS PARÁMETROS POR VALORES
		query.setParameter(1, categoria);
		// DEVUELVE LISTA DE RESULTADOS
		return query.getResultList();

	}
}
