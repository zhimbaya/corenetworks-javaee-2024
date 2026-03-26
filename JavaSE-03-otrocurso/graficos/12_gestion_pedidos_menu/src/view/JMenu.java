package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import model.Pedido;
import service.PedidosService;
import view.adapters.ListaPedidosModel;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JMenu extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JMenu frame = new JMenu();
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
	public JMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton jbSalir = new JButton("Salir");
		jbSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JMenu.this.dispose();
			}
		});
		jbSalir.setBounds(71, 261, 89, 23);
		contentPane.add(jbSalir);
		
		JLabel lblNewLabel = new JLabel("Pedidos");
		lblNewLabel.setBounds(156, 60, 46, 14);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(156, 81, 129, 93);
		contentPane.add(scrollPane);
		JList<Pedido> lstPedidos = new JList<>();
		scrollPane.setViewportView(lstPedidos);
		lstPedidos.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				Pedido pedido=lstPedidos.getSelectedValue();
				JOptionPane.showMessageDialog(JMenu.this, "Pedido seleccionado: "+pedido.getProducto()+
						" - "+pedido.getFechaPedido()+" - "+pedido.getPrecio());
			}
		});
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Pedido pedido=lstPedidos.getSelectedValue();
				PedidosService service=new PedidosService();
				service.eliminarPedido(pedido);
				//para actualizar la lista
				lstPedidos.setModel(new ListaPedidosModel());
			}
		});
		btnEliminar.setBounds(211, 261, 89, 23);
		contentPane.add(btnEliminar);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 172, 22);
		contentPane.add(menuBar);
		
		javax.swing.JMenu mnNewMenu = new javax.swing.JMenu("Pedidos");
		menuBar.add(mnNewMenu);
		
		JMenuItem menuNuevo = new JMenuItem("Nuevo");
		menuNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new JNuevo();		
			}
		});
		mnNewMenu.add(menuNuevo);
		
		JMenuItem menuReciente = new JMenuItem("Reciente");
		menuReciente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new JReciente();
			}
		});
		mnNewMenu.add(menuReciente);
		
		JMenuItem menuTodos = new JMenuItem("Mostrar todos");
		menuTodos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//instanciamos modelo de datos y se lo asignamos al JList
				ListaPedidosModel model=new ListaPedidosModel();
				lstPedidos.setModel(model);
			}
		});
		mnNewMenu.add(menuTodos);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
