package service;

import exceptions.SaldoNegativoException;

public class CuentaLimite extends Cuenta {
	private double limite;

	public CuentaLimite(String codigoCuenta, double saldo, double limite) {
		
		super(codigoCuenta, saldo);
		this.limite = limite;
	}
	public void ajustarLimite() {
		limite=getSaldo()/2;
	}
	
	@Override
	public void extraer(double cantidad) throws SaldoNegativoException {
		if(cantidad<=limite) {
			super.extraer(cantidad);
		}else {
			super.extraer(limite);
		}
	}
	
}
