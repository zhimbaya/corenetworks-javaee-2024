package _15_ejercicio_facturacion_switch;

import java.util.Scanner;

public class Facturacion {

	public static void main(String[] args) {
		var sc = new Scanner(System.in);
		var precio = 0.0;
		var unidades = 0;
		var zona = "";

		System.out.println("Introduce precio producto: ");
		precio = Double.parseDouble(sc.nextLine());
		System.out.println("Introduce unidades de producto: ");
		unidades = Integer.parseInt(sc.nextLine());
		System.out.println("Intruduce zona: ");
		zona = sc.nextLine();
		var descuento = switch (zona) {
		case "A", "B" -> 10;
		case "C", "D", "E" -> 5;
		case "F" -> 3;
		default -> 0;
		};
		precio = precio * unidades * (100 - descuento) / 100;
		System.out.println("Precio final " + precio);
		
		sc.close();
	}
}
