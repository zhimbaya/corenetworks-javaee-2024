package _10_calculadora;

public class Calculadora {

	// atributos donde guardamos los
	// números con los que se va a operar
	private int x, y;

	// constructor
	public Calculadora(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int sumar() {
		return x + y;
	}

	public int restar() {
		return x - y;
	}

	public int multiplicar() {
		return x * y;
	}

	public int dividir() {
		return x / y;
	}

	public void guardarX(int x) {
		this.x = x;
	}

	public void guardarY(int y) {
		this.y = y;
	}

	public static int factorial(int n) {

		int r = 1;

		for (int i = 1; i <= n; i++) {
			r = r * i;
		}
		return r;
	}

	public static void main(String[] args) {
		int a = 25;
		int b = 10;

		Calculadora c = new Calculadora(a, b);

		// hacer operaciones
		System.out.println("Suma: " + c.sumar());

		System.out.println("Restar: " + c.restar());

		System.out.println("Multiplicar: " + c.multiplicar());

		System.out.println("Dividir: " + c.dividir());

		System.out.println("Factorial de 5: " + Calculadora.factorial(5));

	}
}
