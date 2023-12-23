package geometria;

public final class Circulo extends Figura {
	private double base;
	private double altura;

	public Circulo(String color, double base, double altura) {
		super(color);
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double superficie(){
		return (base * altura)/2;
	}

}
