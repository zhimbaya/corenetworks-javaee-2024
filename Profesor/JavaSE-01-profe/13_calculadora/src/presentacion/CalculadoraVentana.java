package presentacion;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import service.Calculadora;

public class CalculadoraVentana extends JFrame{
	public CalculadoraVentana(String titulo) {
		super(titulo);
		//cambiar comportamiento botón de cierre
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		//establecer tamaño y posición y hacerla visible
		setBounds(100, 50, 600, 400);
		getContentPane().setBackground(Color.YELLOW);
		inicializarComponentes();
		setVisible(true);
	}
	//incluir un constructor que permita establecer título
	//posición y tamaño de la ventana
	public CalculadoraVentana(String titulo, int x, int y, int w, int h) {
		super(titulo);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(x,y,w,h);
		inicializarComponentes();
		setVisible(true);
	}
	
	
	void inicializarComponentes() {
		setLayout(null);
		JLabel lbl1=new JLabel("Número1: ");
		JLabel lbl2=new JLabel("Número2: ");
		JTextField txt1=new JTextField();
		JTextField txt2=new JTextField();
		JButton btnSumar=new JButton("Sumar");
		JButton btnRestar=new JButton("Restar");
		JButton btnMultiplicar=new JButton("Multiplicar");
		JButton btnDividir=new JButton("Dividir");
		/////////////////////////
		lbl1.setBounds(140, 50, 120, 40);
		lbl2.setBounds(140, 120, 120, 40);
		txt1.setBounds(250, 50, 120, 40);
		txt2.setBounds(250, 120, 120, 40);
		btnSumar.setBounds(150, 180, 150, 30);
		btnRestar.setBounds(350, 180, 150, 30);
		btnMultiplicar.setBounds(150, 250, 150, 30);
		btnDividir.setBounds(350, 250, 150, 30);
		///////////////////////////
		add(lbl1);add(lbl2);
		add(txt1);add(txt2);
		add(btnSumar);add(btnRestar);
		add(btnMultiplicar);
		add(btnDividir);
		//crear clases de gestión de eventos
		//Mediante clase anónima definimos la clase (sin nombre) y creamos un objeto de la misma
		/*ActionListener listener=new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(txtUsuario.getText().equals("admin")&&txtPassword.getText().equals("pwd")) {
					JOptionPane.showMessageDialog(MiVentana.this, "Usuario válido");
				}else {
					JOptionPane.showMessageDialog(MiVentana.this, "Usuario incorrecto");
				}
				
			}
		};*/
		
				
		//Asociar botón con objeto que implementa interfaz
		btnSumar.addActionListener(a->{
			JOptionPane.showMessageDialog(CalculadoraVentana.this, "La suma es: "+
					new Calculadora(Integer.parseInt(txt1.getText()),Integer.parseInt(txt2.getText()))
					.sumar());
		});
		btnMultiplicar.addActionListener(a->{
			JOptionPane.showMessageDialog(CalculadoraVentana.this, "La multiplicación es: "+
					new Calculadora(Integer.parseInt(txt1.getText()),Integer.parseInt(txt2.getText()))
					.multiplicar());
		});
		btnRestar.addActionListener(a->{
			JOptionPane.showMessageDialog(CalculadoraVentana.this, "La resta es: "+
					new Calculadora(Integer.parseInt(txt1.getText()),Integer.parseInt(txt2.getText()))
					.restar());
		});
		btnDividir.addActionListener(a->{
			JOptionPane.showMessageDialog(CalculadoraVentana.this, "La división  es: "+
					new Calculadora(Integer.parseInt(txt1.getText()),Integer.parseInt(txt2.getText()))
					.dividir());
		});
	}
}
