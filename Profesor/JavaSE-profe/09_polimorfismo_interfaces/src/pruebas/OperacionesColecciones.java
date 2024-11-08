package pruebas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class OperacionesColecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Integer> v=new Vector<>();
		v.add(6);v.add(7);v.add(5);
		System.out.println(sumatorio(v));
		System.out.println(pares(v).size());
	}
	
	//realizar un método que reciba una lista de Integer
	//y devuelva la suma de todos los números de la lista
	static int sumatorio(List<Integer> list) {
		int suma=0;
		for(Integer n:list) {
			suma+=n;
		}
		return suma;
	}
	
	//realizar un método que reciba una colección de enteros (Integer)
	//y devuelva una lista con los pares que hay en esa colección
	static List<Integer> pares(Collection<Integer> numeros) {
		List<Integer> pares=new ArrayList<>();
		for(Integer n:numeros) {
			if(n%2==0) {
				pares.add(n);
			}
		}
		return pares;
	}

}
