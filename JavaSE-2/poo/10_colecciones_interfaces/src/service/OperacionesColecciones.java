package service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class OperacionesColecciones {
	
	public int sumar( Collection<Integer> coleccion) {
		int res=0;
		for(Integer in : coleccion) {
			res+=in;
		}		
		return res;
	}
	
	//realizar un segundo metodo que reciba dos colecciones de numeros
	//y devuelva un conjunto con los numeros contenidos en ambas colecciones
	
	public Set<Integer> sumar( Collection<Integer> coleccion1, Collection<Integer> coleccion2) {
		   Set<Integer> res=new HashSet();
		for (Integer in1 : coleccion1) {
			if(coleccion2.contains(in1)) {
				res.add(in1);
			}
		}		
		return res;
	}

}
