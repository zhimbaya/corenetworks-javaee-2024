package principal;

public class CalculosNotas {

	public static void main(String[] args) {
		String notas = "4.5,2.7,8.9,5.1,3.4,9.0,6.7,7.2";
		String[] valores = notas.split(",");
		double media = media(valores);
		double aprobados = aprobados(valores);
		double mayor = mayor(valores);
		double menor = menor(valores);
		
		System.out.println(" La media es: " + String.format("%.2f", media));
		System.out.println(" El total aprobados es: " + aprobados);
		System.out.println(" La nota más alta es: " + mayor);
		System.out.println(" La nota mas baja es: " + menor);
		}
	static double media(String[] datos) {
		double r = 0;
		for (String d : datos) {
			r+= Double.parseDouble(d);
		}
		return r/datos.length;
	}
	static int aprobados (String[] datos) {
		int contador = 0;
		for (String d : datos) {
			double nota = Double.parseDouble(d);
			if (nota >= 5) {
				contador++;
			}
		}
		return contador;
	}
	static double mayor (String[] datos) {
		double mayor = Double.parseDouble(datos[0]);
		for (String d : datos) {
			double nota = Double.parseDouble(d);
			if (nota > mayor) {
				mayor =nota;
			}
		}
		return mayor;
	}
	static double menor (String[] datos) {
		double menor = Double.parseDouble(datos[0]);
		for (String d : datos) {
			double nota = Double.parseDouble(d);
			if (nota < menor) {
				menor =nota;
			}
		}
		return menor;
	}
	
	
}
