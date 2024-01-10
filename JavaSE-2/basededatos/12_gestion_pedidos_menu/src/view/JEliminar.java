package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import service.EmpleadoService;

public class JEliminar extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtEmail;

	
	/**
	 * Create the frame.
	 */
	public JEliminar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(75, 56, 103, 14);
		contentPane.add(lblNewLabel);
		
		jtEmail = new JTextField();
		jtEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				jtEmail.selectAll();
			}
		});
		jtEmail.setBounds(176, 55, 86, 20);
		contentPane.add(jtEmail);
		jtEmail.setColumns(10);
		
		JButton jbEliminar = new JButton("Eliminar");
		jbEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				var service=new EmpleadoService();
				service.eliminarEmpleado(jtEmail.getText());
				
				jtEmail.requestFocus(); //manda foco al control
			}
		});
		jbEliminar.setBounds(121, 149, 89, 23);
		contentPane.add(jbEliminar);
		this.setVisible(true);
	}

}
