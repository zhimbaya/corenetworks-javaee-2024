package geometrica;

public class DatosFiguras {

	public static void main(String[] args) {
		// crear un objeto cualquiera de cada subclase de figura
		//y a continuacion mostrar sus color y su superficie
		
		Triangulo tr = new Triangulo("amarillos", 6,9);
		System.out.println("Colotr de la figura: " + tr.getColor());
		System.out.println("Superficie de la figura: " + tr.superficie());
		Circulo cr = new Circulo("azul", 7);
		System.out.println("Colotr de la figura: " + cr.getColor());
		System.out.println("Superficie de la figura: " +cr.superficie());
	}
}
