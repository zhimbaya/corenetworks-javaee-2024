package presentacion;

import java.util.ArrayList;
import java.util.Scanner;

import model.Curso;
import service.CursosService;

public class MenuCursos {
	static CursosService service=new CursosService();
	public static void main(String[] args) {
		int opcion;
		Scanner sc=new Scanner(System.in);
		do {
			mostrarMenu();
			opcion=sc.nextInt();
			switch(opcion) {
				case 1:
					nuevoCurso();
					break;
				case 2:
					cursosPrecioMax();
					break;
				case 3:
					eliminarCurso();
					break;
				case 4:
					modificarDuracion();
					break;
				case 5:
					System.out.println("Adios");
			}
		}while(opcion!=5);

	}
	
	static void mostrarMenu() {
		System.out.println("1.- Nuevo curso");
		System.out.println("2.- Buscar cursos por precio máximo");
		System.out.println("3.- Eliminar curso");
		System.out.println("4.- Modificar duracion curso");
		System.out.println("5.- Salir");
	}
	
	static void nuevoCurso() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce nombre del curso:");
		String nombre=sc.nextLine();
		System.out.println("Introduce duración del curso:");
		int duracion=sc.nextInt();
		System.out.println("Introduce precio del curso:");
		double precio=sc.nextDouble();
		if(service.nuevo(nombre, duracion, precio)) {
			System.out.println("Curso añadido!");
		}else {
			System.out.println("Curso ya existente, no se ha vuelto a añadir");
		}
	}
	static void eliminarCurso() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce nombre del curso:");
		String nombre=sc.nextLine();
		service.eliminarCurso(nombre);
	}
	static void modificarDuracion() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce nombre del curso:");
		String nombre=sc.nextLine();
		System.out.println("Introduce la nueva duración del curso:");
		int duracion=sc.nextInt();
		service.modificarDuracion(nombre, duracion);
	}
	static void cursosPrecioMax() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce precio máximo:");
		double precio=sc.nextDouble();
		ArrayList<Curso> cursos=service.preciosCursoMax(precio);
		for(Curso c:cursos) {
			System.out.println(c.getNombre()+"-"+c.getDuracion()+"-"+c.getPrecio());
		}
	}

}
