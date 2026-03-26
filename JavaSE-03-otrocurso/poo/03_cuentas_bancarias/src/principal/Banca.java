package principal;

import java.util.ArrayList;
import java.util.Scanner;

import modelo.Movimiento;
import service.CuentaMovimientos;
import service.Cuenta;

public class Banca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scMenu = new Scanner(System.in);
		//CuentaMovimientos cuentaMovimientos = new CuentaMovimientos(0, 0, 0);
		System.out.println("Introduzca su número de cuenta");
		int cuenta = Integer.parseInt(sc.nextLine());
		System.out.println("Indique su saldo inicial");
		double saldo = Integer.parseInt(sc.nextLine());
		System.out.println("Indique su limit");
		int limit = Integer.parseInt(sc.nextLine());
		CuentaMovimientos cuentaMovimientos = new CuentaMovimientos(cuenta, saldo, limit);
		int option;
		do {
			mostrarMenu();
			option=scMenu.nextInt();
			switch(option) {
			case 1:
			
				System.out.println("Indique la cantidad a ingresar");
				double cantidad = Double.parseDouble(sc.nextLine());
				cuentaMovimientos.ingresar(cantidad);
				System.out.println("---Su saldo es: ---" + cuentaMovimientos.getSaldo());
				break;
			case 2:
				System.out.println("Indique la cantidad a retirar");
				double retirar = Double.parseDouble(sc.nextLine());
				cuentaMovimientos.extraer(retirar);
				System.out.println("---Su saldo es: ---" + cuentaMovimientos.getSaldo());
				break;
			case 3:
				ArrayList<Movimiento> movimient = cuentaMovimientos.obtenerMovimientos();
				for ( Movimiento m : movimient) {
					System.out.println("---Fecha: ---" + m.getFechaHora() );
					System.out.println("---Tipo operación: ---" + m.getTipo());
					System.out.println("---Cantidad: ---" + m.getCantidad());
				}
				break;
			case 4:
				System.out.println("---Adios---");
				break;
			}
		}while (option!=4);

	}
	static void mostrarMenu() {
		System.out.println("1. Ingresar");
		System.out.println("2. Extraer");
		System.out.println("3. Saldo y movimientos");
		System.out.println("4. Salir");
	}

}
