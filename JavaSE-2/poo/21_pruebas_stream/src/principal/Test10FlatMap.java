package principal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Test10FlatMap {

	public static void main(String[] args) {
		List<Double[]> notas = List.of( new Double[] {2.5,6.7,4.6,9.0},
				new Double[] {7.2,4.4,3.6},
				new Double[] {6.5,3.7,6.6,8.3,5.9},
				new Double[] {7.2,8.4});
		
		System.out.println(notas.stream()  //Stream<Double[]>
				.flatMap(a->Arrays.stream(a)) //Stream<Double>
				.mapToDouble(a->a) //DoubleStream
				.average() //OptionalDouble
				.getAsDouble()); //Double 
		
	}

}
