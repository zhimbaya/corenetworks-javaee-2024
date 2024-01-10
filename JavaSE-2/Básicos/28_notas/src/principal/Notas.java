package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Notas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Double> notas=new ArrayList<>();
		int opcion;
		do {
			mostrarMenu();
			opcion=sc.nextInt();//lee la opción elegida
			switch(opcion) { //evaluamos
				case 1:
					System.out.println("Introduce nota");
					notas.add(sc.nextDouble());
					break;
				case 2:
					System.out.println("Introduce posición");
					notas.remove(sc.nextInt());
					break;
				case 3:
					System.out.println("La nota media es: "+media(notas));
					break;
				case 4:
					System.out.println("Total de aprobados: "+aprobados(notas));
					break;
				
				case 5:
					System.out.println("---Adios---");
			}
		}while(opcion!=5);

	}
	static void mostrarMenu() {
		System.out.println("1. Añadir nota");
		System.out.println("2. Eliminar nota por posición");
		System.out.println("3. Nota media");
		System.out.println("4. total de aprobados");
		System.out.println("5. Salir");
	}
	
	static double media(ArrayList<Double> notas) {
		double res=0;
		for(double d:notas) {
			res+=d;
		}
		return res/notas.size();
	}
	static int aprobados(ArrayList<Double> notas) {
		int cont=0;
		for(double d:notas) {
			if(d>=5) {
				cont++;
			}
		}
		return cont;
	}

}