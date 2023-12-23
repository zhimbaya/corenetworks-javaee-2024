package service;

public class Test {

	public static void main(String[] args) {
		CuentaBancariaLimite cb1 = new CuentaBancariaLimite(100, 50);
		cb1.ingresar(30);
		//cb1.extraer(80);
		System.out.println(cb1.getSaldo());

	}

}
