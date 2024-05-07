package init.service.interfaces;

import java.util.List;

import init.model.Producto;

public interface ProductosService {
	List<Producto> productos();
	double precioProducto(int codigoProducto);
	void actualizarStock(int codigoProducto, int unidades);
}
