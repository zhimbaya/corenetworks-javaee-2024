package _07_ejercicio_while;

public class SumaMil {

	public static void main(String[] args) {
		
		int cont = 0;
		int suma = 0;

		while (suma < 1000) {
			cont++;
			suma = suma + cont;
		}
		System.out.println("Hay que sumas hasta " + cont +" : "+suma);
	}

}
