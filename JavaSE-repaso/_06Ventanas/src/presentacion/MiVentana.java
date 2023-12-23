package presentacion;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MiVentana extends JFrame {

	public MiVentana(String title) {
		super(title);
		// ESTABLECER TAMAÑO Y POSICION Y HERENCIA VISIBLE
		setBounds(500, 200, 600, 400);
		// setBackground(Color.YELLOW);
		getContentPane().setBackground(Color.YELLOW);
		inicializarComponentes();
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	// INCLUIR UN CONSTRUCTOR QUE PERMITA ESTABLECER TITULO POSICION Y TAMAÑO Y
	// TAMAÑO DE LA VENTANA
	public MiVentana(String titulo, int x, int y, int w, int h) {
		super(titulo);
		setBounds(x, y, w, h);
		getContentPane().setBackground(Color.GREEN);
		inicializarComponentes();
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	void inicializarComponentes() {
		setLayout(null);
		JLabel lbl1 = new JLabel("Usuario: ");
		JLabel lbl2 = new JLabel("Contraseña: ");
		JTextField txtUsuaario = new JTextField();
		JTextField txtContrasena = new JTextField();
		JButton btnEntrar = new JButton("Entrar");
		
		lbl1.setBounds(150, 100, 150, 40);
		lbl2.setBounds(150, 170, 150, 40);
		txtUsuaario.setBounds(350, 100, 100, 40);
		txtContrasena.setBounds(350, 170, 100, 40);
		btnEntrar.setBounds(250, 230, 150, 30);
		
		add(lbl1);
		add(lbl2);
		add(txtUsuaario);
		add(txtContrasena);
		add(btnEntrar);
	}
}
