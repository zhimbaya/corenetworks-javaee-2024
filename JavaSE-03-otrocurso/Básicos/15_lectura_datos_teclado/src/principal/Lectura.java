package principal;

import java.util.Scanner;

public class Lectura {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escriba su nombre");
		String nombre=sc.nextLine();
		System.out.println("Te llamas: " + nombre);
		
	}
}
