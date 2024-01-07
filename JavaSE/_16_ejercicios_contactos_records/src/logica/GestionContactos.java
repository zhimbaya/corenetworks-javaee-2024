package logica;

import beans.Contacto;

public class GestionContactos {
	private Contacto[] contactos;
	private int total;

	public GestionContactos() {
		contactos = new Contacto[10];
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
			Contacto c = new Contacto(nombre, edad, email);
			contactos[total] = c;
			total++;
			return true;
		} else {
			return false;
		}
	}

	public Contacto buscar(String nombre) {
		Contacto c = null;
		for (int i = 0; i < total; i++) {
			if (contactos[i].nombre().equals(nombre)) {
				c = contactos[i];
				break;
			}
		}
		return c;
	}

	public Contacto[] recuperarContactos() {
		Contacto[] existentes = new Contacto[total];
		for (int i = 0; i < total; i++) {
			existentes[i] = contactos[i];
		}
		return existentes;
	}
}
