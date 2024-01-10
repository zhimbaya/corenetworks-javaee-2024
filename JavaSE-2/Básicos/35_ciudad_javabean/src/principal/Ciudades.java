package principal;
import java.util.ArrayList;
import java.util.Scanner;
import model.Ciudad;
import service.CiudadService;

public class Ciudades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scText = new Scanner(System.in);
		CiudadService ciudadService = new CiudadService();
		int opcion;
		do {
			mostrarMenu();
			opcion=sc.nextInt();
			switch(opcion) {
				case 1:
					System.out.println("Ciudad:");
					String ciudad = scText.nextLine();
					System.out.println("Pais:");
					String pais = scText.nextLine();
					System.out.println("Numero de habitantes:");
					int habitantes = Integer.parseInt(scText.nextLine());
					if (ciudadService.introducir(ciudad,pais,habitantes) == true) {
						System.out.println("Contacto guardado");
					}else{
						System.out.println("Error: el email ya existe");
					}
					break;
				case 2:
					System.out.println("Introduzca un pais:");
					String country = scText.nextLine();
					//System.out.print(ciudadService.todos(country));	
					ArrayList<Ciudad> c = ciudadService.todos(country);
					System.out.println(c);
					
					break;
				case 3:
					System.out.println("La ciudad más poblada es:" + ciudadService.poblacion());
				case 4:
					System.out.println("Introduzca un ciudad:");
					String city = scText.nextLine();
					ciudadService.eliminar(city);
					System.out.println("---Se ha eliminado---");
				case 5:
					System.out.println("---Adios---");
			}
		}while(opcion !=5);
			
	}
		static void mostrarMenu () {
			System.out.println("\n1. Dar de alta a una ciudad");
			System.out.println("2. Ver datos de la ciudad");
			System.out.println("3. Ciudad mas poblada");
			System.out.println("4. Eliminar ciudad");
			System.out.println("5. Salir");
		
		}
}
