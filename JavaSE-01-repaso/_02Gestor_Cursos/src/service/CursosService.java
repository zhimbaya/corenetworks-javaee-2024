package service;

import java.util.ArrayList;
import java.util.Iterator;

import model.Curso;

public class CursosService {
	private ArrayList<Curso> cursos = new ArrayList<>();

	// MODIFICAR ESTE MÉTODO PARA QUE AÑADA EL CURSO SI NO HAY OTRO
	// CON EL MISMO NOMBRE, SI YA EXISTE NO SE AÑADE Y SE DEVUELVE FALSE
	public boolean nuevo(String nombre, int duracion, double precio) {
		Curso curso = new Curso(nombre, duracion, precio);
		for (Curso c : cursos) {
			if (c.getNombre().equals(nombre)) {
				return false;
			}
		}
		cursos.add(curso);
		return true;

	}

	public ArrayList<Curso> preciosCursoMax(double precioMax) {
		ArrayList<Curso> aux = new ArrayList<>();
		// RECORREMOS ARRAYLIST PRINCIPAL Y CADA CURSO CON PRECIO IGUAL O INFERIOR AL
		// MAX SERA GUARDADO EN EL AUXILIAR
		for (Curso c : cursos) {
			if (c.getPrecio() <= precioMax) {
				aux.add(c);
			}
		}
		return aux;
	}

	public void eliminarCurso(String nombre) {
		/*
		for (int i = 0; i < cursos.size(); i++) {
			if (cursos.get(i).getNombre().equals(nombre)) {
				cursos.remove(i);
				break; // NOS SALIMOS PARA NO SEGUIR RECORRIENDO
			}
		}
		*/
		//EJEMPLO DE LAMBDA PARA ELIMINAR UN USUARIO
		cursos.removeIf(c->c.getNombre().equals(nombre));

	}

	public void modificarCurso(String nombre, int nuevaDuracion) {
		for (Curso c : cursos) {
			if (c.getNombre().equals(nombre)) {
				c.setDuracion(nuevaDuracion);
				break;
			}
		}
	}
}
