package pruebas;

import java.util.ArrayList;

public class Pila<T> {
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
}
