package principal;

public class Punto3D extends Punto {
	
	
	private int z;
	public Punto3D(int z) {
		
	}
	public Punto3D(int x, int y, int z) {
		super(x,y);
		this.z=z;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	@Override
	public void dibujar() {
		super.dibujar();
		System.out.println(","+z);
		
	}
	
	
}
