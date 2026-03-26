package principal;

public class Test3 {
	
	interface Printer{
		void print(String cad);
		
		static Printer of() {
			
			return new Printer() {
				
				@Override
				public void print(String cad) {
					System.out.println(cad);
				}
			};
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
