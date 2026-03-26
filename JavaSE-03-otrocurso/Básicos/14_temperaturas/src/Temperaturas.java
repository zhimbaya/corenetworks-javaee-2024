
public class Temperaturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [] temps = {12.4,23.3,1.9,30.1,22.4,17,8};
		//imdicar
		double media =0;
		int contador=0;
		//calcular la media
		for (double t:temps) {
			media+= t;
		}
		media/=temps.length;
		//ahora recoremos de nuevo y contamos las temperatiras
		//superiores a ese calor
		for(double t:temps) {
			if(t>media) {
				contador++;
			}
		}
		System.out.println("Total superiores media: " + contador);		
	}
}
