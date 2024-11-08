package presentacion;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyWindow extends JFrame {
	public MyWindow() {
		//título de la ventana
		super("Primera ventana");
		//comportamiento de botón de cierre
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//tamaño y posición
		this.setBounds(10, 10, 500, 300);
		//llamada a método que carga controles en ventana
		initComponents();
		//hacemos visible la ventana
		this.setVisible(true);
	
	}
	
	private void initComponents() {
		this.setLayout(null); //anulamos gestor de organizacion
		JButton jb1=new JButton("Pulsar aquí");
		JLabel jl1=new JLabel();
		jb1.setBounds(100, 50, 150, 40);
		jl1.setBounds(120, 120, 200, 30);
		//añadir control al contenedor
		this.add(jb1);
		this.add(jl1);
		/***eventos***/
		//implementacion de la inerfaz funcional
		//asociamos objeto manejadir al origen del evento
		jb1.addActionListener(a->jl1.setText("Se ha pulsado el botón"));
		
	}

}
