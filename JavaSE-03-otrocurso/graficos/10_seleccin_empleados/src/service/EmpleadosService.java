package service;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.google.gson.Gson;

import model.Empleado;

public class EmpleadosService {
	
	private Stream<Empleado> getEmpleados(){
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
	
	public List<Empleado> empleados() {
		
		return getEmpleados()
				.toList();		
	}
	
	public List<Empleado> empleadosPorDepartamento(String dept) {
		return getEmpleados()
				.filter(a->a.getDepartamento().equals(dept))
				.toList();
	}
	
	public List<String> dept () {
		return getEmpleados()
				.map(a->a.getDepartamento())
				.distinct()
				.toList();
	}

}
