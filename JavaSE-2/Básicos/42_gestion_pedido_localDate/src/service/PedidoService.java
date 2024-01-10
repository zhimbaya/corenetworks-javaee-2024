package service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

import modelo.Cesta;

public class PedidoService {
	Cesta cesta = new Cesta();
	ArrayList<Cesta> cestaList = new ArrayList<>();

	
	public boolean alta(String producto, int precio, LocalDate fecha) {
			Cesta cesta=new Cesta(producto, precio, fecha);
			cestaList.add(cesta);
		return true;
	}
	public Cesta recientes () {
		Cesta cesta=cestaList.get(0);
		LocalDate fechaReciente=cesta.getFechaPedido();
		for(Cesta c:cestaList) {
			if(c.getFechaPedido().isAfter(fechaReciente)) { //si encontramos una fecha más reciente, actualizamos variables
				fechaReciente=c.getFechaPedido();
				cesta=c;
			}
		}
		return cesta;
	}
	
	public ArrayList<Cesta> precioInferior (double p) {
		ArrayList<Cesta> resultado=new ArrayList<Cesta>();
		for (Cesta c : cestaList) {
			if (c.getPrecio() < p) {
				resultado.add(c);
			}
		}
		return resultado;
	}
	
	public ArrayList<Cesta> anteriores (int meses) {
		ArrayList<Cesta> res=new ArrayList<Cesta>();
		LocalDate referencia=LocalDate.now().minusMonths(meses);
		for(Cesta c:cestaList) {
			if(c.getFechaPedido().isBefore(referencia)) {
				res.add(c);
			}
		}
		return res;
	}
	
	
}
