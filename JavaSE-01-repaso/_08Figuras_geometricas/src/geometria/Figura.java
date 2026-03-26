package geometria;

public abstract class Figura {
	// LA CLASE FIGURA REPRESENTA UNA FIGURA GEOMÉTRICA
	// TODA FIGURA GEOMÉTRICA SE CARACTERIZA POR UN ATRIBUTO "COLOR"
	// Y UN MÉTODO PARA CALCULAR SU SUPERFICIE
	
	//CREAMOS DOS SUBCLASES DE FIGURA
	//TRIANGULO, CON LOS ATRIBUTOS BASE Y ALTURA
	//CIRCULO, CON EL ATRIBUTO RADIO 
	private String color;

	public abstract double superficie();

	public Figura(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
