package principal;

public class Verificar {

	public static void main(String[] args) {
		String cursos="Ofimatca,Java basico,JavaEE,Sprint,Boot,Angular,Programacion avanzada en Java";
		//cuantos cursos sobre Java hay?
		int contador=0;
		String [] subject = cursos.toLowerCase().split(",");
		for (String c : subject) {
			if (c.contains("java")) {
				contador++;
			}
		}
		
		System.out.println("Los cursos de Java son: " + contador);
	}
}
