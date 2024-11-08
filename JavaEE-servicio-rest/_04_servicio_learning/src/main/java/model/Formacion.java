package model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Formacion {
	@JsonProperty(value="denominacion") //serialización y deserializacion
	//@JsonAlias(value="denominacion")
	private String nombre;
	//@JsonAlias(value = "duracion")
	@JsonProperty(value="duracion")
	private double horas;
	private double precio;
}
