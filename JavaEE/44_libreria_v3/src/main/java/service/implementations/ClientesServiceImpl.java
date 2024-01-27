package service.implementations;

import java.util.ArrayList;
import java.util.List;

import dtos.ClienteDto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.Cliente;
import service.interfaces.ClientesService;
import service.mappers.Mapeador;

public class ClientesServiceImpl implements ClientesService {

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("libreriaPU");
		return factory.createEntityManager();
	}

	@Override
	public ClienteDto autenticarCliente(String usuario, String pwd) {

		String jpql = "select c from Cliente c where c.usuario=?1 and c.password=?2";
		TypedQuery<Cliente> query = getEntityManager().createQuery(jpql, Cliente.class);

		query.setParameter(1, usuario);
		query.setParameter(2, pwd);

		List<Cliente> clientes = query.getResultList();

		return clientes.size() > 0 ? Mapeador.clienteEntityToDto(clientes.get(0)) : null;

		/*
		 * List<Tema> temas = query.getResultList(); List<TemaDto> temasDto = new
		 * ArrayList<>(); for(Tema t : temas) { TemaDto temaDto =
		 * Mapeador.temaEntityToDto(t); temasDto.add(temaDto); } return temasDto;
		 */
		// SI NO DEVUELVE RESULTADO DEVUELVE UNA EXCEPCION !! CUIDADO!!
		// return query.getSingleResult() != null;
	}

	@Override
	public void altaCliente(ClienteDto cliente) {
		Cliente pr = new Cliente(0, cliente.getUsuario(), cliente.getPassword(), cliente.getEmail(),
				cliente.getTelefono());
		if (buscarPorCliente(cliente.getUsuario()) == null) {
			EntityManager em = getEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.persist(pr);
			tx.commit();
		}
	}

	public Cliente buscarPorCliente(String nombre) {
		String jpql = "select p from Cliente p where p.usuario = ?1";
		TypedQuery<Cliente> query = getEntityManager().createQuery(jpql, Cliente.class);
		query.setParameter(1, nombre);

		try {
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
		/*
		 * esto tb estaria bien List<Curso> cursos = query.getResultList(); return
		 * cursos.size()>0?cursos.get(0):null;
		 */
	}
}
