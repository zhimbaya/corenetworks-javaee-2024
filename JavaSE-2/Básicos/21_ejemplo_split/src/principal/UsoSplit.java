package principal;

public class UsoSplit {

	public static void main(String[] args) {
		String datos="Lunes,Martes,Miercoles,Jueves";
		String[] dias = datos.split(",");
		System.out.println("Los días son: " + dias.length);

	}

}
