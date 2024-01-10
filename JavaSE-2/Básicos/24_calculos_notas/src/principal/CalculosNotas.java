package principal;

public class CalculosNotas {

	public static void main(String[] args) {
		String notas = "4.5,2.7,8.9,5.1,3.4,9.0,6.7,7.2";
		//calcular:
		//nota media
		//nota mas alta
		//nota mas baja
		//total aprobados
		String[] valores = notas.split(",");
		double media = 0;
		int contador = 0;
		double mayor = Double.parseDouble(valores[0]);
		double menor = Double.parseDouble(valores[0]);
		
		for (String m : valores) {
			double nota = Double.parseDouble(m);
			media+=nota;
			if (nota >= 5) {
				contador++;
			}
			if(nota > mayor) {
				mayor = nota;
			}
			if(nota < menor) {
				menor = nota;
			}
		}
		//media/=valores.length;
		System.out.println("La media es: " + String.format("%.2f",media/=valores.length));
		System.out.println("Total de aprobados: " + contador);
		System.out.println("La nota más alta es: " + mayor);
		System.out.println("Los nota más baja es: " + menor );
		}
}
