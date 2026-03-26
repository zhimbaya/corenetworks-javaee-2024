package principal;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date(2337484972132l);
		if (d1.before(d2)) {
			System.out.println("La fecha más antigua es: " + d1);
			System.out.println("La fecha más nueva es: " + d2);
		}else {
			System.out.println("La fecha más moderna es: " + d2);
			System.out.println("La fecha más vieja es: " + d1);
		}
		//formatear fechas
		SimpleDateFormat fr = new SimpleDateFormat("dd/mm/yyyy");
		String time1 = fr.format(d1);
		String time2 = fr.format(d2);
		System.out.println("La fecha más antigua/vieja es: " + time1);
		System.out.println("La fecha más nueva/moderna es: " + time2);
		//formato con localizacion
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, Locale.getDefault());
		System.out.println("La fecha más antigua/vieja local es: " + df.format(d1));
		System.out.println("La fecha más nueva/moderna local es: " + df.format(d2));
		//parseado de fecha
 		String f = "30-05-2022";
 		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
 		Date d3;
		try {
			d3 = sdf.parse(f);
			System.out.println("Fecha parceada: " + d3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("cadena de fecha no valida: " );
		}
 		
 		
	}

}
