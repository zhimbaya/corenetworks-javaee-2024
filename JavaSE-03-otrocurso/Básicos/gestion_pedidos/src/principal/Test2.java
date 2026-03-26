package principal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Test2 {

	public static void main(String[] args) {
		LocalDate ld1 = LocalDate.of(2022, 11, 28);
		LocalDate ld2 = LocalDate.of(2023, 8, 23);
		if(ld1.isBefore(ld2)) {
			System.out.println("La mas antigua es: " + ld1);
			System.out.println("La mas nueva es: " + ld2);
		}else {
			System.out.println("La mas vieja es: " + ld1);
			System.out.println("La mas moderna es: " + ld2);
		}
		//formateado de fechas
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(ld1.format(dtf));
		System.out.println(ld2.format(dtf));
		//parseado de fecha
		String f ="30/07/2021";
		LocalDate ld3=LocalDate.parse(f, dtf);
		System.out.println(ld3);
		System.out.println("Año: " + ld3.getYear());
		System.out.println("Mes: " + ld3.getMonth());
		System.out.println("Mes: " + ld3.getMonthValue());
		System.out.println("Día: " + ld3.getDayOfMonth());
		//obtener fechas posteriores/anteriores a ciertos valores 
		System.out.println("Mes + 6: " + ld3.plusMonths(6));
		System.out.println("Mes - 3: " + ld3.minusMonths(3));
		
		
	}

}
