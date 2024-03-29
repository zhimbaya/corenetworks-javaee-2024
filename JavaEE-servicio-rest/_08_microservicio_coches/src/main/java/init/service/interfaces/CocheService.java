package init.service.interfaces;

import java.util.List;

import init.model.Coche;

public interface CocheService {
	//alta de coches (no se puede dar de alta un coche con matricula repetida)
	void alta(Coche coche);
	//eliminar coche por matricula y devuelve el coche eliminado.
	Coche eliminarCoche(String matricula);
	//consulta de coches por marca
	List<Coche> buscar(String marca);
	//	consulta de coches por precio maximo
	List<Coche> buscarCoche(double precioMax);
	//	catalogo de todos los coches 
	List<Coche> buscar();
	//	actualizacion coches (se recibe un coche y se actualizan sus datos, a partir de la matricula)
	void actualizarCoches(Coche coche);
}
