package presentacion;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		txtUsuaario.setBounds(350, 100, 200, 40);
		txtContrasena.setBounds(350, 170, 200, 40);
		btnEntrar.setBounds(250, 230, 150, 30);

		add(lbl1);
		add(lbl2);
		add(txtUsuaario);
		add(txtContrasena);
		add(btnEntrar);

		// CREAR CLASES DE GESTIÓN DE EVENTOS
		// MEDIANTE CLASE ANÓNIMA DEFINIMOS LA CLASE (SIN NOMBRE) Y CREAMOS UN OBJETO DE
		// LA MISMA
		/*
		 * ActionListener listener = new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { if
		 * (txtUsuaario.getText().equals("admin") &&
		 * txtContrasena.getText().equals("pwd")) {
		 * JOptionPane.showMessageDialog(MiVentana.this, "Usuario válido"); } else {
		 * JOptionPane.showMessageDialog(MiVentana.this, "Usuario incorrecto"); }
		 * 
		 * } };
		 */

		ActionListener listener = e -> {
			if (txtUsuaario.getText().equals("admin") && txtContrasena.getText().equals("pwd")) {
				JOptionPane.showMessageDialog(MiVentana.this, "Usuario válido");
			} else {
				JOptionPane.showMessageDialog(MiVentana.this, "Usuario incorrecto");
			}
		};
		// ASOCIAR BOTÓN CON OBJETO QUE IMPLEMENTA INTERFAZ
		btnEntrar.addActionListener(listener);
	}
}
