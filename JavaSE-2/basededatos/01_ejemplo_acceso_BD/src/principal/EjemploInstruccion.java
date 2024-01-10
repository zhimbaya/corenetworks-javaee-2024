package principal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class EjemploInstruccion {

	public static void main(String[] args) {
		//datos de conexión a la BD
		
		String cadenaCon="jdbc:mysql://localhost:3306/empresa";
		String user="root";
		String pws="root";
		try(Connection con=DriverManager.getConnection(cadenaCon, user, pws);){
		String sql="insert into empleados (nombre, email, departamento, salario) ";
		sql+="values('Laura','laura@test.es','ventas',1600)";
		Statement st=con.createStatement();
		st.execute(sql);
		System.out.println("Empleado añadido!");
	}
		catch(SQLException ex) {
			ex.printStackTrace();
		}
	}
}
