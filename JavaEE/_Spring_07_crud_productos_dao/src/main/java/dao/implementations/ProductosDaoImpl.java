package dao.implementations;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dao.interfaces.ProductosDao;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import model.Producto;

@Repository // <<implementar
public class ProductosDaoImpl implements ProductosDao {

	@PersistenceContext
	private EntityManager em;
	
	@Transactional
	@Override
	public void save(Producto producto) {
		em.persist(producto);
	}

	@Override
	public Producto findByNombre(String nombre) {
		String jpql = "select p from Producto p where p.nombre=?1";
		TypedQuery<Producto> query = em.createQuery(jpql, Producto.class);
		query.setParameter(1, nombre);
		List<Producto> productos = query.getResultList();
		return productos.size() > 0 ? productos.get(0) : null;
	}

	@Override
	public List<Producto> findByCategoria(String categoria) {
		String jpql = "SELECT p FROM Producto p WHERE p.categoria=?1";
		TypedQuery<Producto> query = em.createQuery(jpql, Producto.class);
		query.setParameter(1, categoria);
		return query.getResultList();
	}

	@Transactional
	@Override
	public void update(Producto producto) {
		em.merge(producto);
	}

	@Transactional
	@Override
	public void delete(Producto producto) {
		//em.refresh(producto);
		//em.remove(em.find(Producto.class, producto.getIdproductos())); //así si funciona
		Producto pr = em.merge(producto);
	    em.remove(pr);
	}

	@Override
	public void deleteByNombre(String nombre) {
		String jpql = "delete from Producto p where p.nombre=?1";
		Query query = em.createQuery(jpql);
		query.setParameter(1, nombre);
		query.executeUpdate();
	}

}
