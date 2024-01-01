package _13_ejercicio_buscador;

import java.util.Scanner;

public class BuscadorProductos {

	public static void main(String[] args) {
		var producto = new BuscadorProductos();
		String cadena = "patinete,balón,bici,patinete,moto,bici,patinete";
		System.out.println("El producto que más aparece es: ");
		System.out.println(producto.productoMasVendido(cadena));
	}

	public String productoMasVendido(String productos) {

		String[] datos = productos.split(",");
		int repeticionesMax = 0;// almacena máximo número de repeticiones de un producto
		String masRepetido = "";// almacena el nombre del producto más masRepetido
		// para cada producto, cuenta las veces que aparece en la cadena
		for (String prod : datos) {
			int repeticiones = 0;
			for (int i = 0; i < datos.length; i++) {
				if (prod.equals(datos[i])) {
					repeticiones++;
				}
			}
			// si el producto es el más repetido, actualizamos variables
			if (repeticiones > repeticionesMax) {
				repeticionesMax = repeticiones;
				masRepetido = prod;
			}
		}
		return masRepetido;
	}

}
