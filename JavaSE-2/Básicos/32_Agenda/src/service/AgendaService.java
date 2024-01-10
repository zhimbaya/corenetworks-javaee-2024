package service;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class AgendaService {
	HashMap<String, String> contactos=new HashMap<>();
	
	public boolean introducir (String email, String nombre) {
		boolean mensaje = true;
		
			if(contactos.containsKey(email)) {
				mensaje= false;
			}else {
				contactos.put(email,nombre);
				mensaje= true;
			}
			return mensaje;
	}
	public String verContacto (String email) {
		return contactos.get(email);
	}
	
	public boolean eliminar (String email) {
		if (contactos.containsKey(email)) {
			contactos.remove(email);
			return true;
		}
		return false;
	}
	public String[] contactos () {
		
		return contactos.values().toArray(new String[0]);
	}

}
