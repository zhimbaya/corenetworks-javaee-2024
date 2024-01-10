package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestEscrituraAppend {

	public static void main(String[] args) {
		PrintStream out=null;
		FileOutputStream fos=null;
		try {
			//objeto para configurar la forma de escritura
			fos = new FileOutputStream("c:\\temp\\dias.txt",true);
			//a partir del objeto anterior creamos en print
			out = new PrintStream(fos);
			out.println("jueves");
			out.println("viernes");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (out !=null) {
				out.close();
			}
			if (out !=null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
