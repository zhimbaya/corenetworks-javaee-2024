package service;

public class CuentaLimite extends Cuenta {

	private double limite;
	
	public CuentaLimite(int codigoCuenta, double saldo, int limite) {
		super(codigoCuenta, saldo);
		this.limite=limite;
	}
	
	public void ajustarLimite() {
		 limite = getSaldo()/2;
	}

	@Override
	public void ingresar(double cantidad) {
		super.ingresar(cantidad);
	}

	@Override
	public void extraer(double cantidad) {
		if(cantidad <= limite) {
			super.extraer(cantidad);
		}else {
			super.extraer(limite);
		}
	}

}
