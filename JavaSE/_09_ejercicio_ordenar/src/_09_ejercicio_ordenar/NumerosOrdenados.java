package _09_ejercicio_ordenar;

import java.util.Scanner;

public class NumerosOrdenados {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] numeros = new int[10];
		int num, aux;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un número:");
			num = scan.nextInt();
			while (num < 0) {
				System.out.println("No es positivo, vuelve a introducir un número!");
				num = scan.nextInt();
			}
			numeros[i] = num;
		}

		// método de la burbuja
		for (int i = 0; i < numeros.length; i++) {
			for (int j = i; j < numeros.length; j++) {
				if (numeros[j] > numeros[i]) {
					aux = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = aux;
				}
			}
		}

		System.out.println("Los números son: ");
		for (int n : numeros) {
			System.out.print(n + ",");
		}
	}

}
