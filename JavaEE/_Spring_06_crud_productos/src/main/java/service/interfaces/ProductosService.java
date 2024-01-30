package service.interfaces;

import java.util.List;

import model.Producto;

public interface ProductosService {
	
	boolean guardar(Producto producto);

	List<Producto> buscar(String categoria);

	//DEVUELVE EL OBJETO PRODUCTO QUE HA SIDO ELIMINADO
	Producto eliminar(String nombre);

	void modificar(String nombre, double precio);
	
	Producto buscarPorNombre(String nombre);
}
