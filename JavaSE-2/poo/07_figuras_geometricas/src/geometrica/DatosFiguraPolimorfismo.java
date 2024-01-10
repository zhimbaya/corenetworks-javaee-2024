package geometrica;

public class DatosFiguraPolimorfismo {

	public static void main(String[] args) {

		mostrarDatos(new Triangulo("naranja", 20,6));
		mostrarDatos(new Circulo("verde", 3));

	}
	
	static void mostrarDatos(Figura fr) {
		System.out.println("Colotr de la figura: " + fr.getClass().getSimpleName()+": " + fr.getColor());
		System.out.println("Superficie de la figura: " + fr.superficie());
	}

}
