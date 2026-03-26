package principal;

import java.util.Scanner;

public class Sumatorio {

	public static void main(String[] args) {
		//cambiar esto para que los números se pidan
				//por teclado
				Scanner sc=new Scanner(System.in);
				System.out.println("Introduce primer número:");
				int a=sc.nextInt();
				System.out.println("Introduce segundo número:");
				int b=sc.nextInt();
				//calcular la suma de todos los números comprendidos entre
				//esos dos números
				int suma=0;
				int mayor=Math.max(a, b);//a>b?a:b;
				int menor=Math.min(a, b);//a>b?b:a;
				for(int i=menor;i<=mayor;i++) {
					suma+=i;
				}
				System.out.println("La suma es: "+suma);

	}

}
