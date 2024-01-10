package service;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.google.gson.Gson;

import model.Empleado;


public class EmpleadoService {
	
	private Stream<Empleado> getEmpleado(){
		String ruta="c:\\temp\\empleados.json";
		Gson gson=new Gson();
		try(FileReader reader=new FileReader(ruta);){
			Empleado[] empleados=gson.fromJson(reader, Empleado[].class);
			return Arrays.stream(empleados);
		}
		catch(IOException ex) {
			ex.printStackTrace();
			return Stream.empty();
		}
	}
	public List<Empleado> empleadosPorDepartamento(String departamento){
		return getEmpleado()
				.filter(n->n.getDepartamento().equals(departamento))
				.toList();
							
	}
	public Empleado empleadoMayorSalario() {
		return getEmpleado()
				.max((a,b)->Double.compare(a.getSalario(),b.getSalario()))
				.orElse(null);
	}
	
	public Empleado buscarEmpleado(String email) {
		return getEmpleado()
				.filter(n->n.getEmail().equals(email))
				.findFirst()
				.orElse(null);
	}

}
