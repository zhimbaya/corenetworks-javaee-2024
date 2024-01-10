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
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 172, 22);
		contentPane.add(menuBar);
		
		javax.swing.JMenu mnNewMenu = new javax.swing.JMenu("Acciones");
		menuBar.add(mnNewMenu);
		
		JMenuItem menuNuevo = new JMenuItem("Nuevo");
		menuNuevo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new JNuevo();		
			}
		});
		mnNewMenu.add(menuNuevo);
		
		JMenuItem menuModify = new JMenuItem("Modify salario");
		menuModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new JModify();
			}
		});
		mnNewMenu.add(menuModify);
		
		JMenuItem menuEliminar = new JMenuItem("Eliminar");
		menuEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//instanciamos modelo de datos y se lo asignamos al JList
				//ListaPedidosModel model=new ListaPedidosModel();
				//lstPedidos.setModel(model);
			}
		});
		mnNewMenu.add(menuEliminar);
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
