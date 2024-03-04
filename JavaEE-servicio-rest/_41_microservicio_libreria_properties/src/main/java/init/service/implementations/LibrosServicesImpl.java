package init.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import init.dao.LibroDao;
import init.model.Libro;
import init.service.interfaces.LibrosServices;

@Service
public class LibrosServicesImpl implements LibrosServices {

	@Autowired
	LibroDao libroDao;
	
	@Override
	public List<Libro> catalogo() {
		return libroDao.findAll();
	}

	@Override
	public List<String> buscarTematicas() {
		 /*return  libroDao.findAll()
					.stream()
					.map(e->e.getTematica())
					.distinct()
					.toList();*/
		return libroDao.findByTematica();
	}

	@Override
	public Libro buscarLibro(int isbn) {
		return libroDao.findById(isbn).orElse(null);
	}

	@Override
	public boolean alta(Libro libro) {
		if(buscarLibro(libro.getIsbn())==null) {
			libroDao.save(libro);
			return true;
		}
		return false;
	}

}
