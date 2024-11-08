package service;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class NotasService {
	String dir = "c:\\temp\\notas.txt";
	
	public void guardarNota(double nota) {
				try (FileOutputStream fos = new FileOutputStream(dir,true);
						PrintStream out = new PrintStream(fos)) {
					out.println(nota);
				}catch(IOException ex) {
					ex.printStackTrace();
				}
	}
	public void eliminarNota(int pos) {
		//no se hace de momento
	}
	public double media () {
		int res=0;
		double media=0;
		ArrayList<Double> notas =new ArrayList<Double>();
		try (FileReader f = new FileReader(dir);
				BufferedReader bf = new BufferedReader(f);){
			String nota =bf.readLine();
			while (nota != null ) {
				res++;
				media+=Double.parseDouble(nota);
				nota=bf.readLine();
			}			
		}catch (IOException ex) {
			ex.printStackTrace();
		}
		return media/res;
	}
	public int aprobados() {
		
		int res=0;
		try (FileReader f = new FileReader(dir);
				BufferedReader bf = new BufferedReader(f);) {
			String line = bf.readLine();
			while (line != null ) {
				if(Double.parseDouble(line)>=5) {
					res++;
				}
				line = bf.readLine();
			}
		}catch (IOException ex) {
			ex.printStackTrace();
		}
		return res;
	}
	public ArrayList<Double> notas() {
		ArrayList<Double> notas =new ArrayList<Double>();
		try (FileReader f = new FileReader(dir);
				BufferedReader bf = new BufferedReader(f);){
			String nota =bf.readLine();
			while (nota != null ) {
				notas.add(Double.parseDouble(nota));
				nota=bf.readLine();
			}
		}catch (IOException ex) {
			ex.printStackTrace();
		}
		return notas;
	}
}
