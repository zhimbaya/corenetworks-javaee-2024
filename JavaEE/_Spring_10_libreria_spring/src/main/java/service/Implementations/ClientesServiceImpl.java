package service.Implementations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.interfaces.ClientesDao;
import model.Cliente;
import service.interfaces.ClientesService;

@Service
public class ClientesServiceImpl implements ClientesService {

	@Autowired
	ClientesDao clientesDao;
	
	@Override
	public Cliente autenticationCliente(String usuario, String pwd) {
		return clientesDao.findByUsuarioAndPassword(usuario, pwd);
	}

	@Override
	public boolean registerCliente(Cliente cliente) {
		if(clientesDao.findByUsuario(cliente.getUsuario())==null) {
			clientesDao.save(cliente);
			return true;
		}
		return false;
	}
	
	public Cliente searchByCliente(String nombre) {
		return clientesDao.findByUsuario(nombre);
	}
	
}
