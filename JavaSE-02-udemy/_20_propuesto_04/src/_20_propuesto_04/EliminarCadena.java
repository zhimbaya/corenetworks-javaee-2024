package _20_propuesto_04;

import java.util.Scanner;

public class EliminarCadena {

	public static void main(String[] args) {
		/*
		 * 7.- Realizar un programa que solicite al usuario la introducción de un texto
		 * y después una palabra. El programa nos mostrará la cadena resultante de
		 * eliminar del texto principal la palabra introducida. (lección 29)
		 */
		Scanner sc = new Scanner(System.in);
		String texto, palabra, aux = "";

		System.out.println("Introduce texto: ");
		texto = sc.nextLine();

		System.out.println("Introduce palabra");
		palabra = sc.nextLine();

		// creamos un array con todas la palabras
		// ###u/u### texto

		String[] palabras = texto.split("[ ]");

		// agrupamos en la variable aux todas
		// las palabras ###u/u### texto, excepto la buscada

		for (String s : palabras) {
			if (!s.equals(palabra)) {
				aux += s + " ";
			}
		}

		// en aux quedará la frase completa
		// menos la palabra buscada

		System.out.println(aux);
		sc.close();
	}
}
