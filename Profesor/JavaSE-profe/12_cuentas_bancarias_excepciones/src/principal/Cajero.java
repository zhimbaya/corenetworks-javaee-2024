package principal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import exceptions.SaldoNegativoException;
import model.Movimiento;
import service.CuentaBancariaMovimientos;

public class Cajero {
	static CuentaBancariaMovimientos cuenta;
	public static void main(String[] args) {
		int opcion;
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Introduce saldo inicial de la cuenta:");
			double saldo=sc.nextDouble();
			System.out.println("Introduce límite de extracción:");
			double limite=sc.nextDouble();
			cuenta=new CuentaBancariaMovimientos(saldo, limite);
			do {
				try {
					mostrarMenu();
					opcion=sc.nextInt();
					switch(opcion) {
						case 1:
							ingresar();
							break;
						case 2:
							extraer();
							break;
						case 3:
							saldoMovimientos();
							break;
						case 4:
							System.out.println("Adios");
					}
				}catch(InputMismatchException ex) {
					System.out.println("Opcion incorrecta, o dato erroneo");
					sc=new Scanner(System.in);
					opcion=0; //forzar de nuevo el menú
				}
			}while(opcion!=4);
		}
		catch(InputMismatchException ex) {
			System.out.println("solo valores numéricos!!!");
		}

	}
	static void mostrarMenu() {
		System.out.println("1.- Ingresar");
		System.out.println("2.- Extraer");
		System.out.println("3.- Saldo y movimientos");
		System.out.println("4.- Salir");
	}
	static void ingresar() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce cantidad:");
		double cantidad=sc.nextDouble();
		cuenta.ingresar(cantidad);
	}
	static void extraer() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce cantidad:");
		double cantidad=sc.nextDouble();
		try {
			cuenta.extraer(cantidad);
		}
		catch(SaldoNegativoException ex) {
			//System.out.println("La cuenta no puede quedarse en números rojos");
			
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			
		}
	}
	static void saldoMovimientos() {
		System.out.println("Saldo actual: "+cuenta.getSaldo());
		ArrayList<Movimiento> movimientos=cuenta.obtenerMovimientos();
		for(Movimiento m:movimientos) {
			System.out.println(m.getCantidad()+"-"+m.getFechaHora()+"-"+m.getTipo());
		}
	}

}
