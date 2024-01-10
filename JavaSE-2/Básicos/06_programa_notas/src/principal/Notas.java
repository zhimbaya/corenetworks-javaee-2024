package principal;

public class Notas {

	public static void main(String[] args) {
		int nota=6;
		/*En función de la nota muestra calificación:
		Entre 1 y 4: suspenso
		5 y 6: aprobado
		7 y 8: notable
		9 y 10: sobresaliente
		otro valor: nota no válida
		*/
		//¡¡¡SOLUCIÓN JAVA 17!!
		switch(nota) {
			case 1,2,3,4:
				System.out.println("suspenso");
				break;
			case 5,6:
				System.out.println("aprobado");
				break;
			case 7,8:
				System.out.println("notable");
				break;
			case 9,10:
				System.out.println("sobresaliente");
				break;
			default:
				System.out.println("Nota no válida");
		}
		//solución antes de Java 17
		switch(nota) {
		case 1:
		case 2:
		case 3:
		case 4:
			System.out.println("suspenso");
			break;
		case 5:
		case 6:
			System.out.println("aprobado");
			break;
		case 7:
		case 8:
			System.out.println("notable");
			break;
		case 9:
		case 10:
			System.out.println("sobresaliente");
			break;
		default:
			System.out.println("Nota no válida");
	}

	}

}
