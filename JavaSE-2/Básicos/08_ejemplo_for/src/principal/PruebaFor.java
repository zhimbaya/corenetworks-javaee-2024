package principal;

public class PruebaFor {

	public static void main(String[] args) {
		//mostrar la suma de todos los números pares
		//comprendidos entre 1 y 20
		int suma=0;
		for(int i=1;i<=20;i++) {
			if(i%2==0) {  //¿es par?
				suma=suma+i;//suma+=i;
				
			}
		}
		System.out.println("La suma de los pares es: "+suma);

	}

}
