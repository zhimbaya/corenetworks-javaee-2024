package principal;

public class Ajedrez {
	
	public static void main(String[] args) {			
		int filas;
		int columnas;
		
		for (columnas=1; columnas<=5; columnas++) {
			for (filas=1; filas<=5; filas++) {
				System.out.print("██");
				System.out.print("  "); 
			}
				System.out.println("");
			for (filas=1; filas<=5; filas++) {
				System.out.print("  ");
				System.out.print("██");
			}
				System.out.println("");
		} 
		int[] mAr={5,9,12,4,7};
		
		for(int i=0;i<mAr.length;i++){
			System.out.println(i+" ");
		}
	}
	
}
