package _19_propuesto_03;

public class GestionNumeros {
	/*
	 * 6.- Realizar un programa que lea números y los guarde (hasta un máximo de
	 * 10). Los números no se pueden repetir, por lo que si al leer un número este
	 * ya está almacenado, no se guardará y se leerá otro. Así hasta completar el
	 * total. Después, el programa mostrará en pantalla todos los números
	 * almacenados. Aplicar la separación en clases (lección 25)
	 */
	private int[] numeros;
	private int total;

	public GestionNumeros() {
		numeros = new int[10];
	}

	public int existentes() {
		return total;
	}

	public int[] recuperarTodos() {
		return numeros;
	}

	public boolean comprobarNumero(int n) {
		boolean res = false;
		// comproueba si el número recibido
		// está ya guardado
		for (int i = 0; i < total; i++) {
			if (n == numeros[i]) {
				res = true;
			}
		}
		return res;
	}

	public void agregar(int n) {
		// guarda el número si hay espacio
		if (total < 10) {
			numeros[total] = n;
			total++;
		}
	}
}
