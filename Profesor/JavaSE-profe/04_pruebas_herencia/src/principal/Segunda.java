package principal;

public class Segunda extends Primera{
	public Segunda() {
		super(3);
		System.out.println("Constructor de Segunda");
	}

	@Override
	public void print() {
		System.out.println("Imprimiendo en Segunda");
	}
	
	
}
