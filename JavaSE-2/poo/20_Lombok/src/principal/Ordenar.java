package principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import modelo.Curso;

public class Ordenar {

	public static void main(String[] args) {
		List<Curso> cursos=new ArrayList<>(List.of(
					new Curso("Java Basico", 100, LocalDate.of(2023, 11, 20), 350),
					new Curso("Spring", 70, LocalDate.of(2023, 10, 11), 230),
					new Curso("Angular", 60, LocalDate.of(2023, 10, 11), 125),
					new Curso("Hibernate", 30, LocalDate.of(2023, 10, 10), 80),
					new Curso("Python", 90, LocalDate.of(2023, 11, 20), 160)
				));
		
		//ordenar la lista de cursos por fecha de inicio. En caso de comentzar en la misma fecha
		//se ordenan por duracion
		//despues se muestran todos
		   
		cursos.sort((a,b) -> a.getFechaInicio().compareTo(b.getFechaInicio() ));
		cursos.forEach(c-> System.out.println("Ordenados por fecha: " + c.getFechaInicio()+" -"+ c.getDenominacion()+" - "+c.getPrecio()+" - "+c.getDuracion()));
		System.out.println("\n");
		
		Comparator<Curso> byDate = (a,b) -> a.getFechaInicio().compareTo(b.getFechaInicio());
		Comparator<Curso> byDuration = (a, b) -> Integer.compare(a.getDuracion(), b.getDuracion());
		cursos.sort(byDate.thenComparing(byDuration));
		
		cursos.forEach(c-> System.out.println("Ordenados por fecha y duracion: " +c.getFechaInicio()+" -"+ c.getDenominacion()+" - "+c.getPrecio()+" - "+c.getDuracion()));
		

	}

}
