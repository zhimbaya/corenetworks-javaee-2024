package pruebas;

import java.util.ArrayList;
import java.util.List;

public class PilaNumber <T extends Number>{

	ArrayList<T> almacen=new ArrayList<>();
	
	public void agregar(T dato) {
		almacen.add(dato);
	}
	
	public T sacar() {
		return almacen.remove(almacen.size()-1);
	}
	public int total() {
		return almacen.size();
	}
	
	public double sum() {
		double suma=0;
		for(T dato : almacen) {
			suma+=dato.doubleValue();
		}
		return suma;
	}
	
}
