package service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Pedido;

public class PedidosService {
	
	String dir="c:\\temp\\pedidos.txt";
	Path path;
	//en constructor comprobamos si el fichero existe, si no, lo creamos
	public PedidosService() {
		File file=new File(dir);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		path=Path.of(dir);
	}
	
	private Stream<Pedido>getPedido() {
		try {
			return Files.lines(path)
			.map(s->new Pedido(s.split(",")[0],
					LocalDate.parse(s.split(",")[1]),
					Double.parseDouble(s.split(",")[2])));
		}catch (IOException e) {
			e.printStackTrace();
			return Stream.empty();
		}
	}
	public void guardarPedido(String producto, LocalDate fechaPedido,double precio) {
		String linea=producto+","+fechaPedido+","+precio;		
		try {
			Files.writeString(path, linea+System.lineSeparator(), StandardOpenOption.APPEND);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Pedido pedidoMasReciente() {
		return getPedido()
				.max((a,b)-> a.getFechaPedido().compareTo(b.getFechaPedido()))				
				.orElse(null);	
	}
	
	public List<Pedido> pedidosPrecio(double precioMax) {
		return getPedido()
				.filter(n->n.getPrecio()<=precioMax)
				.toList();
	}
	
	public List<Pedido> anteriores(int meses){
		LocalDate referencia=LocalDate.now().minusMonths(meses);
		return getPedido()
			.filter(s->s.getFechaPedido().isBefore(referencia))
			.toList();
	}
}
