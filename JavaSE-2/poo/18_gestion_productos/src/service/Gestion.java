package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import modelo.Producto;

public class Gestion {
	
	List<Producto> producto=new ArrayList<Producto>();
	
	public void alta(String nombre,double precio, String categoria) {
		//si el email no está, añadimos contacto
		//y devolvemos true
			Producto p=new Producto(nombre, precio, categoria);
			producto.add(p);
	}
	
	public void bajarPrecio (int porcentaje) {		
		/*producto.replaceAll(p->{
			p.setPrecio(p.getPrecio()*1-porcentaje/100.0);
			return p;
		});*/
		producto.forEach(p->p.setPrecio(p.getPrecio()*1-porcentaje/100.0));
	}
	
	public void subirPrecioCategoria (int porcentaje, String categoria ) {
		producto.replaceAll(p->{
			if(p.getCategoria().equals(categoria)) {
				p.setPrecio(p.getPrecio()*(1+porcentaje/100.0));
			}
			return p;
		});
	}
		
	public void eliminar (String categoria) {
		producto.removeIf(p->p.getCategoria().equals(categoria));
		
	}
	public void ordenar () {
		producto.sort((a,b) -> Double.compare(a.getPrecio(), b.getPrecio()));
	}
	public List<Producto> obtenerProductos() {
		return producto;
	}

}
