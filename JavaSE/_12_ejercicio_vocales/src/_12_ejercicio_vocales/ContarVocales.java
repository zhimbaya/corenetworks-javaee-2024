package _12_ejercicio_vocales;

import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) {
		String cad;
		Scanner sc = new Scanner(System.in);
		int contador = 0;
		char letra;

		System.out.println("Introduce una cadena de texto");
		cad = sc.nextLine();
		cad = cad.toLowerCase();
		
		for (int i = 0; i < cad.length(); i++) {
			letra = cad.charAt(i);
			switch (letra) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u': {
				contador++;
				break;
			}
			default:
				break;
			}
		}
		System.out.println("Total de vocales: " + contador);
	}

}
