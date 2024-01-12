package pruebas;

public class OperacionesNumero {

	public static void main(String[] args) {
		// REALIZAR UN MÉTODO QUE CALCULE EL CUADRADO DE CUALQUIER TIPO DE
		// NÚMERO, EL RESULTADO SE DEVUELVE COMO ENTERO (INT)

		System.out.println("El cuadrado es: " + cuadrado(3));
		System.out.println("El cuadrado es: " + cuadrado(3.5));
		System.out.println("El cuadrado es: " + cuadrado(3F));
		System.out.println("El cuadrado es: " + cuadrado(4L));
		Number m;
		//MOSTRAMOS EL VALOR
		Number n = getRandomNumber();
		System.out.println(n.intValue());
	}

	public static int cuadrado(Number n) {
		int m = n.intValue();
		return m * m;
	}

	// HAZ UN MÉTODO QUE TE DEVUELVA, ALEATORIAMENTE
	// UN DOUBLE, UN INTEGER O UN LONG
	private static Number getRandomNumber() {
		int numberType = (int) (Math.random() * 3 + 1);
		switch (numberType) {
		case 1:
			return Double.valueOf(3.45);

		case 2:
			return Integer.valueOf(200);

		default:
			return Long.valueOf(200);
		}
	}

}
