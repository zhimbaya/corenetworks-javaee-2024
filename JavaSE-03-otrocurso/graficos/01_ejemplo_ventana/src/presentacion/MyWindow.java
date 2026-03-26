package presentacion;

import javax.swing.JFrame;

public class MyWindow extends JFrame {
	public MyWindow() {
		//titulo de la ventana
	super("Nueva ventana");
	//comportamiento del boton de cierre
	this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	//tamaño y posicion
	this.setBounds(10, 10, 500, 300);
	//hacemos visible la ventana
	this.setVisible(true);
	
	}

}
