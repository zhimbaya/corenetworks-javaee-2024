package modelo;

import java.util.Date;

public class Cesta {
	private String producto;
	private Date fechaPedido;
	private int precio;
	public Cesta(String producto, int precio, Date fechaPedido) {
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
	public Date getFechaPedido() {
		return fechaPedido;
	}
	public void setFechaPedido(Date fechaPedido) {
		this.fechaPedido = fechaPedido;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	

}
