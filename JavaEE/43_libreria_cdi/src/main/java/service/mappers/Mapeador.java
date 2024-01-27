package service.mappers;

import dtos.LibroDto;
import dtos.TemaDto;
import model.Libro;
import model.Tema;
import service.LibrosServiceImpl;


public class Mapeador {
	//@Inject //NO SE PUEDE HACER INJECCIÓN DE DEPENDENCIA PARA MÉTODOS STATIC
	//LibrosService service;
	public static TemaDto temaEntityToDto(Tema tema) {
		return new TemaDto(tema.getIdTema(),tema.getTema());
	}
	
	public static LibroDto libroEntityToDto(Libro libro) {
		
		LibrosServiceImpl service = new LibrosServiceImpl();
		return new LibroDto(libro.getIsbn(),
				libro.getTitulo(),
				libro.getAutor(),
				libro.getPrecio(),
				libro.getPaginas(),
				service.getTema(libro.getIdTema())
		);
	}
}
