package principal;

public class Test {

	public static void main(String[] args) {
		Object ob = "Cadena";
		
		String cad = (String) ob;
		System.out.println(cad);
		
		//complila pero dará error de java.lang.ClassCastException por el tipo de valor que se esta pasando
		Object ob1 ="300";
		Integer it = (Integer) ob;
		System.out.println(it);
	}

}
