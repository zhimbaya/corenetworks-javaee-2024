package principal;

import java.util.ArrayList;
import java.util.List;

public class TestRemoveIf {

	public static void main(String[] args) {
		List<Integer> numeros =new ArrayList<>(List.of(7,12,-9,-6,4));
		numeros.removeIf(n->n<0);
		numeros.forEach(n->System.out.println(n));	
		

	}

}
