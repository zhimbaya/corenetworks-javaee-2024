package principal;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class TestEscritura {

	public static void main(String[] args) {
		PrintStream out=null;
		try {
			out = new PrintStream("c:\\temp\\dias.txt");
			out.println("lunes");
			out.println("martes");
			out.println("miercoles");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (out !=null) {
			out.close();
			}
		}
	
		
	}

}
