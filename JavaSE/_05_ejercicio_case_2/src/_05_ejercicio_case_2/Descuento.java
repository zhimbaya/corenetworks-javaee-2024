package _05_ejercicio_case_2;

public class Descuento {

	public static void main(String[] args) {
		Descuento precio = new Descuento();
		System.out.println(precio.factura(25, 4));
	}

	public double factura(double precio, int unidades) {
		// código aquí
		switch (unidades) {
		case 1: {
			precio = precio * unidades;
			break;
		}
		case 2:
		case 3: {
			precio = (precio - (precio * 0.05)) * unidades;
			break;
		}
		case 4:
		case 5: {
			precio = (precio - (precio * 0.10)) * unidades;
			break;
		}
		default: {
			precio = (precio - (precio * 0.15)) * unidades;
			break;
		}
		}
		return precio;
	}
}
