package service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.interfaces.ProductosDao;
import model.Producto;
import service.interfaces.ProductosService;

@Service // spring
public class ProductosServiceImpl implements ProductosService {

	@Autowired
	ProductosDao productosDao;
	
	@Override
	public boolean agregar(Producto productos) {
		if (productosDao.findByNombre(productos.getNombre()) != null) {
			return false;
		}
		productosDao.save(productos);
		return true;
	}

	@Override
	public List<Producto> buscar(String categoria) { // JPA
		return productosDao.findByCategoria(categoria);
	}

	@Override
	public Producto eliminar(String nombre) {
		Producto prod = productosDao.findByNombre(nombre);
		if (prod == null) {
			return null;
		}
		productosDao.deleteByNombre(nombre);
		return prod;
	}

	@Override
	public Producto buscarPorNombre(String nombre) {
		return productosDao.findByNombre(nombre);
	}

	@Override
	public void modificar(String nombre, double precio) {
		Producto producto = productosDao.findByNombre(nombre);
		if (producto != null) {
			producto.setPrecio(precio);
			productosDao.save(producto); 
		}
	}

	@Override
	public List<Producto> todos() {
		return productosDao.findAll();
	}
}
