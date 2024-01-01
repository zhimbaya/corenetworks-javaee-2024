package _13_ejercicio_buscador;

import java.util.Scanner;

public class BuscadorNombres {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int contador=0;
		String lista, nom;
		String[] nombres;
		System.out.println("Introduce lista de nombres");
		lista = scan.nextLine();
		System.out.println("Introduce nombre a buscar: ");
		nom = scan.nextLine();
		
		nombres = lista.split(",");
		for(String n : nombres) {
			if(n.equals(nom)) {
				contador++;
			}
		}
		System.out.println("El nombre aparece "+contador+" veces.");
		scan.close();
	}

}
