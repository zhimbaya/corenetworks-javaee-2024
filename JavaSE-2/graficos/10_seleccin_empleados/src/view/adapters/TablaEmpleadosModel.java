package view.adapters;

import java.util.List;

import javax.swing.table.AbstractTableModel;

import model.Empleado;
import service.EmpleadosService;

public class TablaEmpleadosModel extends AbstractTableModel {

	List<Empleado> empleados;
	final int COLS=3;
	public TablaEmpleadosModel(String dept) {
		empleados=new EmpleadosService().empleadosPorDepartamento(dept);
	}
	public TablaEmpleadosModel() {
		empleados=new EmpleadosService().empleados();
	}

	@Override
	public int getRowCount() {
		return empleados.size();
	}

	@Override
	public int getColumnCount() {
		return COLS;
	}

	@Override
	public String getColumnName(int column) {
		/*Expreción switch Java 17
		return switch(column) {
			case 0->"Nombre";
			case 1->"Email";
			case 2->"Salario";
			default->"Indeterminada";
		};*/
		switch(column) {
			case 0:
				return "Nombre";
			case 1:
				return "Email";
			case 2:
				return "Salario";
			default:
				return "Indeterminada";
		}
	}

	@Override
	public Object getValueAt(int row, int column) {
		switch(column) {
		case 0:
			return empleados.get(row).getNombre();
		case 1:
			return empleados.get(row).getEmail();
		case 2:
			return empleados.get(row).getSalario();
		default:
			return null;
		}
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) {
		switch(columnIndex) {
		case 0:
			return String.class;
		case 1:
			return String.class;
		case 2:
			return String.class;
		default:
			return null;
	}
	}
	
	
	
	
}
