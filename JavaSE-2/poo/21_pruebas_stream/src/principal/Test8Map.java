package principal;

import java.util.Arrays;
import java.util.List;

import javax.annotation.processing.SupportedSourceVersion;

public class Test8Map {

	public static void main(String[] args) {
		String nombres="leche vino,atun,patatas-mantequilla,ajo,arroz,lechuga";
		//mostrar las longitudes de cada texto de menor a mayor

		Arrays.stream(nombres.split("[, -]")) //tenemos una cadena de Stream<string>
		.map(s->s.length()) //se convierte en Stream<Integer>
		.sorted()
		.forEach(n->System.out.println(n));
	
		//mostrar el total de caracteres de todos los peroductos, sin contar repetidos
		System.out.println(Arrays.stream(nombres.split("[, -]"))
		.distinct()
		.mapToInt(s->s.length())
		.sum());
		
		List<Integer> nums = List.of(6,11,-4,8,5,1,10,-4,27,4,-5,41,11);
		//media de positivos
		System.out.println(
				nums.stream()
				.filter(n->n>0)
				.mapToInt(n->n)
				.average()
				.orElse(0)
				);
		
	
	}

}
