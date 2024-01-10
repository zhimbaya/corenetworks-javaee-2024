package principal;

import java.util.HashSet;

public class Loteria {

	public static void main(String[] args) {
		HashSet<Integer> boleto = new HashSet<>();
		while(boleto.size()<6) {
			boleto.add((int)(Math.random()*49+1));
		}
		for (int n : boleto) {
			System.out.print(n + ",");
		}
	}

}
