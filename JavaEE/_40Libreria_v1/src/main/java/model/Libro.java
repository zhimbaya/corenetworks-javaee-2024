package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
//@Setter
//@Getter
@Data //mas metodos
@Entity
@Table(name="libros")
public class Libro {
	@Id
	private int isbn;
	private String titulo;
	private String autor;
	private Double precio;
	private int paginas;
	private int idTema;
}
