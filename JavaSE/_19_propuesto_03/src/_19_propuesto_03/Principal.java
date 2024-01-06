package _19_propuesto_03;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		GestionNumeros gnumeros = new GestionNumeros();
		Scanner sc = new Scanner(System.in);

		// realiza lectura de números
		// hasta completar los 10
		do {

			System.out.println("Introduce número");
			int leido = sc.nextInt();

			// solo guarda el número sino existe
			if (gnumeros.comprobarNumero(leido)) {
				System.out.println("El número ya existe, introduce otro");
			} else {
				gnumeros.agregar(leido);
			}

		} while (gnumeros.existentes() < 10);

		// muestra todos los números
		int[] todos = gnumeros.recuperarTodos();

		for (int n : todos) {
			System.out.println(n);
		}
		sc.close();
	}
}
