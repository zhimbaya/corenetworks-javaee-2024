package service.implementations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CursoDao;
import model.Curso;
import service.interfaces.CursosService;

@Service
public class CursosServiceImpl implements CursosService {

	@Autowired
	CursoDao cursosDao;

	@Override
	public List<Curso> buscarCursos() {
		return cursosDao.findAll();
	}

	@Override
	public Curso buscarCurso(int idCurso) {
		return cursosDao.findById(idCurso).orElse(null);
	}

	@Override
	public List<Curso> buscarCursoPorRangoPrecio(double p1, double p2) {
		return cursosDao.findByPrecioBetween(p1, p2);
	}

	@Override
	public List<Curso> alta(Curso curso) {
		cursosDao.save(curso);
		return buscarCursos();
	}

	@Override
	public Curso eliminarCursoPorDenomi(String denominacion) {
		Curso curso = cursosDao.findByDenominacion(denominacion);
		if (curso != null) {
			cursosDao.deleteByDenominacion(denominacion);
		}
		return curso;
	}

	@Override
	public void actualizarPrecioPorTematica( int porcentaje, String tematica) {
		cursosDao.updatePrecio(porcentaje, tematica);
	}

}
