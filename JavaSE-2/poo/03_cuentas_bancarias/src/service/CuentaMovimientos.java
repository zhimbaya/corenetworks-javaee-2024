package service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

import modelo.Movimiento;

public class CuentaMovimientos extends CuentaLimite {
	ArrayList<Movimiento> movimientos = new ArrayList();
	
	public CuentaMovimientos(int codigoCuenta, double saldo, int limit) {
		super(codigoCuenta, saldo, limit);	
		
	}
	public ArrayList<Movimiento> obtenerMovimientos() {
		return movimientos;
		
	}	
	@Override
	public void ingresar(double cantidad) {
		movimientos.add(new Movimiento(cantidad,LocalDateTime.now(), "ingreso"));
		super.ingresar(cantidad);
	}
	@Override
	public void extraer(double cantidad) {
		movimientos.add(new Movimiento(cantidad,LocalDateTime.now(), "extraccion"));
			super.extraer(cantidad);
	}

}
