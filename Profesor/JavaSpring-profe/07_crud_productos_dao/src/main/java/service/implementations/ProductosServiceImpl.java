package service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import dao.interfaces.ProductosDao;
import jakarta.persistence.TypedQuery;
import model.Producto;
import service.interfaces.ProductosService;
@Service
public class ProductosServiceImpl implements ProductosService {
	@Autowired
	ProductosDao productosDao;

	
	
	@Override
	public boolean agregarProducto(Producto producto) {
		if(productosDao.findByNombre(producto.getNombre())!=null) {
			return false;
		}
		productosDao.save(producto);
		return true;
	}
	@Override
	public List<Producto> buscarPorCategoria(String categoria){
		return productosDao.findByCategoria(categoria);
	}
	
	@Override
	public Producto eliminarProducto(String nombre) {
		Producto prod=productosDao.findByNombre(nombre);
		if(prod==null) {
			return null;
		}
		productosDao.delete(prod);
		//productosDao.deleteByNombre(nombre);
		return prod;
		
	}
	
	@Override
	public void modificarPrecio(String nombre, double nuevoPrecio) {
		
		Producto producto=productosDao.findByNombre(nombre);
		if(producto!=null) {
			producto.setPrecio(nuevoPrecio);
			productosDao.update(producto);
		}
		
	}
}
