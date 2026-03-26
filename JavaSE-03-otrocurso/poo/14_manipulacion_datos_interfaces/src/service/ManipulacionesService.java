package service;

import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ManipulacionesService {

	/*public int sumaPares(List<Integer> numeros) {
		int suma=0;
		for(Integer in : numeros) {
			if(in%2==0) {
				suma+=in;
			}
		}
		return suma;
	}

	public int sumaPositivos(List<Integer> numeros) {
		int suma=0;
		for(Integer in : numeros) {
			if(in>0) {
				suma+=in;
			}
		}
		return suma;
	}*/
	//creamos un metodo que sirva para sumar los numeros de la 
	//coleccion que cumpan el criterio
	
	public int sumarCriterio(List<Integer> numeros, Predicate<Integer> criterio) {
		int suma=0;
		for(Integer in : numeros) {
			if(criterio.test(in)) {
				suma+=in;
			}
		}
		return suma;
	}
	
	//metodo que recibe lista de enteros y los imprime
	//metodo que recibe lista de enteros y los guarda en fichero
	//metodo que recibe lista de enteros y los manda en la nube
	
	
	public void consumer(List<Integer> numeros, Consumer<Integer> consumer) {
		for(Integer in : numeros) {
			consumer.accept(in);	
		}
	}
	//metodo que recibe lista de enteros y los imprime los pares
	//metodo que recibe lista de enteros y guarda en un fichero los positivos
	//metodo que recibe lista de enteros y manda en la nube los multiplos de cinco
	
	public void procesarCollectionPorCriterio (Collection<Integer> numeros, Predicate<Integer> criterio, Consumer<Integer> proceso) {
		
		for(Integer in : numeros) {
			if(criterio.test(in)) {
				proceso.accept(in);
			}	
		}	
	}
	
	//metodo que recibe una colccion de enteros y devuelve el cuadrado de esos numeros
	//metodo que recibe una colccion de enteros y devuelve la rais cubica de esos numeros
	public int sumaTransformacion(Collection<Integer> numero, UnaryOperator<Integer> fun) {
		int suma = 0;
		for (Integer n : numero) {
			suma+=fun.apply(n);//se acumula el resultado de operar el numero
		}
	return suma;	
	}
	
	
}
