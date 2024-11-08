package service.interfaces;

import java.util.List;

import model.Curso;

public interface CursosService {
	//NO FUNCIONA!!!!!
	//-Búsqueda de todos los cursos
	List<Curso> buscarCursos();
	//-Búsqueda de curso por su id 
	Curso buscarCurso(int idCurso);
	//-Búsqueda de cursos entre rango de precios 
	List<Curso> buscarCursoPorRangoPrecio(double p1, double p2);
	//Alta curso
	List<Curso> alta(Curso curso);
	//-Eliminar curso por denominación, devolviendo el curso eliminado 
	Curso eliminarCursoPorDenomi(String denominacion);
	//-Actualización de precios. Se recibe temática y porcentaje, y se suben en ese 
	//porcentaje los precios de todos los cursos de esa temática
	void actualizarPrecioPorTematica( int porcentaje, String tematica);
}

