package init.services.implementations;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import init.dao.PedidosDao;
import init.model.Pedido;
import services.interfaces.PedidosService;

@Service
public class PedidosServiceImpl implements PedidosService {

	@Autowired
	PedidosDao pedidosDao;
	
	@Autowired
	RestClient restClient;
	
	@Override
	public void alta(Pedido pedido) {
		String urlBase="http://servicio-productos/";
		pedido.setFechaPedido(new Date());
		//obtenemos precio producto llamado al recurso remoto
		double precio=Double.parseDouble(restClient.get()
				.uri(urlBase+"precio/"+pedido.getCodigoProducto())
				.retrieve()
				.body(String.class));
		pedido.setTotal(pedido.getUnidades()*precio);
		//salvamos pedido
		pedidosDao.save(pedido);
		//actualizamos stock llamado a recurso remoto
		restClient.put()
		.uri(urlBase+"actualizar/"+pedido.getCodigoProducto()+"/"+pedido.getUnidades())
		.retrieve();
	}

	@Override
	public List<Pedido> pedidos() {
		return pedidosDao.findAll();
	}

}
