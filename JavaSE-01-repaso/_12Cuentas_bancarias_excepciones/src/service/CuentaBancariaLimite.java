package service;

import exceptions.SaldoNegativoException;

public class CuentaBancariaLimite extends CuentaBancaria {

	/*
	 * clase CuentaBancariaLimite Clase que hereda CuentaBancaria. Incorporará un
	 * atributo "limite", para limitar la extracción a dicho valor. Dispondrá
	 * también de un método ajustarLimite(), que fijará el límite en la mitad del
	 * saldo
	 */
	private double limite;

	public CuentaBancariaLimite(double saldo,double limite) {
		super(saldo);
		this.limite = limite;
	}

	@Override
	public void extraer(double cantidad) throws SaldoNegativoException{	
		if (cantidad <= limite) {
			super.extraer(cantidad);
		} else {
			super.extraer(limite);
		}
	}

	public void ajustarLimite() {
		limite = getSaldo()/2;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
