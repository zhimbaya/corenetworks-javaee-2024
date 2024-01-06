package _18_propuesto_02;

public class Ejercicio_02 {

	public static void main(String[] args) {
		/*
		 * 4.- Tenemos dos variables, a y b, que almacenan dos números enteros
		 * cualquiera. Por otro lado, tenemos una variable c que contiene un número
		 * comprendido entre a y b. Hacer un programa que nos muestre, por una lado, la
		 * suma de todos los números comprendidos entre a y c y, por otro, la de los
		 * comprendidos entre c y b. (lección 14)
		 */
		// variables con números cualquiera
		int a = 2;
		int b = 9;
		int c = 7;

		// variables que almacenarán las sumas
		int suma1 = 0, suma2 = 0;
		for (int i = a; i <= c; i++) {
			suma1 += i;
		}
		for (int i = c; i <= b; i++) {
			suma2 += i;
		}

		System.out.println("Suma entre " + a + " y " + c + ": " + suma1);
		System.out.println("Suma entre " + c + " y " + b + ": " + suma2);
		/*
		 * 5.- Realizar un programa que, dado un array de 10 números enteros y otro
		 * número almacenado en una variable, nos indique cuantos números del array son
		 * mayores que el contenido en la variable. (lección 21)
		 * 
		 */
		int nums[] = { 6, 9, 11, 3, 16, 70, 8, 12, 1, 35 };
		int n = 13; // número a comprobar
		int cont = 0;// contador

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > n) {
				cont++;
			}
		}
		System.out.println("Total mayores de " + n + ":" + cont);
		
	}

}
