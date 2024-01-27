package service.mappers;

import dtos.ClienteDto;
import dtos.LibroDto;
import dtos.TemaDto;
import model.Cliente;
import model.Libro;
import model.Tema;
import service.implementations.LibrosServiceImpl;
import service.implementations.ClientesServiceImpl;


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
		
	public static ClienteDto clienteEntityToDto(Cliente cliente) {
		
		return new ClienteDto(//cliente.getIdCliente(),
				cliente.getUsuario(),
				cliente.getPassword(),
				cliente.getEmail(),
				cliente.getTelefono()
		);
	}
}
