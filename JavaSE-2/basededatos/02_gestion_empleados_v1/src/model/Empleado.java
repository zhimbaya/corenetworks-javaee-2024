package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Empleado {
	private int idEmpleado;
	private String nombre;
	private String email;
	private String departamento;
	private double salario;
	public Empleado(int idEmpleado) {
		super();
		this.idEmpleado = idEmpleado;
	}
	public Empleado(double salario,int idEmpleado) {
		super();
		this.idEmpleado = idEmpleado;
		this.salario = salario;
	}
	
	
}

