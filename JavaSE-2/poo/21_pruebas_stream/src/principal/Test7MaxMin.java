package principal;

import java.util.List;

public class Test7MaxMin {

	public static void main(String[] args) {
		List<Integer> nums = List.of(6,11,-4,8,5,1,10,-4,27,4,-5,41,11);
		//mostrar el numoero negativo mas alto
		System.out.println(
				nums.stream()
				.filter(n->n<0) //stream solo negativos
				.max((a,b)->a-b) //optional con el resultado
				.orElse(null)				
				);
		
	}

}
