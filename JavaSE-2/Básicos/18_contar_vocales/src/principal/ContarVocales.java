package principal;

import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) {
		//solicita la introduccion de un texto
		//y nos dice cuantas vocales tiene
		int vocales=0;
		Scanner sc=new Scanner(System.in);
		String frase;
		System.out.println("Introduce un texto:");
		frase=sc.nextLine();
		sc.close();
		frase=frase.toLowerCase();
		for (int i=0;i<frase.length();i++) {
			switch(frase.charAt(i)) {
			case 'a','e','i','o','u':
				vocales++;
			break;
			}
		}
		System.out.println("El numero de vocales es: " + vocales);
	}

}
