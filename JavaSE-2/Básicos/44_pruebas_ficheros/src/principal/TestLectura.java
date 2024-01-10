package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.processing.FilerException;

public class TestLectura {

	public static void main(String[] args) {
		FileReader f=null;
		BufferedReader bf=null;
		try {
		f = new FileReader("c:\\temp\\dias.txt");
		bf = new BufferedReader(f);
		//System.out.println("Linea 1: "+ bf.readLine());
		//System.out.println("Linea 2: "+ bf.readLine());
		String read =bf.readLine();
		while (read != null ) {
			System.out.println("Linea a leer: "+ read);
			read = bf.readLine();
		}
		}catch (IOException ex) {
			ex.printStackTrace();
		}
		finally {
			if (bf !=null) {
				try {
					bf.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (f !=null) {
				try {
					f.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			} 
		}
	}
}
