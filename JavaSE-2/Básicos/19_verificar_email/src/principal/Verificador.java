package principal;

import java.util.Scanner;

public class Verificador {

	public static void main(String[] args) {
		// realizar un programa que solicite instruccion
		//de una direccion de email y nos indique si es o no valida
		//direccion valida: contiene al menos un punto y una @
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduzca una direccion de email");
		String email=sc.nextLine();
		sc.close();
		if(email.indexOf("@")!=-1&&email.indexOf(".")!=-1) {
			System.out.println("el email: "+email+" es valido");
		}else {
			System.out.println("el email: "+email+" no es valido");
		}
		//solucion alternativa
		if(email.contains("@")&&email.contains(".")) {
			System.out.println("el email: "+email+" es valido");
		}else {
			System.out.println("el email: "+email+" no es valido");
		}
	}

}
