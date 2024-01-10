package principal;

public class MensajePrecio {

	public static void main(String[] args) {
		int precio=7;
		/*El programa comprueba el precio, si es 10 muestra
		 * un mensaje que dice "muy caro", si es 9 
		 * el mensaje es "caro", si es 8 "aceptable", si
		 * es 7 "lo compro", si es 6 "barato". Otro precio 
		 * "no válido"
		 */
		switch(precio) {
			case 10:
				System.out.println("Muy caro");
				break;
			case 9:
				System.out.println("Caro");
				break;
			case 8:
				System.out.println("Aceptable");
				break;
			case 7:
				System.out.println("Lo compro");
				break;
			default:
				System.out.println("Precio no válido");	
		}

	}

}
