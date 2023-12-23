package geometria;

public final class Triangulo extends Figura {
	
	private double radio;
	
	public Triangulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	@Override
	public double superficie() {
		return (Math.PI * radio * radio);
	}
}
