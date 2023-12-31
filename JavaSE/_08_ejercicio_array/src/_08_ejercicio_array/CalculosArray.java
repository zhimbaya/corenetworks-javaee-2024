package _08_ejercicio_array;

public class CalculosArray {
	public static void main(String[] args) {
		double media = 0;
		int max;
		int[] datos = { 4, 8, 2, 12, 54, 62, 8, 9 };
		max = datos[0];
		for (int n : datos) {
			media = media + n;
			if (n > max) {
				max = n;
			}
		}
		media = media / datos.length;
		System.out.println("La media es: " + media);
		System.out.println("El mayor es: " + max);
	}
}
