package _06_ejercicio_for;

public class ComprobarPrimos {

	public static void main(String[] args) {
		int n = 17;
		boolean primo = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				primo = false;
				break;
			}
		}
		if (primo) {
			System.out.println("El número " + n + " es primo");

		} else {
			System.out.println("El número " + n + " NO es primo");
		}
	}

}
