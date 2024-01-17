package service;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import model.Usuario;

public class UsuariosService {

	private EntityManager getEntityManager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("cursosPU");
		return factory.createEntityManager();
	}

	public boolean autenticar(String usuario, String pwd) {
		/*
		 * String jpql = "select p from Usuario p where p.usuario = ?1";
		 * TypedQuery<Usuario> query = getEntityManager().createQuery(jpql,
		 * Usuario.class); query.setParameter(1, usuario); List<Usuario> usuarios =
		 * query.getResultList(); for (Usuario u : usuarios) { if
		 * (u.getUsuario().equals(usuario) && u.getPassword().equals(pwd)) { return
		 * true; } }
		 */
		String jpql = "select u from Usuario u where u.usuario=?1 and u.password=?2";
		TypedQuery<Usuario> query = getEntityManager().createQuery(jpql, Usuario.class);

		query.setParameter(1, usuario);
		query.setParameter(2, pwd);

		return query.getResultList().size() > 0;
		//SI NO DEVUELVE RESULTADO DEVUELVE UNA EXCEPCION !! CUIDADO!!
		//return query.getSingleResult() != null;
	}
}
