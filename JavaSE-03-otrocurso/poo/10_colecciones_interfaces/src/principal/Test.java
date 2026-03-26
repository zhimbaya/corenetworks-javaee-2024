package principal;

import java.util.ArrayList;
import java.util.HashSet;

import service.OperacionesColecciones;

public class Test {

	public static void main(String[] args) {
		//crear una lista y un conjunto cualquiera de numeros
		//enteros y probar el fincionamiento dek metodo sumar()
		ArrayList<Integer> lista = new ArrayList<>();
		lista.add(2);lista.add(8);lista.add(4);lista.add(5);lista.add(6);
		HashSet<Integer> conjunto = new HashSet<>();
		conjunto.add(2);conjunto.add(6);conjunto.add(8);
		
		OperacionesColecciones oper = new OperacionesColecciones();
		System.out.println("Suma Lista: " + oper.sumar(lista));
		System.out.println("Suma conjunto: " + oper.sumar(conjunto));
		System.out.println("los numero en comun son: " + oper.sumar(lista,conjunto));
		
	}
		

}


