package _21_propuesto_04;

public class GestionAlumnos {
	/*
	 * 8.- Realizar un programa que solicite los datos de 5 alumnos (nombre, nota y
	 * edad). Después, el programa nos mostrará los nombres de todos los alumnos
	 * aprobados y también el que ha obtenido la máxima nota. (final)
	 */
	private Alumno[] alumnos;
	private int total; // indica el total de alumnos registrados

	public GestionAlumnos() {
		alumnos = new Alumno[5];
	}

	public void guardarAlumno(String nombre, double nota, int edad) {
		// si hay espacio, crea el alumno
		// y lo guarda en el array
		if (total < 5) {
			alumnos[total] = new Alumno(nombre, nota, edad);
			total++;
		}
	}

	// indica cuantos números llevamos guardados
	public int existentes() {
		return total;
	}

	public Alumno maximaNota() {
		// inicializamos a null la variable donde guardaremos
		// el alumno con máxima nota

		Alumno al = null;
		// variable que guarda la máxima nota
		// se inicialzia a 0
		double nota = 0.0;
		for (int i = 0; i < total; i++) {
			// si encontramos un alumno con mayor nota
			// Actualizamos las variables
			if (alumnos[i].getNota() > nota) {
				al = alumnos[i];
				nota = alumnos[i].getNota();
			}
		}
		return al;
	}

	public int totalAprobados() {
		// calcula el total de aprobados
		int aprobados = 0;
		for (int i = 0; i < total; i++) {
			if (alumnos[i].getNota() >= 5) {
				aprobados++;
			}
		}
		return aprobados;
	}

	public Alumno[] recuperarAprobados() {
		int ap = 0;// contador de aprobados
		
		// creamos un array con el tamaño de los alumnos aprobados
		Alumno[] encontrados = new Alumno[totalAprobados()];
		for (int i = 0; i < total; i++) {
			if (alumnos[i].getNota() >= 5) {
				encontrados[ap] = alumnos[i];
				ap++;
			}
		}
		return encontrados;
	}
}
