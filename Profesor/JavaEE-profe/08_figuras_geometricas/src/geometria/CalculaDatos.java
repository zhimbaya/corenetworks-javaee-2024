package geometria;

public class CalculaDatos {

	public static void main(String[] args) {
		//creamos un objeto Triangulo y un Circulo con datos cualquiera,
		//y mostramos su color y superficie
		mostrarDatos(new Triangulo("naranja",10,4));
		mostrarDatos(new Circulo("azul",7));
	}
	
	static void mostrarDatos(Figura f) {
		System.out.println("Color: "+f.getColor());
		System.out.println("Superficie: "+f.superficie());
	}

}
