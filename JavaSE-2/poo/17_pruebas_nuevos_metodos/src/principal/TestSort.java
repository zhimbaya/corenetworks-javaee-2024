package principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestSort {

	public static void main(String[] args) {
		List<Integer> numeros =new ArrayList<>(List.of(7,12,-9,-6,4));
		//ordenar de menor a mayor
		//numeros.sort((a,b)-> a>b?1:-1);
		numeros.sort((a,b) ->a-b);
		numeros.forEach(n->System.out.println(n));
		//ordenar de mayor a menor
		numeros.sort((a,b) ->b-a);
		numeros.forEach(n->System.out.println(n));
		
		List<String> cadena = new ArrayList<>(List.of("Marcos","Lucas", "Angela","Elena"));
		//cadena.sort((a,b) -> a.compareTo(b));  
		cadena.sort(String ::compareTo); 
		cadena.forEach(a->System.out.println(a));
		
		
	}

}
