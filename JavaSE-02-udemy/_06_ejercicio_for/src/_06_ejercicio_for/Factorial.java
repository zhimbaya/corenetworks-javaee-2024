package _06_ejercicio_for;

public class Factorial {

	public static void main(String[] args) {
		Factorial calcular = new Factorial();
		
		System.out.println(calcular.factorial(6));
	}

	public long factorial(int number) {
		// código aquí
		long resultado = 1;
		if (number < 0) {
			return -1;
		}
		for (int i = 2; i <= number; i++) {
			resultado = resultado * i;
		}
		return resultado;

	}
}
