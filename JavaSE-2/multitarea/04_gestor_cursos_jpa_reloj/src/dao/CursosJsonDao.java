package dao;

import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import model.Curso;
import serializacion.DeserializadorFecha;

public class CursosJsonDao {
	private Stream<Curso> getCursos(){
		String ruta="c:\\temp\\cursosfecha.json";
		//Gson gson=new Gson();
		Gson gson=new GsonBuilder()//GsonBuilder
				.registerTypeAdapter(LocalDate.class, new DeserializadorFecha()) //GsonBuilder
				.create();
		try(FileReader reader=new FileReader(ruta);){
			Curso[] cursos=gson.fromJson(reader, Curso[].class);
			return Arrays.stream(cursos);
		}
		catch(IOException ex) {
			ex.printStackTrace();
			return Stream.empty();
		}
	}
	
	public List<Curso> cursos(){
		return getCursos() //Stream<Curso>
				.collect(Collectors.toList());
	}
	
	
}
