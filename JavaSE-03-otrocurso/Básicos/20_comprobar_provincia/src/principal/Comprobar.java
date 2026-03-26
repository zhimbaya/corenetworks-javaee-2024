package principal;

public class Comprobar {

	public static void main(String[] args) {
		String localidad="Alcala de Henares(Madrid)";
		System.out.println("La provincia es: "+localidad.substring(localidad.indexOf("(")+1,localidad.indexOf(")")));

	}

}
