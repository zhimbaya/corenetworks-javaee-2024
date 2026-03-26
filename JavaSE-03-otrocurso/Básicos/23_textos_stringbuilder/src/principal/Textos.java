package principal;

public class Textos {

	public static void main(String[] args) {
		String productos="Detergente,Vino,Pan,Agua,Leche,Mantequilla,Arroz";
		//crear una nueva cadena de caracteres que contenga los productos 
		//que empiezan por A
		
		String[] datos=productos.toLowerCase().split(",");
		StringBuilder resultado=new StringBuilder();
		
		for (String p : datos) {
			if(p.startsWith("a")) {
				resultado.append(p);
				resultado.append(",");
			}
		}
		System.out.println(resultado.delete(resultado.length()-1, resultado.length()));
	}

}
