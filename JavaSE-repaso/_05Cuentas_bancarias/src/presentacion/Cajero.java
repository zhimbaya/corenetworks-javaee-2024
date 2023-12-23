package presentacion;

import java.util.ArrayList;
import java.util.Scanner;

import model.Movimiento;
import service.CuentaBancariaMovimientos;

public class Cajero {
	/*
	 * Al iniciar el programa, se solicita un saldo inicial y un límite. A partir de
	 * ahí, se mostrará el menú:
	 * 
	 * 1.- Ingresar 2.- Extraer 3.- Saldo y movimientos 4.- Salir
	 */
	static CuentaBancariaMovimientos cuenta;

	public static void main(String[] args) {
		int opcion;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce saldo inicial de la cuenta:");
		double saldo = sc.nextDouble();
		System.out.println("Introduce límite de extracción:");
		double limite = sc.nextDouble();
		cuenta = new CuentaBancariaMovimientos(saldo, limite);
		
		do {
			mostrarMenu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				ingresarSaldo();
				break;
			case 2:
				extraerSaldo();
				break;
			case 3:
				saldoMovimientos();
				break;
			case 4:
				System.out.println("Adios!!");
				System.exit(0);
				;
				break;
			default:
				break;
			}
		} while (opcion != 5);
		sc.close();
	}

	private static void ingresarSaldo() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce el ingreso");
		Double ingreso = scan.nextDouble();
		cuenta.ingresar(ingreso);
	}

	private static void extraerSaldo() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce la cantidad");
		Double cantidad = scan.nextDouble();
		cuenta.extraer(cantidad);
	}

	private static void saldoMovimientos() {
		System.out.println("Saldo actual: " + cuenta.getSaldo());
		ArrayList<Movimiento> movimientos = cuenta.obtenerMovimientos();
		for (Movimiento m : movimientos) {
			System.out.println("MOVIMIENTO: " + m.getCantidad() + " || " + m.getFechaHora() + " || " + m.getTipo());
		}
	}

	private static void mostrarMenu() {
		System.out.println("----------- M E N Ú -----------");
		System.out.println("1.- Ingresar");
		System.out.println("2.- Extraer");
		System.out.println("3.- Saldo y Movimientos");
		System.out.println("4.- Salir");
		System.out.println("----------- F I N -----------");
	}
	
}
