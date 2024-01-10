package principal;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		HashMap<Integer, String> dias=new HashMap<>();
		dias.put(125, "lunes");
		dias.put(300, "martes");
		dias.put(400, "miércoles");
		dias.put(200, "jueves");
		/*dias.put(300, "viernes");
		System.out.println(dias.get(300));
		dias.remove(200);*/
		var valores=dias.values();
		for(String s:valores) {
			System.out.println(s);
		}

	}

}
