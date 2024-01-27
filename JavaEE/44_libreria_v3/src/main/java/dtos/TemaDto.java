package dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//DESACOPLAMIENTO
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TemaDto {
	private int idTema;
	private String tema;
}
