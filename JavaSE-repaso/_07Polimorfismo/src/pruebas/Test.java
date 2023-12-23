package pruebas;

public class Test {

	public static void main(String[] args) {
		// CREAR UN OBJETO PRIMERA Y UN OBJETO SEGUNDA
		// Y LLAMAR A PRINT
		Primera pr = new Primera(5);
		pr.print();
		Segunda sg = new Segunda(4, "Marca");
		pr.print();
		
		llamadas (new Primera(5));
		llamadas (new Segunda (4, "marca"));

	}

	static void llamadas(Base b) {
		b.print();
	}
}
