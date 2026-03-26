package modelo;

import java.time.LocalDateTime;

public class Movimiento {
	private double cantidad; 
	private LocalDateTime fechaHora; 
	private String tipo;
	
	public Movimiento(double cantidad, LocalDateTime fechaHora, String tipo) {
		super();
		this.cantidad = cantidad;
		this.fechaHora = fechaHora;
		this.tipo=tipo;
	}
	public Movimiento() {
		super();
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public LocalDateTime getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(LocalDateTime fechaHora) {
		this.fechaHora = fechaHora;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
