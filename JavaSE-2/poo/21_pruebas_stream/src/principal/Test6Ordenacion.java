package principal;

import java.util.List;

public class Test6Ordenacion {
	public static void main(String[] args) {
		List<Integer> nums = List.of(6,11,-4,8,5,1,10,-4,27,4,-5,41,11);
		//cual es el numero mas pequeño
		System.out.println(nums.stream()
		.sorted()
		.findFirst()
		.get());
		
		
		//Mostrar los cinco numeros mas altos (sin repeticion)
		
		nums.stream()
		.distinct()
		.sorted((a,b)->a-b)
		.limit(5)
		.forEach(n->System.out.println(n));
		
		//mostrar los que van desde la posicion 5 a la 10
		int pos1=5;
		int pos2=10;
		nums.stream()
		.skip(pos1-1)
		.limit(pos2-pos1)
		.forEach(n->System.out.println(n));
		
		
		
		
	}

}
