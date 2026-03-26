package pruebas;

public class OperacionesNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double a=5.78;
		Integer b=345;
		Byte c=33;
		System.out.println(cuadrado(a));
		System.out.println(cuadrado(b));
		System.out.println(cuadrado(c));
		//mostramos valor entero del número generado aleatoriamente
		Number n=getRandomNumber();
		System.out.println(n.intValue());
	}
	
	//aquí el método
	private static int cuadrado(Number num) {
		int n=num.intValue();
		return n*n;
	}
	
	//haz un método que te devuelva, aleatoriamente,
	//un Double, un Integer o un Long
	
	private static Number getRandomNumber() {
		int numberType=(int)(Math.random()*3+1);
		switch(numberType) {
			case 1:
				return Double.valueOf(3.45); //Double
			case 2:
				return Integer.valueOf(200); //Integer
			default:
				return Long.valueOf(30); //Long
		}
	}
	
	
	

}
