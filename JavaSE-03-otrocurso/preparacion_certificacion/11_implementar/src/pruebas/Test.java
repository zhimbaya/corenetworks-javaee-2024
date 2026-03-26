package pruebas;

/*interface I1{
	
	default void m() {

	}
}

interface I2{
	
	default void m() {

	}
}*//*


public class Test implements I1,I2{

	@Override
	public void m() {
		// TODO Auto-generated method stub
		I1.super.m();
	}*/
	
	interface MyInterf1{
		static void met() {
			System.out.println("static MyInterf1");
		}	
	}
	interface MyInterf2 extends MyInterf1{
		default void met() {
			System.out.println("default MyInterf2");
		}
	}
	class MyClass1 implements MyInterf1,MyInterf2{
		public void met() {
			System.out.println("public MyClass1");
		}
	}
	public class Test {
		public static void main(String[] args) {
			MyInterf1 mf=new MyClass1();
			MyInterf1.met();
		}
	}

