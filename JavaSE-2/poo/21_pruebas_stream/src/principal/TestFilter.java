package principal;

import java.util.Arrays;
import java.util.List;

public class TestFilter {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,8,-1,11,8);
		//cuantos numeros pares hay
		System.out.println(nums.stream()
		.distinct()
		.filter(n->n%2==0)
		.count());

		String nombres="leche, vino, atun, patatas, leche, agua, vino, lechuga";
		//cuantos productos de menos de 6 caracteres hay?
		System.out.println(Arrays.stream(nombres.split(","))
		.distinct()
		.filter(s->s.length()<6)
		.count());
		
		
		
		
		
		
		
	}

}
