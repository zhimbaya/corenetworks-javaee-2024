package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.Empleado;
import service.EmpleadoService;

public class JNuevo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtNombre;
	private JTextField jtEmail;
	private JTextField jtDept;
	private JTextField jtSalario;

	
	/**
	 * Create the frame.
	 */
	public JNuevo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(75, 56, 103, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblFechaEnvo = new JLabel("Email");
		lblFechaEnvo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFechaEnvo.setBounds(75, 97, 103, 14);
		contentPane.add(lblFechaEnvo);
		
		JLabel lblPrecio = new JLabel("Dept");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPrecio.setBounds(75, 144, 103, 14);
		contentPane.add(lblPrecio);
		
		jtNombre = new JTextField();
		jtNombre.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				jtNombre.selectAll();
			}
		});
		jtNombre.setBounds(176, 55, 86, 20);
		contentPane.add(jtNombre);
		jtNombre.setColumns(10);
		
		jtEmail = new JTextField();
		jtEmail.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				jtEmail.selectAll();
			}
		});
		jtEmail.setColumns(10);
		jtEmail.setBounds(176, 96, 86, 20);
		contentPane.add(jtEmail);
		
		jtDept = new JTextField();
		jtDept.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				jtDept.selectAll();
			}
		});
		jtDept.setColumns(10);
		jtDept.setBounds(176, 143, 86, 20);
		contentPane.add(jtDept);
		
		JButton jbGuardar = new JButton("Guardar");
		jbGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				var service=new EmpleadoService();
			    service.altaEmpleado(new Empleado(jtNombre.getText(),jtEmail.getText(), jtDept.getText(),Double.parseDouble(jtSalario.getText())));					
				jtNombre.requestFocus(); //manda foco al control
			}
		});
		jbGuardar.setBounds(128, 231, 89, 23);
		contentPane.add(jbGuardar);
		
		JLabel lblSalario = new JLabel("Salario");
		lblSalario.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSalario.setBounds(75, 180, 103, 14);
		contentPane.add(lblSalario);
		
		jtSalario = new JTextField();
		jtSalario.setColumns(10);
		jtSalario.setBounds(176, 179, 86, 20);
		contentPane.add(jtSalario);
		this.setVisible(true);
	}
}
