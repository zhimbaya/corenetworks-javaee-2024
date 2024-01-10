package model;

public class Contacto {
	private String email;
	private String nombre;
	private int edad;
	private int telefono;
	public Contacto(String email, String nombre, int edad, int telefono) {
		this.email = email;
		this.nombre = nombre;
		this.edad = edad;
		this.telefono = telefono;
	}
	
	public Contacto() {
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
		
}
