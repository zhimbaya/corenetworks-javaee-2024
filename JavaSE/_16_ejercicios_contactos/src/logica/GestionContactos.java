package logica;

import beans.Contactos;

public class GestionContactos {
	private Contactos[] contactos;
	private int total;

	public GestionContactos() {
		contactos = new Contactos[10];
		total = 0;
	}

	public boolean espacioLibre() {
		if (total < 10) {
			return true;
		} else {
			return false;
		}
	}

	public boolean agregar(String nombre, int edad, String email) {
		if (total < 10) {
			Contactos c = new Contactos(nombre, edad, email);
			contactos[total] = c;
			total++;
			return true;
		} else {
			return false;
		}
	}

	public Contactos buscar(String nombre) {
		Contactos c = null;
		for (int i = 0; i < total; i++) {
			if (contactos[i].getNombre().equals(nombre)) {
				c = contactos[i];
				break;
			}
		}
		return c;
	}
	
	public Contactos[] recuperarContactos() {
		Contactos[] existentes = new Contactos[total];
		for (int i = 0; i < total; i++) {
			existentes[i]=contactos[i];
		}
		return existentes;
	}
}
