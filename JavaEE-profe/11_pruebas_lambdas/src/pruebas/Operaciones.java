package pruebas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> enteros=List.of(8,5,-2,4,1,7,12);
		//llamando al método print definido en esta clase, mostrar
		//los números pares de la lista de enteros
		print(enteros,n->n%2==0);
		
		//otro que imprima los negativos
		print(enteros,n->n<0);
		
		
		//llamando al método transform, coger la colección de enteros y obtener una colección
		//con las raices cuadradas de cada entero
		Collection<Double> raices=transform(enteros,n->Math.sqrt(n));
		System.out.println(raices);
		
		
	}
	
	//método que muestra todos los números de la colección recibida 
	//como parámetro, y que cumplen la condición recibida también como 
	//parámetro
	static void print(Collection<Integer> col, Predicate<Integer> pr) {
		for(Integer in:col) {
			if(pr.test(in)) {
				System.out.println(in);
			}
		}
	}
	
	//método que recibe una colección de enteros, y devuelve una colección de double
	//resultante de transformar cada entero de la colección en un double, según 
	//la operación de transformación recibida como parámetro
	static Collection<Double> transform(Collection<Integer> col, Function<Integer,Double> tx){
		ArrayList<Double> resultado=new ArrayList<Double>();
		for(Integer in:col) {
			resultado.add(tx.apply(in));
		}
		return resultado;
	}
	
	
	
	

}
