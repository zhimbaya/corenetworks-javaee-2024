package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;

import service.EmpleadosService;
import view.adapters.ComboBoxEmpleadosModel;
import view.adapters.TablaEmpleadosModel;
import java.awt.event.ItemEvent;

public class JEmpleados extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox comboBox;
	 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JEmpleados frame = new JEmpleados();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JEmpleados() {
		EmpleadosService service = new EmpleadosService();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();			
		scrollPane.setBounds(25, 137, 371, 84);
		contentPane.add(scrollPane);
		
		JTable tbEmpleados = new JTable();
		tbEmpleados.setModel(new TablaEmpleadosModel());
		scrollPane.setViewportView(tbEmpleados);
		
		JLabel lblNewLabel = new JLabel("Seleccione departamento");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(130, 21, 175, 14);
		contentPane.add(lblNewLabel);
		
		comboBox = new JComboBox();
		
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if(comboBox.getSelectedIndex()==0) {
					tbEmpleados.setModel(new TablaEmpleadosModel());
				}else {
					tbEmpleados.setModel(new TablaEmpleadosModel(comboBox.getSelectedItem().toString()));
				}
				
			}
		});
	
		
		comboBox.setBounds(116, 57, 200, 22);
		contentPane.add(comboBox);
		comboBox.setModel(new ComboBoxEmpleadosModel());
		
		
	}
}
