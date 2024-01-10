package principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {
		//realiza un programa que vaya solicitanto la introduccion 
		//de numeros enteros y los ira guardando. 
		//Cada vez que pida un numero y lo guarda, preguntara al ususarios 
		//si decesa introducir otro numero. Cuando diga que no, 
		//se mostrara la suma de todos los numeros introducidos.
		ArrayList<Integer> lista=new ArrayList<>();
		int numero;
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		String respuesta;
		int suma = 0;
		do {
			System.out.println("Escriba su numero:");
			numero =(sc.nextInt());
			lista.add(numero);
			System.out.println("Desea continuar? (si/no)" );
			respuesta = sc1.nextLine();
		}while (respuesta.equals("si"));
			for (int i : lista) {
				suma+=i;
			}
		System.out.println("La suma es: " + suma );
	}
}
