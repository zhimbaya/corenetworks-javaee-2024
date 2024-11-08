package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import model.Curso;

public interface CursoDao extends JpaRepository<Curso, Integer>{
	/*
	-Búsqueda de todos los cursos 
	-Búsqueda de curso por su id 
	*/
	
	// YA TE LO DA TODOS LOS CURSOS y ID
	
	//-Búsqueda de cursos entre rango de precios 
	List<Curso> findByPrecioBetween(double p1, double p2);
	
	//-Encontrar curso a partir de denominacion, devolviendo lista de cursos que quedan 
	Curso findByDenominacion(String denominacion);
	
	//-Eliminar curso por denominación, devolviendo el curso eliminado 
	@Transactional
	@Modifying
	void deleteByDenominacion(String denominacion);
	
	//-Actualización de precios. Se recibe temática y porcentaje, y se suben en ese 
	//porcentaje los precios de todos los cursos de esa temática
	
	@Transactional
	@Modifying
	@Query("update Curso c set c.precio=c.precio*(100+?1)/100 where c.denominacion=?2")
	void updatePrecio(int porcentaje, String denominacion);
}
