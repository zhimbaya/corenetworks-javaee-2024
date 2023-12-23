package service;

import java.util.ArrayList;
import java.util.List;

import model.Usuario;

public class UsuarioService {
	List<Usuario> usuarios = new ArrayList<>(List.of(
			new Usuario("usuario1","pwd1"),
			new Usuario("usuario2","pwd2"),
			new Usuario("usuario3","pwd3"),
			new Usuario("usuario4","pwd4")
			));
	public boolean autenticar (String usuario, String pwd) {
		
		for (Usuario u : usuarios) {
			if(u.getUsuario().equals(usuario) && u.getPassword().equalsIgnoreCase(pwd)) {
				return true;
			}
		}
		return false;
		//FUNCIONAL
		//return usuarios.stream().anyMatch(u->u.getUsuario().equals(usuario) && u.getPassword().equalsIgnoreCase(pwd)); 
		
	}
}
