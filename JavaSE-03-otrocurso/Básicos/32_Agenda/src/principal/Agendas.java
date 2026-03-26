package principal;

import java.util.Scanner;
import service.AgendaService;

public class Agendas {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Scanner scText=new Scanner(System.in);
		AgendaService agendaService = new AgendaService();
		int opcion;
		do {
			mostrarMenu();
			opcion=sc.nextInt();//lee la opción elegida
			switch(opcion) { //evaluamos
				case 1:
					System.out.println("Introduce un email:");
					String email = scText.nextLine();
					System.out.println("Introduce un nombre:");
					String nombre = scText.nextLine();
					
					if (agendaService.introducir(email, nombre) == true) {
						System.out.println("Contacto guardado");
					}else{
						System.out.println("Error: el email ya existe");
					}
					break;
				case 2:
					System.out.println("Introduce email");
					String mail = scText.nextLine();
					System.out.println(agendaService.verContacto(mail));
					break;
				case 3:
					System.out.println("Introduce email");
					String correo = scText.nextLine();
					System.out.println(agendaService.eliminar(correo));
					break;
				case 4:
					//System.out.println(agendaService.contactos());
					String[] nombres = agendaService.contactos();
					for(String n : nombres) {
						System.out.print(n + ",");
					}
					break;
				case 5:
					System.out.println("---Adios---");
					
			}
		}while(opcion!=5);
		
	}
		static void mostrarMenu() {
			System.out.println("\n1. Introduzca un email");
			System.out.println("2. Para ver el nombre, introduzca email");
			System.out.println("3. Eliminar contacto. Introduzca email");
			System.out.println("4. Muestra todos los nombres de contactos");
			System.out.println("5. Salir");
		}
	}


