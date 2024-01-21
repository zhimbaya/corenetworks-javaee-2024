package service;

import java.util.ArrayList;
import java.util.List;

import model.Producto;

public class ProductoService {
	private static List<Producto> productos = new ArrayList<>();

	public void agregarProducto(String nombre, double precio, String categoria) {
		productos.add(new Producto(nombre, precio, categoria));
	}

	public void eliminarProducto(String nombre) {
		productos.removeIf(p -> p.getNombre().equals(nombre));
	}

	public List<Producto> buscarPorCategoria(String categoria) {
		List<Producto> aux = new ArrayList<Producto>();
		for (Producto p : productos) {
			if (p.getCategoria().equals(categoria)) {
				aux.add(p);
			}
		}
		return aux;
	}
}
