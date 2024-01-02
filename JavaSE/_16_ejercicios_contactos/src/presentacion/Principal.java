package presentacion;

import java.util.Scanner;

import beans.Contactos;
import logica.GestionContactos;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GestionContactos gestor = new GestionContactos();
		int op;
		do {
			String nombre;
			int edad;
			String email;
			System.out.println("1.- Añadir contacto");
			System.out.println("2.- Buscar contacto");
			System.out.println("3.- Mostrar contacto");
			System.out.println("4.- Salir");

			op = Integer.parseInt(scan.nextLine());
			switch (op) {
			case 1:
				if (gestor.espacioLibre()) {
					System.out.println("Nombre: ");
					nombre = scan.nextLine();
					System.out.println("Edad: ");
					edad = Integer.parseInt(scan.nextLine());
					System.out.println("Email: ");
					email = scan.nextLine();
					gestor.agregar(nombre, edad, email);
				} else {
					System.out.println("Agenda llena, no hay espacio!");
				}
				break;
			case 2:
				System.out.println("Nombre: ");
				nombre = scan.nextLine();
				Contactos c = gestor.buscar(nombre);
				if (c == null) {
					System.out.println("No se encontró el contacto");
				} else {
					System.out.println(c.getNombre() + " - " + c.getEdad() + " - " + c.getEmail());
				}
				break;
			case 3:
				Contactos[] todos = gestor.recuperarContactos();
				for (Contactos con : todos) {
					System.out.println(con.getNombre() + " - " + con.getEdad() + " - " + con.getEmail());
				}
				break;
			case 4:
				System.exit(0);
				break;
			default:
			}

		} while (op != 4);
		scan.close();
	}

}
