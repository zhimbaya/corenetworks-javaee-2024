package modelo;

public class Producto {
	
	/*Programa para gestion de producto:
		1.- Nuevo produocto   : Pide datos y guarda el producto
		2.- Bajar precios     : Pide porcentaje y baja precio de todos los productos
		3.- Ordenar productos : Ordena productos por su precio
		4.- Eliminar productos: Pide categoria y elimina todos los productos de esta categoria
		5.- Sibir precios por categoria: Pide categoria y peocentaje, sube los precio solo de esta categoria
		6.- Mostrar todos los productos: Muestra datos de todos
		7.- Salir

		Cada producot se caracteriza por: nombre, precio, categoria */
	
	private String nombre;
	private double precio;
	private String categoria;
	public Producto(String nombre, double precio, String categoria) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.categoria = categoria;
	}
	public Producto() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


}
