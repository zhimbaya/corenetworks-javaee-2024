package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Empleado;
import service.EmpleadoService;

public class JModify extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtIdEmpelado;
	private JTextField txtSalary;

	

	/**
	 * Create the frame.
	 */
	public JModify() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("IdEmpleado");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(77, 48, 91, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblSalary = new JLabel("Nuevo salario");
		lblSalary.setBackground(new Color(255, 255, 128));
		lblSalary.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSalary.setBounds(77, 95, 91, 14);
		contentPane.add(lblSalary);
		
		JButton jbModificar = new JButton("Modificar");
		jbModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				var service=new EmpleadoService();	
			    service.updateSalary(Double.parseDouble(txtSalary.getText()), Integer.parseInt(txtIdEmpelado.getText()));
			    jbModificar.requestFocus(); //manda foco al control
				JModify.this.dispose();
			}
		});
		jbModificar.setBackground(new Color(255, 255, 128));
		jbModificar.setBounds(144, 174, 89, 23);
		contentPane.add(jbModificar);
		//cargar pedido más reciente al crearse la propia ventana
		var service=new EmpleadoService();
		var empleado=service.updateSalary(serialVersionUID, ABORT);
		
		txtIdEmpelado = new JTextField();
		txtIdEmpelado.setBounds(211, 47, 86, 20);
		contentPane.add(txtIdEmpelado);
		txtIdEmpelado.setColumns(10);
		
		txtSalary = new JTextField();
		txtSalary.setColumns(10);
		txtSalary.setBounds(211, 94, 86, 20);
		contentPane.add(txtSalary);
		this.setVisible(true);
	}
}
