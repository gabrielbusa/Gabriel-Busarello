import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;

public class ordemserviço extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel;
	private JTextField textField_4;
	private JLabel lblNewLabel_2;
	private JTextField textField_6;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField textField_9;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel lblNewLabel_6;
	private JTextField textField_10;
	private JTextField textField_12;
	private JLabel lblNewLabel_7;
	private JTextField textField_11;
	private JTextField textField_13;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JLabel lblNewLabel_10;
	private JTextField textField_17;
	public ordemserviço() {
		getContentPane().setLayout(null);
		
		lblNewLabel_10 = new JLabel("Data do Pedido");
		lblNewLabel_10.setBackground(new Color(255, 162, 117));
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_10.setBounds(32, 319, 139, 22);
		getContentPane().add(lblNewLabel_10);
		
		lblNewLabel_9 = new JLabel("Localização");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_9.setBounds(391, 245, 139, 22);
		getContentPane().add(lblNewLabel_9);
		
		lblNewLabel_8 = new JLabel("Endereço de");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_8.setBounds(391, 226, 139, 22);
		getContentPane().add(lblNewLabel_8);
		
		lblNewLabel_7 = new JLabel("Numero do Pedido");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_7.setBounds(391, 193, 139, 22);
		getContentPane().add(lblNewLabel_7);
		
		lblNewLabel_4 = new JLabel("Telefone");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(32, 226, 90, 22);
		getContentPane().add(lblNewLabel_4);
		
		lblNewLabel_2 = new JLabel("Nome do Solicitante");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(32, 193, 139, 22);
		getContentPane().add(lblNewLabel_2);
		
		lblNewLabel = new JLabel("Tipo de Propriedade");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(32, 137, 139, 22);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo de Inspeção");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(32, 104, 123, 22);
		getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(195, 100, 242, 32);
		getContentPane().add(textField_1);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 162, 117));
		textField.setColumns(10);
		textField.setBounds(27, 100, 285, 32);
		getContentPane().add(textField);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(195, 131, 242, 32);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBackground(new Color(255, 162, 117));
		textField_3.setBounds(27, 131, 285, 32);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBackground(new Color(255, 162, 117));
		textField_4.setBounds(27, 186, 172, 37);
		getContentPane().add(textField_4);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBackground(new Color(255, 162, 117));
		textField_6.setBounds(27, 221, 172, 37);
		getContentPane().add(textField_6);
		
		lblNewLabel_3 = new JLabel("Nome do Solicitante");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(32, 226, 139, 22);
		getContentPane().add(lblNewLabel_3);
		
		lblNewLabel_5 = new JLabel("Email");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_5.setBounds(32, 259, 139, 22);
		getContentPane().add(lblNewLabel_5);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBackground(new Color(255, 162, 117));
		textField_9.setBounds(27, 257, 172, 37);
		getContentPane().add(textField_9);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBackground(new Color(255, 255, 255));
		textField_5.setBounds(195, 186, 185, 37);
		getContentPane().add(textField_5);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBackground(Color.WHITE);
		textField_7.setBounds(195, 221, 185, 37);
		getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(195, 257, 185, 37);
		getContentPane().add(textField_8);
		
		lblNewLabel_6 = new JLabel("ORDEM DE SERVIÇO");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(19, 10, 223, 22);
		getContentPane().add(lblNewLabel_6);
		
		textField_10 = new JTextField();
		textField_10.setBackground(new Color(255, 155, 106));
		textField_10.setColumns(10);
		textField_10.setBounds(0, 0, 532, 47);
		getContentPane().add(textField_10);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBackground(new Color(255, 162, 117));
		textField_12.setBounds(378, 186, 172, 37);
		getContentPane().add(textField_12);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBackground(new Color(255, 162, 117));
		textField_11.setBounds(378, 221, 172, 73);
		getContentPane().add(textField_11);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBackground(Color.WHITE);
		textField_13.setBounds(549, 186, 185, 37);
		getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBackground(Color.WHITE);
		textField_14.setBounds(549, 221, 185, 37);
		getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBackground(Color.WHITE);
		textField_15.setBounds(547, 257, 187, 37);
		getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBackground(new Color(255, 162, 117));
		textField_16.setBounds(27, 314, 172, 37);
		getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBackground(Color.WHITE);
		textField_17.setBounds(191, 314, 191, 37);
		getContentPane().add(textField_17);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ordemserviço  frame = new ordemserviço ();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public void ABERTURAORDEMSERVIÇO () {
		setBounds(100, 100, 785, 565);
		getContentPane().setLayout(null);
		
		JPopupMenu popupMenu = new JPopupMenu();
		popupMenu.setSize(450, 16);
		popupMenu.setLocation(0, 0);
		addPopup(getContentPane(), popupMenu);
		
		JDesktopPane Painel = new JDesktopPane();
		Painel.setBounds(0, 69, 769, 444);
		getContentPane().add(Painel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 11, 769, 22);
		Painel.add(menuBar);
		setJMenuBar(menuBar);
		
		JMenuBar menuBar_1 = new JMenuBar();
		setJMenuBar(menuBar_1);

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
