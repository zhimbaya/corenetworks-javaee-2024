package dao.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Cliente;

public interface ClientesDao extends JpaRepository<Cliente, Integer> {
	//GUARDAR CLIENTES YA ME LO DA
	//save();
	//PARA AUTENTICAR
	Cliente findByUsuarioAndPassword(String usuario, String password);
	Cliente findByUsuario(String usuario);
}
