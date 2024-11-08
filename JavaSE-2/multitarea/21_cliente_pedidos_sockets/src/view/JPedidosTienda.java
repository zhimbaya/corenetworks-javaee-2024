package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import view.adapters.TablaPedidosModel;
import java.awt.Color;

public class JPedidosTienda extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTienda;
	private JButton btnPedidos;
	private JTable tbPedidos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPedidosTienda frame = new JPedidosTienda();
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
	public JPedidosTienda() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Introduce nombre de tienda:");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBackground(new Color(255, 0, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(116, 30, 206, 14);
		contentPane.add(lblNewLabel);
		
		txtTienda = new JTextField();
		txtTienda.setBounds(136, 59, 161, 20);
		contentPane.add(txtTienda);
		txtTienda.setColumns(10);
		
		btnPedidos = new JButton("Ver pedidos");
		btnPedidos.setBackground(new Color(255, 0, 255));
		btnPedidos.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPedidos.setForeground(new Color(0, 0, 0));
		btnPedidos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tbPedidos.setModel(new TablaPedidosModel(txtTienda.getText()));
			}
		});
		btnPedidos.setBounds(146, 90, 142, 23);
		contentPane.add(btnPedidos);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(73, 146, 285, 104);
		contentPane.add(scrollPane);
		
		tbPedidos = new JTable();
		scrollPane.setViewportView(tbPedidos);
	}
}
