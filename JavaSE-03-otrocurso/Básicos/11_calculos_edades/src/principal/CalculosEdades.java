package principal;

public class CalculosEdades {

	public static void main(String[] args) {

		var edades= new int[]{34,19,28,55,61,40};
		//calcular la media de edad
		//edad mayor y menor
		var suma=0;
		var mayor=edades[0];
		var menor=edades[0];
		/*for(var i=0;i<edades.length;i++) {
			suma+=edades[i];
			if(edades[i]>mayor) {
				mayor=edades[i];
			}
			if(edades[i]<menor) {
				menor=edades[i];
			}
		}*/
		for(int e:edades) {
			suma+=e;
			if(e>mayor) {
				mayor=e;
			}
			if(e<menor) {
				menor=e;
			}
		}
		System.out.println("La suma es: "+suma);
		System.out.println("La media de edad es: "+suma/edades.length);
		System.out.println("Edad más alta: "+mayor);
		System.out.println("Edad más baja: "+menor);

	}

}
