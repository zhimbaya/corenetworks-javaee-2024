package pruebas;

import java.util.List;
import java.util.Vector;

public class OperacionesColecciones {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(6);
		v.add(5);
		v.add(2);
		System.out.println(sumatorio(v));
	}

	// REALIZAR UN MÉTODO QUE RECIBA UNA LISTA DE INTEGER
	// Y DEVUELVA LA SUMA DE TODOS LOS NÚMEROS DE LA LISTA
	static int sumatorio(List<Integer> lista) {
		int suma = 0;
		for (Integer n : lista) {
			suma += n;
		}
		return suma;
	}

	// REALIZAR UN MÉTODO QUE RECIBA UNA COLECCIÓN DE ENTEROS
	// (INTEGER) Y DEVUELVA UNA LISTA CON LOS PARES QUE HAY EN ESA
	// COLECCION
	static List<Integer> suma(List<Integer> lista) {
		return 0;
	}

}
