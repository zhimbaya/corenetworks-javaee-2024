package _21_propuesto_04;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {

		GestionAlumnos galumnos = new GestionAlumnos();
		Scanner sc = new Scanner(System.in);

		// realiza lectura de alunnos hasta
		// completar los 5

		do {
			String nombre;
			double nota;
			int edad;

			System.out.println("Introduce nombre");
			nombre = sc.nextLine();
			System.out.println("Introduce nota");
			nota = Double.parseDouble(sc.nextLine());
			System.out.println("Introduce edad");
			edad = Integer.parseInt(sc.nextLine());
			galumnos.guardarAlumno(nombre, nota, edad);

		} while (galumnos.existentes() < 5);

		// muestra resultados
		System.out.println("Alumno con mayor nota: " + galumnos.maximaNota().getNombre());
		System.out.println("Aprobados: ");

		Alumno[] aprobados = galumnos.recuperarAprobados();

		for (Alumno al : aprobados) {
			System.out.println(al.getNombre());
		}
		sc.close();
	}

}
