package service.implementations;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import model.Producto;
import service.interfaces.ProductosService;

@Service // spring
public class ProductosServiceImpl implements ProductosService {

	@PersistenceContext // COMO EL AUTOWIRED O INJED
	EntityManager em;

	@Transactional // SE UTILIZA EL DE SPRING E INICIE Y CONFIRME LA TX AUTOMÁTICAMENTE
	@Override
	public boolean guardar(Producto productos) {
		if (buscarPorNombre(productos.getNombre()) != null) {
			return false;
		}
		em.persist(productos);
		return true;

	}

	@Override
	public List<Producto> buscar(String categoria) { // JPA
		String jpql = "SELECT p FROM Producto p WHERE p.categoria=?1";
		TypedQuery<Producto> query = em.createQuery(jpql, Producto.class);
		query.setParameter(1, categoria);
		return query.getResultList();
	}

	@Transactional
	@Override
	public Producto eliminar(String nombre) {
		Producto productos = buscarPorNombre(nombre);
		String jpql = "delete from Producto p where p.nombre=?1";
		Query query = em.createQuery(jpql);
		query.setParameter(1, productos.getNombre());
		query.executeUpdate();
		return productos;
	}

	@Override
	public Producto buscarPorNombre(String nombre) {
		String jpql = "select p from Producto p where p.nombre=?1";
		TypedQuery<Producto> query = em.createQuery(jpql, Producto.class);
		query.setParameter(1, nombre);
		List<Producto> productos = query.getResultList();
		return productos.size() > 0 ? productos.get(0) : null;
	}

	@Transactional
	@Override
	public void modificar(String nombre, double precio) {
		/*
		 * String jpql = "update Producto p set p.precio=?1 where p.nombre=?2"; Query
		 * query = em.createQuery(jpql); query.setParameter(1, precio);
		 * query.setParameter(2, nombre); query.executeUpdate();
		 */
		Producto producto = buscarPorNombre(nombre);
		if (producto != null) {
			producto.setPrecio(precio);
			em.merge(producto); // actualiza el dato de una entidad en la base de datos.
		}
	}

}
