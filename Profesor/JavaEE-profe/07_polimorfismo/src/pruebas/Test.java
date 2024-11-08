package pruebas;

public class Test {

	public static void main(String[] args) {
		//crear un objeto Primera y un objeto Segunda y llamar a print
		/*Primera pr=new Primera(5);
		pr.print();
		Segunda sg=new Segunda(4,"Marca");
		sg.print();*/
		llamadas(new Primera(5));
		llamadas(new Segunda(4,"Marca"));
	}
	static void llamadas(Base b) {
		b.print();
	}

}
