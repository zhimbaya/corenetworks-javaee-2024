package service.interfaces;

import model.Cliente;

public interface ClientesService {

	Cliente autenticationCliente(String usuario, String pwd);

	boolean registerCliente(Cliente cliente);
}
