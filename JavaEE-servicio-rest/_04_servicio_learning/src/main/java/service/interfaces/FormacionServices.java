package service.interfaces;

import java.util.List;

import model.Formacion;

public interface FormacionServices {
	List<Formacion> catalogo();
	List<Formacion> catalogoPorDuracion(int max);
	void alta(Formacion foramacion);
}