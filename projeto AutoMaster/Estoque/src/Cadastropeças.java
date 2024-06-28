import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.TextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cadastropeças extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cadastropeças frame = new Cadastropeças();
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
	public Cadastropeças() {
		getContentPane().setBackground(new Color(255, 165, 121));
		setBounds(100, 100, 700, 296);
		getContentPane().setLayout(null);
		
		JMenuBar menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(0, -22, 769, 22);
		getContentPane().add(menuBar_1);
		setJMenuBar(menuBar_1);
		
		JLabel lblNewLabel = new JLabel("CADASTRO DE PEÇA");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(219, 24, 189, 25);
		getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(59, 85, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCod = new JLabel("Cod:");
		lblCod.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCod.setBounds(25, 82, 160, 25);
		getContentPane().add(lblCod);
		
		JLabel lblCod_1 = new JLabel("Produto:");
		lblCod_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCod_1.setBounds(166, 83, 49, 25);
		getContentPane().add(lblCod_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(224, 87, 189, 20);
		getContentPane().add(textField_1);
		
		JLabel lblCod_1_1 = new JLabel("Quantidade:");
		lblCod_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCod_1_1.setBounds(431, 83, 71, 25);
		getContentPane().add(lblCod_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(505, 85, 86, 20);
		getContentPane().add(textField_2);
		
		JLabel lblCod_1_1_1 = new JLabel("Preço de Compra");
		lblCod_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCod_1_1_1.setBounds(25, 136, 120, 25);
		getContentPane().add(lblCod_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(141, 139, 86, 20);
		getContentPane().add(textField_3);
		
		JLabel lblCod_1_1_1_1 = new JLabel("Preço de Venda");
		lblCod_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCod_1_1_1_1.setBounds(255, 136, 120, 25);
		getContentPane().add(lblCod_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(365, 139, 86, 20);
		getContentPane().add(textField_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(561, 138, 86, 22);
		getContentPane().add(comboBox);
		
		JLabel lblCod_1_1_1_1_1 = new JLabel("Fornecedor");
		lblCod_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCod_1_1_1_1_1.setBounds(468, 136, 120, 25);
		getContentPane().add(lblCod_1_1_1_1_1);

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
