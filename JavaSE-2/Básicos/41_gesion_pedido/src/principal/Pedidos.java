package principal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import modelo.Cesta;
import service.PedidoService;


public class Pedidos {

	public static void main(String[] args) {
		//Cesta cesta = new Cesta();
		Scanner sc = new Scanner(System.in);
		Scanner scMenu = new Scanner(System.in);
		PedidoService pedidoService = new PedidoService();
		Date d = null;
		int opcion;
		do {
			mostrarMenu();
			opcion=scMenu.nextInt();
			switch(opcion) {
				case 1:
					System.out.println("Producto:");
					String producto = sc.nextLine();
					System.out.println("Precio:");
					int precio = Integer.parseInt(sc.nextLine());
					System.out.println("Date (dd/mm/yyyy)");
					String date = sc.nextLine();
			 		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
				try {
					d = sdf.parse(date);
				} catch (ParseException e) {
					e.printStackTrace();
				}
					
					if (pedidoService.alta(producto,precio,d) == true) {
						System.out.println("Contacto guardado");
					}else{
						System.out.println("Error:");
					}
					break;
				case 2:
					Cesta c = pedidoService.recientes();
					System.out.println("El producto más recien es: " + c.getProducto());
					
					break;
				case 3:
					System.out.println("Precio:");
					double precioMax=Double.parseDouble(sc.nextLine());
					ArrayList<Cesta> pedidos = pedidoService.precioInferior(precioMax);
					for (Cesta ped : pedidos) {
						System.out.println("Los producto de precio inferio son:" + ped.getProducto() );
					}
					break;
				case 4:
					System.out.println("---Adios---");
			}
		}while(opcion !=4);
			
	}
	static void mostrarMenu () {
		System.out.println("\n1. Dar de alta el producto");
		System.out.println("2. Ver el producto más reciente");
		System.out.println("3. Ver el producto de precio inferio");
		System.out.println("4. Salir");
	}


}
