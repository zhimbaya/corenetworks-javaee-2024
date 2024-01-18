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

	public void agregarProducto(String nombre, String categoria, double precio) {
		// SE LE PONE EL VALOR 0 AL idProducto PERO SE PODRÍA HABER PUESTO CUALQUIER
		// OTRO VALOR
		// YA QUE EL MOTOR DE PERSISNTECIA NO LO VA A UTILIZAR A LA HORA DE HACER EL
		// INSERT
		Producto pr = new Producto(0, nombre, categoria, precio);
		EntityManager em = getEntityManager();
		// DEFINIMOS LA OPERACIÓN DE ACCIÓN DENTRO DE UNA TRANSACCIÓN
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(pr);
		tx.commit();
	}

	public Producto buscarProducto(int idProducto) {
		return getEntityManager().find(Producto.class, idProducto);
	}

	public void eliminarProducto(int idProducto) {
		// BUSCAMOS EL PRODUCTO QUE QUEREMOS ELIMINAR Y SI EXISTE LO ELIMINAMOS
		Producto pr = buscarProducto(idProducto);
		if (pr != null) {
			EntityManager em = getEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.remove(pr);
			tx.commit();
		}
	}

	public List<Producto> buscarPorCategoria(String categoria) {
		// String jpql = "select p from Producto p where p.categoria = '"+categoria+"'";
		// String jpql = "select p from Producto p where p.categoria = :cat";
		// CONSULTAS PARAMETRIZADAS POR POSICIÓN
		String jpql = "select p from Producto p where p.categoria = ?1";
		TypedQuery<Producto> query = getEntityManager().createQuery(jpql, Producto.class);
		// SUSTITUIMOS PARÁMETROS POR VALORES
		query.setParameter(1, categoria);
		// DEVUELVE LISTA DE RESULTADOS
		return query.getResultList();

	}

	public void eliminarPorNombre(String nombre) {
		String jpql = "delete from Producto p where p.nombre =?1";
		EntityManager em = getEntityManager();
		Query query = em.createQuery(jpql);
		query.setParameter(1, nombre);
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		query.executeUpdate();
		tx.commit();
	}
}
