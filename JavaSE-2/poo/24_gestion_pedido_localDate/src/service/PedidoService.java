package service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import modelo.Cesta;

public class PedidoService {
	Cesta cesta = new Cesta();
	ArrayList<Cesta> cestaList = new ArrayList<>();

	
	public boolean alta(String producto, int precio, LocalDate fecha) {
			if(cestaList.stream().noneMatch(c->c.getProducto().equals(producto)
					&&c.getPrecio()==precio&&c.getFechaPedido().equals(fecha)));
		return true;
	}
	
	public Cesta recientes () {
				
		return cestaList.stream()
				.max((a,b)->a.getFechaPedido().compareTo(b.getFechaPedido()))
				.orElse(null);
	}
	
	public List<Cesta> precioInferior (double p) {
			return cestaList.stream()
					.filter(c->c.getPrecio()<p)
					.toList();				
	}
	
	public List<Cesta> anteriores (int meses) {
	
		return cestaList.stream()
				.filter(c->c.getFechaPedido().isBefore(LocalDate.now().minusMonths(meses)))
				.toList();			
								
	}
	//devuelve una tabla con una particion de pedidos
	public Map<Boolean,List<Cesta>> particionPedidos() {
		//en una variable primero calculamos la media
		 double media = cestaList.stream() //Stream<Cesta>
				.collect(Collectors.averagingDouble(c->c.getPrecio())); //tenemos la media
		 
		return cestaList.stream()
				.collect(Collectors.partitioningBy(c->c.getPrecio()>
				media));
		
	}
	
}
