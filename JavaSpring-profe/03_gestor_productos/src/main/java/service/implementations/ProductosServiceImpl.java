package service.implementations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import model.Producto;
import service.interfaces.ProductosService;
@Service
public class ProductosServiceImpl implements ProductosService {
	private static List<Producto> productos=new ArrayList<>();
	@Override
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
	@Override
	public List<Producto> buscarPorCategoria(String categoria){
		return productos.stream()
				.filter(p->p.getCategoria().equals(categoria))
				.toList();
		
		/*List<Producto> aux=new ArrayList<Producto>();
		for(Producto p:productos) {
			if(p.getCategoria().equals(categoria)) {
				aux.add(p);
			}
		}
		return aux;*/
	}
	@Override
	public void eliminarProducto(String nombre) {
		productos.removeIf(p->p.getNombre().equals(nombre));
	}
}
