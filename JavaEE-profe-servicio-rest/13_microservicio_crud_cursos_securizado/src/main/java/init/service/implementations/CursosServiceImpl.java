package init.service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import init.dao.CursosDao;
import init.exceptions.CursoExistenteException;
import init.model.Curso;
import init.service.interfaces.CursosService;
@Service
public class CursosServiceImpl implements CursosService {
	@Autowired
	CursosDao cursosDao;
	
	@Override
	public List<Curso> cursos() {
		return cursosDao.findAll();
	}

	@Override
	public Curso buscarCursoPorId(int idCurso) {
		return cursosDao.findById(idCurso).orElse(null);
	}

	@Override
	public List<Curso> buscarCursosRangoPrecios(double min, double max) {
		return cursosDao.findByPrecioBetween(min, max);
	}

	@Override
	public List<Curso> alta(Curso curso) throws  CursoExistenteException{
		if(cursosDao.findByDenominacion(curso.getDenominacion())!=null) {
			//si ya hay un curso con ese nombre, provocamos una excepción
			throw new CursoExistenteException();
		}
		cursosDao.save(curso);
		return cursos();
	}

	@Override
	public Curso eliminarCurso(String nombre) {
		Curso curso=cursosDao.findByDenominacion(nombre);
		if(curso!=null) {
			cursosDao.deleteByDenominacion(nombre);
		}
		return curso;
	}

	@Override
	public void actualizarPrecioCurso(int porcentaje, String nombre) {
		cursosDao.updatePrecio(porcentaje, nombre);

	}

}
