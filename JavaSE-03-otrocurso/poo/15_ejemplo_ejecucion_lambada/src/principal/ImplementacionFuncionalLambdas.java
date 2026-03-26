package principal;

public class ImplementacionFuncionalLambdas {
	
	interface Printer{
		void print(String s);
	}

	//crear implementación de la interfaz en la que el método muestre el parámetro
	//por pantalla
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer printer=s->System.out.println(s);
		printer.print("Implementacion con lamdas");
	}
}
