package _06_ejercicio_for;

public class SumaPares {

	public static void main(String[] args) {
		int a = 4;
		int b = 4;
		int suma = 0;
		int mayor;
		int menor;
		if (a > b) {
			mayor = a;
			menor = b;
		} else {
			mayor = b;
			menor = a;
		}
		for (int i = menor; i <= mayor; i++) {
			if (i % 2 == 0) {
				suma = suma + i;
			}
		}
		System.out.println("La suma de los pares es igual = " + suma);
	}

}
