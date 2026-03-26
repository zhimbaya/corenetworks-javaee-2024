package service;

import java.time.LocalDateTime;
import java.util.ArrayList;

import exceptions.SaldoNegativoException;
import model.Movimiento;
import model.TipoMovimiento;

public class CuentaBancariaMovimientos extends CuentaBancariaLimite {

	/*
	 * Clase CuentaBancariaMovimientos Clase que hereda CuentaBancariaLimite.
	 * Incopora un nuevo método obtenerMovimientos que devolverá un ArraList con los
	 * movimientos realizados en la cuenta Cada movimiento se define por: cantidad,
	 * fechaHora, tipo (ingreso o extracción)
	 */


	private ArrayList<Movimiento> movimientos = new ArrayList<>();

	public CuentaBancariaMovimientos(double saldo, double limite) {
		super(saldo, limite);

	}

	public ArrayList<Movimiento> obtenerMovimientos() {
		return movimientos;
	}

	@Override
	public void extraer(double cantidad) throws SaldoNegativoException{
		movimientos.add(new Movimiento(cantidad, LocalDateTime.now(), TipoMovimiento.EXTRACCION));
		super.extraer(cantidad);
	}

	@Override
	public void ingresar(double cantidad) {
		movimientos.add(new Movimiento(cantidad, LocalDateTime.now(), TipoMovimiento.INGRESO));
		super.ingresar(cantidad);
	}

	// sobreescribimos los métodos y extraer para que registren el movimiento
	// producto

}
