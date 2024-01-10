package principal;

import java.util.List;

public class Test9Peek {

	public static void main(String[] args) {
		List<Integer> nums = List.of(6,11,-4,8,5,1,10,-4,27,4,-5,41,11);
		System.out.println("Suma: "+
		nums.stream()
		.filter(n->n>0)
		.peek(n->System.out.println(n))
		.mapToInt(n->n)
		.sum());

	}

}
