package principal;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class TestEscrituraAppend {

	public static void main(String[] args) {
		
		try (FileOutputStream fos = new FileOutputStream("c:\\temp\\dias.txt",true);
				PrintStream out = new PrintStream(fos)){
			out.println("jueves");
			out.println("viernes");
			out.println("sabado");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
