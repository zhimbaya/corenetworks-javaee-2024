package service.interfaces;

import dtos.ClienteDto;

public interface ClientesService {

	ClienteDto autenticarCliente(String usuario, String pwd);
	
	void altaCliente(ClienteDto cliente);

}