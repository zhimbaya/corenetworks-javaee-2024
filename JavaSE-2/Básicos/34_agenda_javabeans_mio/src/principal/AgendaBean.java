package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.Contacto;
import service.AgendaService;
public class AgendaBean {

	public static void main(String[] args) {
		//Alumno alumno = new Alumno("alumno 1", "Java 21", 45, 666333222);
		//System.out.println("El alumno es del curso: " + alumno.getCurso());
		//alumno.setEdad(12);
		
		//se pueden crear collecciones y array de JavaBeans
		//ArrayList<Alumno> alumnos = new ArrayList<>();
		//alumnos.add(alumno);
	
		Scanner sc=new Scanner(System.in);
		Scanner scText=new Scanner(System.in);
		AgendaService agendaService = new AgendaService();
		int opcion;
		
		do {
				mostrarMenu();
				try {
				opcion=sc.nextInt();//lee la opción elegida
				switch(opcion) { //evaluamos
					case 1:
						System.out.println("Introduce un email:");
						String email = scText.nextLine();
						System.out.println("Introduce un nombre:");
						String nombre = scText.nextLine();
						System.out.println("Introduce la edad:");
						Integer edad = sc.nextInt();
						System.out.println("Introduce el numero de telefono:");
						Integer telefono = sc.nextInt();
						
						if (agendaService.introducir(email,nombre,edad,telefono) == true) {
							System.out.println("Contacto guardado");
						}else{
							System.out.println("Error: el email ya existe");
						}
						break;
					case 2:
						System.out.println("Introduce email");
						String mail = scText.nextLine();
						//System.out.println(agendaService.verContacto(mail));
						Contacto c = agendaService.verContacto(mail);
							System.out.print(c.getNombre()+", "+c.getEdad()+", "+c.getTelefono()+", \n");
						
						break;
					case 3:
						System.out.println("Introduce email");
						String correo = scText.nextLine();
						System.out.println(agendaService.eliminar(correo));
						break;
					case 4:
						//System.out.println(agendaService.contactos());
						Contacto[] nombres = agendaService.todos();
						for(Contacto n : nombres) {
							System.out.print(n.getNombre()+", "+n.getEmail()+", "+n.getEdad()+", "+n.getTelefono()+", ");
						}
						break;
					case 5:
						System.out.println("---Adios---");
						
				}
			} catch (InputMismatchException ex) {
				System.out.println("---ERROR. Valor incorrecto--- " + ex );
				opcion = 0;
			}
		}while(opcion!=5 && opcion!=0);
	}
	
		static void mostrarMenu() {
			System.out.println("\n1. Introduzca un email");
			System.out.println("2. Para ver el nombre, introduzca email");
			System.out.println("3. Eliminar contacto. Introduzca email");
			System.out.println("4. Muestra todos los nombres de contactos");
			System.out.println("5. Salir");
		}
	}




