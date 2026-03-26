package principal;

import java.util.ArrayList;

public class PruebaLista {

	public static void main(String[] args) {
		ArrayList<String> dias = new ArrayList<>();
		//var otra = new ArrayList<String>();
		dias.add("Lunes");
		dias.add("Martes");
		dias.add(1,"Miercoles");
		System.out.println(dias.size());
		dias.remove(0);
		System.out.println(dias.get(1));
	}
}
