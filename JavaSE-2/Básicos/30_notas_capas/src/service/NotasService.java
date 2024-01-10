package service;

import java.util.ArrayList;

public class NotasService {
	ArrayList<Double> notas = new ArrayList<>();
	
	public void guardarNota(double nota) {
		notas.add(nota);		
	}
	public void eliminarNota(int pos) {
		notas.remove(pos);
	}
	public double media () {
		double res=0;
		for(double n :notas) {
			res+=n;
		}
		return res/notas.size();
	}
	public int aprobados() {
		int res=0;
		for(double n :notas) {
			if(n>=5) {
				res++;
			}
		}
		return res;
	}
	public ArrayList<Double> notas() {
		return notas;
	}
}
