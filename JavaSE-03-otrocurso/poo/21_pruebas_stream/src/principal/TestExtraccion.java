package principal;

import java.util.List;

public class TestExtraccion {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,6,-4,8,1,10,-4,27,4,-5,41,11);
		//muestra solo los primeros 7
		
		nums.stream()
		.distinct()
		.limit(7)
		.forEach(n->System.out.print(n+","));
		
		//hay algun numero positivo
		System.out.println(
				nums.stream()
				.anyMatch(n->n<0)
				);

		//son todos pares
		System.out.println(
				nums.stream()
				.allMatch(n->n%2==0)
				);
		
	}

}
