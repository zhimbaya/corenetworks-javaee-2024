package _07_ejercicio_while;

public class SumaMil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont = 0;
		int suma = 0;

		while (suma < 1000) {
			cont++;
			suma = suma + cont;
		}
		System.out.println("Hay que sumas hasta " + cont);
	}

}
