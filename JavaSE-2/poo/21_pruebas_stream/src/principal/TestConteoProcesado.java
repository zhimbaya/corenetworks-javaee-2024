package principal;

import java.util.List;

public class TestConteoProcesado {

	public static void main(String[] args) {
		List<Integer> nums = List.of(6,11,-4,8,1,10,-4,27,4,-5,41,11);
		
		/*System.out.println(nums.stream().count());
		nums.stream()
		.forEach(n->System.out.println(n));*/
		nums.stream()
		.distinct()
		.forEach(n->System.out.print(n+","));

	}

}
