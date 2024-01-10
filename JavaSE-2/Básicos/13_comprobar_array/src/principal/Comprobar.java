package principal;

public class Comprobar {

	public static void main(String[] args) {
		int [] nums= {3,5,11,2,-3,7,23,-4};
		boolean negativo=false;
		//¿hay algún número negativo en el array?
		for(var n:nums) {
			if(n<0) {
				negativo=true;
				break;
			}
		}
		if(negativo) {
			System.out.println("Había negativo");
		}else {
			System.out.println("No había negativo");
		}

	}

}
