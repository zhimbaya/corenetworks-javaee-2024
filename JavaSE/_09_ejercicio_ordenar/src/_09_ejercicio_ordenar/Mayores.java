package _09_ejercicio_ordenar;

public class Mayores {

	public static void main(String[] args) {
		
		var num = new Mayores();
		System.out.println(num.totalMayores(40));
		
	}

	public int totalMayores(int num) {
		int[] numbers = { 25, 10, 4, 17, 33, 41, 16 };
		int contador = 0;
		for (int n : numbers) {
			if (n > num) {
				contador++;
			}
		}
		return contador;
	}

}
