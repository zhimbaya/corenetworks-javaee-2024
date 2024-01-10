package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.stream.Stream;

import model.Empleado;

public class EmpleadoService {
	Empleado empleado = new Empleado();
	String cadenaCon="jdbc:mysql://localhost:3306/empresa";
	String user="root";
	String pws="root";
		
		public boolean altaEmpleado(Empleado empleado) {
			
			try(Connection con=DriverManager.getConnection(cadenaCon, user, pws);) {
			/*String sql="insert into empleados (nombre, email, departamento, salario) ";
					sql+="values('"+ empleado.getNombre()+ "','"+empleado.getEmail()+"','"+empleado.getDepartamento()+"',"+empleado.getSalario()+")";
					Statement st=con.createStatement();
					st.execute(sql);
					return true;*/
				//opcion con prepare statement
				String sql="insert into empleados (nombre, email, departamento, salario) values (?,?,?,?)";
				//se crea el preparedStatement a partir de la squl
				PreparedStatement ps=con.prepareStatement(sql);
				//sustituimos parametros por valores
				ps.setString(1, empleado.getNombre());
				ps.setString(2, empleado.getEmail());
				ps.setString(3, empleado.getDepartamento());
				ps.setDouble(4, empleado.getSalario());
				ps.execute();
				return true;
				
			}catch(SQLException ex) {
				ex.printStackTrace();
				return false;
			}
			
		}
		
		//eliminar empleado por email		
		public boolean eliminarEmpleado(String mail) {
			
			
			try(Connection con=DriverManager.getConnection(cadenaCon, user, pws);) {
				String sql="delete from empleados where idEmpleado=?";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, mail);
				ps.execute();
				return true;
			
			}catch(SQLException ex) {
				ex.printStackTrace();
				return false;
			}
		}
		
		//modificar salario de empeado: se recibe el idEmpleado y el nuevo salario
		public boolean updateSalary(double salary, int nuemro) {
			
			try(Connection con=DriverManager.getConnection(cadenaCon, user, pws);) {
				String sql="update empleados set salario=? where idEmpleado=?";
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setDouble(1, salary);
				ps.setInt(2, nuemro);
				ps.execute();
				return true;
			
			}catch(SQLException ex) {
				ex.printStackTrace();
				return false;
			}
		}
}


