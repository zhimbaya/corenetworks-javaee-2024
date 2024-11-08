package principal;

import java.io.FileReader;
import java.io.IOException;

import com.google.gson.Gson;

import model.Empleado;


public class TestEmpleados {

	public static void main(String[] args) {
		String ruta="c:\\temp\\empleados.json";
		Gson gson=new Gson();
		try (FileReader reader= new FileReader(ruta);) {
			Empleado[] empleados=gson.fromJson(reader, Empleado[].class);
			for(Empleado empleado : empleados) {
				System.out.println("Nombre: " + empleado.getNombre());
				System.out.println("Email: " + empleado.getEmail());
				System.out.println("Departamento: " + empleado.getDepartamento());
				System.out.println("Salario: " + empleado.getSalario());
			}
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
