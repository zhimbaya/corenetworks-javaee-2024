package service;

public class Cuenta {
	private int codigoCuenta;
	private double saldo;
	public Cuenta(int codigoCuenta, double saldo) {
		this.codigoCuenta = codigoCuenta;
		this.saldo = saldo;
	}

	public Cuenta(int codigoCuenta) {
		this.codigoCuenta = codigoCuenta;
		this.saldo=50;
	}

	public void ingresar(double cantidad) {
		saldo+=cantidad;
	}
	
	public void extraer(double cantidad) {
		saldo-=cantidad;
	}
	public int getCodigoCuenta() {
		return codigoCuenta;
	}
	public void setCodigoCuenta(int codigoCuenta) {
		this.codigoCuenta = codigoCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

	
		
}
