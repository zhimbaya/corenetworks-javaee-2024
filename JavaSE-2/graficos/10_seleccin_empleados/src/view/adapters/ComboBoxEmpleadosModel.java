package view.adapters;

import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;

import service.EmpleadosService;

public class ComboBoxEmpleadosModel extends DefaultComboBoxModel <String>{
	
	ArrayList<String>departamentos;
	

	public ComboBoxEmpleadosModel() {
		departamentos =new ArrayList <>( new EmpleadosService().dept());
		departamentos.add(0,"---Todos---");
	}
	
	@Override
	public int getSize() {
		return departamentos.size();
	}

	@Override
	public String getElementAt(int index) {
		return departamentos.get(index);
	}



	
}
