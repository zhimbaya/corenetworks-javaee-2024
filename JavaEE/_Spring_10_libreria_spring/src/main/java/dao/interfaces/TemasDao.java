package dao.interfaces;
import org.springframework.data.jpa.repository.JpaRepository;

import model.Tema;

public interface TemasDao extends JpaRepository<Tema, Integer> {
	//YA ME LOS DA JPAREPOSITORY
	//findAll();
}
