package view;

import service.Gestion;

public class TestProductos {

	public static void main(String[] args) {
		var prService=new Gestion();
		
		prService.alta("p1", 10, "cat1");
		prService.alta("p2", 20, "cat2");
		prService.alta("p3", 30, "cat3");
		prService.alta("p4", 40, "cat4");
		prService.alta("p5", 50, "cat5");
		prService.alta("p6", 60, "cat6");
		prService.alta("p7", 70, "cat7");
		prService.bajarPrecio(5);
		prService.subirPrecioCategoria(10,"cat1");
		prService.eliminar("cat2");
		prService.obtenerProductos();
		prService.obtenerProductos().forEach(p->
		System.out.println(p.getNombre()+" - "+p.getPrecio()+" - "+p.getCategoria()));
		
	}

}
