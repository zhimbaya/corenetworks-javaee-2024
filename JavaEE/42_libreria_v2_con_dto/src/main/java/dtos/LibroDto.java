package dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//DESACOPLAMIENTO
//SE HACE ESTO PARA TENER CAMPOS CALCULADOS O TENER CAMPOS QUE NOS GUSTEN.
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LibroDto {
	private int isbn;
	private String titulo;
	private String autor;
	private double precio;
	private int paginas;
	private TemaDto temaDto;
}
