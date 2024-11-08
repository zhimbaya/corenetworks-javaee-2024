package service;
import java.util.ArrayList;
import java.util.HashMap;

import model.Contacto;

public class AgendaService {
	Contacto contacto = new Contacto();
	HashMap<String,Contacto> contactos=new HashMap<String, Contacto>();
	
	public boolean introducir (String email, String nombre,int edad, int telefono) {
			if(!contactos.containsKey(email)) {
				Contacto contacto=new Contacto(email, nombre, edad, telefono);
				contactos.put(email, contacto);
				return true;
			}
			return false;
	}
	public Contacto verContacto (String email) {
		return contactos.get(email);
	}
	
	public boolean eliminar (String email) {
		if (contactos.containsKey(email)) {
			contactos.remove(email);
			return true;
		}
		return false;
	}
	public Contacto [] todos () {
		 
		return contactos.values().toArray(new Contacto[0]);
	}

}
