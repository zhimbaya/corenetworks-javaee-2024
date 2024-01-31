package dao.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;

import model.Producto;

public interface ProductosDao extends JpaRepository<Producto, Integer> {
	
	//void save(Producto producto); //LA IMPLEMENTACIÓN LA HACE SPRING
	Producto findByNombre(String nombre);
	List<Producto> findByCategoria(String categoria);
	//void update(Producto producto);
	//void delete(Producto producto);
	@Transactional
	@Modifying
	void deleteByNombre(String nombre);
}
