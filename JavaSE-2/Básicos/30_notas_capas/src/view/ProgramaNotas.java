package view;
import service.NotasService;
import java.util.ArrayList;
import java.util.Scanner;

public class ProgramaNotas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		NotasService notasService=new NotasService();
		int opcion;
		do {
			mostrarMenu();
			opcion=sc.nextInt();//lee la opción elegida
			switch(opcion) { //evaluamos
				case 1:
					System.out.println("Introduce nota");
					notasService.guardarNota(sc.nextDouble());
					break;
				case 2:
					System.out.println("Introduce posición");
					notasService.eliminarNota(sc.nextInt());
					break;
				case 3:
					System.out.println("La nota media es: "+notasService.media());
					break;
				case 4:
					System.out.println("Total de aprobados: "+notasService.aprobados());
					break;
					
				case 5:
					var nota = notasService.notas();
					for(double n : nota) {
						System.out.println("Las notas son: " + n);
					}
				case 6:
					System.out.println("---Adios---");
			}
		}while(opcion!=5);

	}
	static void mostrarMenu() {
		System.out.println("1. Añadir nota");
		System.out.println("2. Eliminar nota por posición");
		System.out.println("3. Nota media");
		System.out.println("4. total de aprobados");
		System.out.println("5. Salir");
	}
}
