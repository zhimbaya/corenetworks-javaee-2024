package principal;

import java.util.Arrays;
import java.util.List;

public class FindFirst {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,8,-1,10,8,2,11,27,-5,-4,41,10);
		//¿cuál es el primer número negativo de la lista?
		System.out.println(nums.stream()
			.filter(n->n<0) //Stream con los negativos
			.findFirst().orElse(null));
		
		String nombres="leche, vino, atun, patatas, leche, agua, vino, lechuga";
		
		//nombre del primer producto que empieze por "a". si no hay ninguno
		//que muestre "no hay ninguno"
		
		System.out.println(
				Arrays.stream(nombres.split(","))
				.filter(s->s.startsWith("p"))
				.findFirst()
				.orElse("no hay nunguno")
				);
				
		
		

	}

}
