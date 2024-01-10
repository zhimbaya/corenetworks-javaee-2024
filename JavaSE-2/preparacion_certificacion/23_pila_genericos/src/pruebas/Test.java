package pruebas;

public class Test {

	public static void main(String[] args) {
		Pila<Integer> pila=new Pila<>();
		pila.agregar(10);
		pila.agregar(6);
		System.out.println(pila.sacar());
		Pila<String> pila2=new Pila<>();
		pila2.agregar("h");
		pila2.agregar("S");
		//no es posible
		//Pila<Number> p=new Pila<Integer>();
		mostrar(pila);
		//mostrar(pila2);
	}
	
	//mostrar tamaño pila
	static void mostrar(Pila<? extends Number> p) {
		System.out.println(p.total());
	}

}
