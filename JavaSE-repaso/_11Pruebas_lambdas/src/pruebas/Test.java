package pruebas;

public class Test {

	interface I1 {
		void print(int a);
	}

	interface I2 {
		int cal(String s);
	}

	interface I3 {
		String construct(int a, int b);
	}

	interface I4 {
		Boolean test(int a, int b);
	}

	interface I5 {
		int get();
	}

	interface I6 {
		void tx(String a, int b);
	}

	public static void main(String[] args) {
		// CREAR UNA IMPLEMENTACIÓN LIBRE DE CADA INTERFAZ
		// UTILIZANDO EXPRESIONES LAMBDA
		I1 i1 = a -> System.out.println(a);
		// I2 i2=s->{return s.length();};
		I2 i2 = s -> s.length();
		I3 i3 = (a, b) -> a + "-" + b;
		I4 i4 = (a, b) -> a < b;
		I5 i5 = () -> 3;
		//I6 i6 = (a, b) -> System.out.println(a+b);
		I6 i6 = (a, b) -> {a="";b=3;};

	}

}
