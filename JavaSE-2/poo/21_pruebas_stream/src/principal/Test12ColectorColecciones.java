package principal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test12ColectorColecciones {

	public static void main(String[] args) {
		List<Integer> nums=List.of(6,11,-4,8,-1,10,8,10,6,8,-9);
		//crear una lista con todos los numeros positivos 
		//sin incluir repetidos
		
		List<Integer> positivos=nums.stream() //Stream<Integer>
				.distinct()
				.filter(n->n>0) //Stream<Integer> solo postivos
				//.collect(Collectors.toList())
				.toList(); //ojo solo desde Java 16
				System.out.println(positivos);
				
		//crear una lista con todos los numeros positivos 
		//sin incluir repetidos
				Set<Integer> pos=nums.stream() //Set no admite repetidos, por ellos nos ahoramos la instruccion .distinct()
						
						.filter(n->n>0)
						.collect(Collectors.toSet());
				
				
		List<String> empleados=List.of("1112F-Angel","98Q-Ana","223R-Esteban");
		//Generar una tabla, donde el código es la clave y el nombre el valor
		Map<String,String> emps=empleados.stream()//Stream<String>
							.collect(Collectors.toMap(s->s.split("-")[0], s->s.split("-")[1]));
			
		
		List<String> empleados2=List.of("ventas-Angel","administracion-Ana","ventas-Esteban",
				"ventas-Javier",
				"informatica-Laura",
				"administracion-Lucas");
		Map<String,List<String>> division=empleados2.stream()
				.collect(Collectors.groupingBy(s->s.split("-")[0]));
		division.forEach((k,v)-> {
			System.out.print(k+": ");
			v.forEach(n->System.out.println(n.split("-")[1]));
		});
		
		//
		Map<Boolean,List<Integer>> numeros=nums.stream()		
										.collect(Collectors.partitioningBy(n->n>0));
		System.out.println(numeros);
				
		
			
	}

}
