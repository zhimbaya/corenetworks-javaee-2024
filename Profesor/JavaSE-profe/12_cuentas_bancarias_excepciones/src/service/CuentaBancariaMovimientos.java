package service;

import java.time.LocalDateTime;
import java.util.ArrayList;

import exceptions.SaldoNegativoException;
import model.Movimiento;

public class CuentaBancariaMovimientos extends CuentaBancariaLimite {
	private ArrayList<Movimiento> movimientos=new ArrayList<>();

	public CuentaBancariaMovimientos(double saldo, double limite) {
		super(saldo, limite);
		
	}
	
	public ArrayList<Movimiento> obtenerMovimientos(){
		return movimientos;
	}

	
	
	//sobrescribimos los métodos ingresar y extraer para que registren el movimiento
	//producido
	@Override
	public void extraer(double cantidad) throws SaldoNegativoException{
		
		super.extraer(cantidad);
		movimientos.add(new Movimiento(cantidad,LocalDateTime.now(),TipoMovimiento.EXTRACCION));
	}

	@Override
	public void ingresar(double cantidad) {
		movimientos.add(new Movimiento(cantidad,LocalDateTime.now(),TipoMovimiento.INGRESO));
		super.ingresar(cantidad);
	}
}
