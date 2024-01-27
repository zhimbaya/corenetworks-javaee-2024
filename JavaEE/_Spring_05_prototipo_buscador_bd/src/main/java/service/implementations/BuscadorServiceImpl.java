package service.implementations;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import model.Resultado;
import service.interfaces.BuscadorService;

@Service // spring
public class BuscadorServiceImpl implements BuscadorService {

	@PersistenceContext // COMO EL AUTOWIRED O INJED
	EntityManager em;

	@Override
	public List<Resultado> buscar(String tematica) { // JPA
		String jpql = "SELECT r FROM Resultado r WHERE r.tematica=?1";
		TypedQuery<Resultado> query = em.createQuery(jpql, Resultado.class);
		query.setParameter(1, tematica);
		return query.getResultList();
	}

	@Transactional // SE UTILIZA EL DE SPRING E INICIE Y CONFIRME LA TX AUTOMÁTICAMENTE
	@Override
	public void guardar(Resultado resultado) {
		em.persist(resultado);
	}

}
