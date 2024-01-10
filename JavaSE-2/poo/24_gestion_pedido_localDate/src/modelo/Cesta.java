package modelo;

import java.time.LocalDate;
import java.util.Date;

public class Cesta {
	private String producto;
	private LocalDate fechaPedido;
	private int precio;
	public Cesta(String producto, int precio, LocalDate fechaPedido) {
		super();
		this.producto = producto;
		this.fechaPedido = fechaPedido;
		this.precio = precio;
	}
	public Cesta() {
		super();
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public LocalDate getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(LocalDate fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	

}
