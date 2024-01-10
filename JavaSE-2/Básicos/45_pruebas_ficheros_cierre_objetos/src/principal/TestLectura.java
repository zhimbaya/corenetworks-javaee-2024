package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.processing.FilerException;

public class TestLectura {

	public static void main(String[] args) {
		try (FileReader f = new FileReader("c:\\temp\\dias.txt");
				BufferedReader bf = new BufferedReader(f);){
		String read =bf.readLine();
		while (read != null ) {
			System.out.println("Linea a leer: "+ read);
			read = bf.readLine();
		}
		}catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
