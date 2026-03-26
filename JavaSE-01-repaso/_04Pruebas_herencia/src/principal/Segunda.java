package principal;

public class Segunda extends Primera {
	public Segunda() {
		super(3);
		System.out.println("Constructor de la segunda.");
	}
	@Override
	public void print() {
		System.out.println("Imprimiendo en segunda");
	}
}
