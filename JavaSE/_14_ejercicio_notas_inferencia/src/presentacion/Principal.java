package presentacion;

import java.util.Scanner;

import logica.GestionNotas;

public class Principal {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var gnotas = new GestionNotas();
		int op;
		
		do {
			System.out.println("1. Agregar nota");
			System.out.println("2. Ver nota media");
			System.out.println("3. Ver aprobados");
			System.out.println("4. Salir.");
			op = Integer.parseInt(sc.nextLine());
			switch (op) {
			case 1: {
				System.out.println("Nota");
				var d = Double.parseDouble(sc.nextLine());
				if (!gnotas.agregarNota(d)) {
					System.out.println("No se ha podido agregar");
				}
				break;
			}
			case 2: {
				System.out.println("Media: " + gnotas.media());
				break;
			}
			case 3: {
				System.out.println("Aprobados: " + gnotas.aprobados());
				break;
			}
			case 4: {
				System.exit(0);
				break;
			}
			default:
				System.out.println("Debes escribir una opción válida");
			}
		} while (op != 4);
		sc.close();
	}

}
