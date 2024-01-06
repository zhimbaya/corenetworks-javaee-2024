package _21_propuesto_04;

public class Alumno {
	private String nombre;
	private double nota;
	private int edad;

	public Alumno(String nombre, double nota, int edad) {
		super();
		this.nombre = nombre;
		this.nota = nota;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
