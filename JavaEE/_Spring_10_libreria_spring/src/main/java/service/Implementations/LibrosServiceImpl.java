package service.Implementations;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.interfaces.LibrosDao;
import dao.interfaces.TemasDao;
import model.Libro;
import model.Tema;
import service.interfaces.LibrosService;

@Service
public class LibrosServiceImpl implements LibrosService {
	@Autowired
	TemasDao temasDao;
	@Autowired
	LibrosDao librosDao;

	@Override
	public List<Tema> getTemas() {
		return temasDao.findAll();
	}

	@Override
	public List<Libro> getLibrosByTema(int idTema) {
		if(idTema == 0) {
			return librosDao.findAll();
		}
		return librosDao.findByIdTema(idTema);
	}

	@Override
	public Libro getLibro(int isbn) {
		Optional<Libro> resultado = librosDao.findById(isbn);
		//return resultado.isPresent()?resultado.get():null; //FUNCIONA
		return resultado.orElse(null);
	}

	@Override
	public Tema getTema(int idTema) {
		return temasDao.findById(idTema).orElse(null);
	}

}
