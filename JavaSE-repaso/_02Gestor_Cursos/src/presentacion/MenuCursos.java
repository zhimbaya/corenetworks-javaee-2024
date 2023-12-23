package presentacion;

import java.util.ArrayList;
import java.util.Scanner;

import model.Curso;
import service.CursosService;

public class MenuCursos {
	static CursosService service = new CursosService();

	public static void main(String[] args) {
		int opcion;
		Scanner sc = new Scanner(System.in);
		do {
			mostrarMenu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				nuevoCurso();
				break;
			case 2:
				cursoPrecioMax();
				break;
			case 3:
				eliminarCurso();
				break;
			case 4:
				modificarDuracion();
				break;
			case 5:
				System.out.println("Adios!!");
				break;
			default:
				break;
			}
		} while (opcion != 5);

	}

	private static void nuevoCurso() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Introduce el nombre");
		String nombre = scan.nextLine();

		System.out.println("Introduce el duración");
		int duracion = scan.nextInt();

		System.out.println("Introduce el precio");
		double precio = scan.nextDouble();

		if (service.nuevo(nombre, duracion, precio)) {
			System.out.println("Curso añadido!");
		} else {
			System.out.println("Curso Ya EXISTENTE, NO añadido");
		}

	}

	private static void cursoPrecioMax() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el precio máximo");
		double precio = scan.nextDouble();
		ArrayList<Curso> cursos = service.preciosCursoMax(precio);
		for (Curso c : cursos) {
			System.out.println("Curso buscado >> " + c.getNombre() + " " + c.getDuracion() + " " + c.getPrecio() + "€\n");
		}
	}

	private static void eliminarCurso() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el nombre para eliminar");
		String nombre = scan.nextLine();
		service.eliminarCurso(nombre);
	}

	private static void modificarDuracion() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce el nombre del Curso");
		System.out.println("Introduce la duración nueva");
		String nombre = scan.nextLine();
		int duracion = scan.nextInt();
		service.modificarCurso(nombre, duracion);
	}

	private static void mostrarMenu() {
		System.out.println("----------- M E N Ú -----------");
		System.out.println("1.- Nuevo Curso");
		System.out.println("2.- Buscar curso por precio máximo");
		System.out.println("3.- Eliminar Curso");
		System.out.println("4.- Modificar duración Curso");
		System.out.println("5.- Salir Curso");
		System.out.println("----------- F I N -----------");
	}
}
