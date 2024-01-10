package principal;

import java.util.Arrays;

public class Test11FlatMap {

	public static void main(String[] args) {
		String[][] pedidos= {{"azucar","agua","vino","azucar"},
				{"cerveza","pollo","jamon","vino"},
				{"agua","aceite","pan","lechuga"}};		
	
		System.out.println(Arrays.stream(pedidos) // Stream<String[]>
				.flatMap(a->Arrays.stream(a)) // Stream<String>
				.distinct()
				.count());
		
		
		
		
		
		
	}

}
