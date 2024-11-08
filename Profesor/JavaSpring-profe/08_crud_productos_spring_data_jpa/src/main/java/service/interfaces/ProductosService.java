package service.interfaces;

import java.util.List;

import model.Producto;

public interface ProductosService {

	boolean agregarProducto(Producto producto);

	List<Producto> buscarPorCategoria(String categoria);

	//devuelve el objeto Producto que ha sido eliminado
	Producto eliminarProducto(String nombre);
	
	void modificarPrecio(String nombre,double nuevoPrecio);
	
	List<Producto> todos();

}