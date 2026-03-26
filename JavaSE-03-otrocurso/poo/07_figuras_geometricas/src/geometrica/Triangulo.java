package geometrica;

public class Triangulo extends Figura {

	private int altura;
	private   int base;
	
	public Triangulo(String color, int altura, int base) {
		super(color);
		this.altura = altura;
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	@Override
	public double superficie() {
		
		return base*altura/2;
	}

}
