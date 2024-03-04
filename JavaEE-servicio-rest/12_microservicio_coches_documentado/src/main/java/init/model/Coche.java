package init.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Coche {
	private String matricula;
	private String marca;
	private String modelo;
	private int kilometros;
	private double precio;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date fecha;
}
