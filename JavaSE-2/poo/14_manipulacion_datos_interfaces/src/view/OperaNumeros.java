package view;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import service.ManipulacionesService;

class CriterioPares implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		return t%2==0;
	}	
}
class CriterioNegativos implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
	
		return t<0;
	}	
}
class CriterioMultiplos implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
	
		return t%5==0;
	}	
}

class GuardadFichero implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		FileOutputStream out=null;
		try {
		out=new FileOutputStream("c:\\temp\\consumer.txt");
		}catch (Exception e) {
			e.printStackTrace();
		}		
	}
}

public class OperaNumeros {

	public static void main(String[] args) {
		List<Integer> numeros =List.of(-5,7,11,4,2,-1,10,8);
		
		//utilizando ManipulacionesService
		//mostrar la suma de los pares por un lado y la suma de los negativos por otra
		ManipulacionesService ms = new ManipulacionesService();
		
		System.out.println("Suma pares: " + ms.sumarCriterio(numeros, new CriterioPares()));
		System.out.println("La suma de los negativos: " + ms.sumarCriterio(numeros, new CriterioNegativos()));
		
		ms.procesarCollectionPorCriterio(numeros, new CriterioNegativos(), new GuardadFichero());
		
		
	
	
	}	
	
	  
			
			
}
