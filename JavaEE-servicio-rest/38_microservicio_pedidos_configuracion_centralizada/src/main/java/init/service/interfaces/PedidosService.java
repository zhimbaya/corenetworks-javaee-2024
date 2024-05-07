package init.service.interfaces;

import java.util.List;

import init.model.Pedido;

public interface PedidosService {
	List<Pedido> pedidos();
	void registrarPedido(Pedido pedido);
}
