package principal;

import java.util.function.BiPredicate;

public class Test {

	public static void main(String[] args) {
		
		BiPredicate<Integer, Integer> impl1 = (a,b)-> a==b;
		BiPredicate<Integer, Integer> impl2 = (a,b)-> a>0&&b>0;
		BiPredicate<Integer, Integer> impl3 =   impl1.and(impl2);  //(a,b)->(a>0&&b>0)&&a==b; 
		System.out.println(impl3.test(2, 3));
		System.out.println(impl3.test(5, 5));
		
	}

}
