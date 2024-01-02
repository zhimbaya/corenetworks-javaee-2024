package _17_propuesto_01;

public class Divisible {

	public static void main(String[] args) {
		/*
		 * Hacer un programa que, dados dos números, nos diga si uno es divisible por el
		 * otro. (lección 9)
		 */
		int n1 = 12;
		int n2 = 24;
		if (n1 % n2 == 0) {
			System.out.println(n1 + " es divisible entre " + n2);
		} else if (n2 % n1 == 0) {
			System.out.println(n2 + " es divisible entre " + n1);
		} else {
			System.out.println("Los números no son divisibles");
		}
		/*
		 * Hacer un programa que, dada una variable que contiene la hora del día (valor
		 * entre 0 y 23), nos de un mensaje de buenos días si su valor está entre 6 y
		 * 12, mensaje de buenas tardes si es entre 13 y 20, y de buenas noches si es
		 * cualquier otro valor. (lección 11)
		 */

		int hora = 0;
		if (hora >= 0 && hora < 24) {
			var saludo = switch (hora) {
			case 6, 7, 8, 9, 10, 11, 12 -> "Buenos días";
			case 13, 14, 15, 16, 17, 18, 19, 20 -> "Buenas tardes";
			default -> "Buenas noches";
			};
			System.out.println(saludo);
		} else {
			System.out.println("Número invalido");
		}
		/*
		 * Realizar un programa que nos muestre el factorial de un número dado. (lección
		 * 14)
		 */
		int n = 5;
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res *= i;
		}
		System.out.println("El factorial de " + n + " es " + res);
	}

}
