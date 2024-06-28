import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JToolBar;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JToggleButton;
import java.awt.Color;

public class Menuestoque extends JInternalFrame {
	private static final String Downloads = null;
	/**
	 * @wbp.nonvisual location=-59,139
	 */
	private final JDesktopPane Painel_1 = new JDesktopPane();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main11(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menuestoque frame = new Menuestoque();
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
	public Menuestoque() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JMenuBar menuBar_2 = new JMenuBar();
		menuBar_2.setBounds(10, 11, 769, 22);
		Painel_1.add(menuBar_2);
		setBounds(100, 100, 841, 485);
		getContentPane().setLayout(null);
		
		JPopupMenu popupMenu = new JPopupMenu();
		popupMenu.setSize(450, 16);
		popupMenu.setLocation(0, 0);
		addPopup(getContentPane(), popupMenu);
		
		JDesktopPane Painel = new JDesktopPane();
		Painel.setBackground(new Color(255, 165, 121));
		Painel.setBounds(0, -7, 847, 84);
		getContentPane().add(Painel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 11, 769, 22);
		Painel.add(menuBar);
		setJMenuBar(menuBar);
		
		JLabel lblNewLabel = new JLabel("Estoque Menu");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(29, 26, 134, 31);
		Painel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Estoque para Compra");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(33, 116, 166, 14);
		getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(33, 137, 166, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(33, 206, 166, 20);
		getContentPane().add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Unidade de Estoque");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(33, 185, 166, 14);
		getContentPane().add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(33, 346, 166, 20);
		getContentPane().add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Prateleira");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1.setBounds(33, 325, 166, 14);
		getContentPane().add(lblNewLabel_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(33, 277, 166, 20);
		getContentPane().add(textField_3);
		
		JLabel lblNewLabel_1_2 = new JLabel("Numero de Série");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(33, 256, 166, 14);
		getContentPane().add(lblNewLabel_1_2);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(313, 137, 166, 20);
		getContentPane().add(textField_4);
		
		JLabel lblNewLabel_1_3 = new JLabel("Peso (KG)");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(313, 116, 166, 14);
		getContentPane().add(lblNewLabel_1_3);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(313, 206, 166, 20);
		getContentPane().add(textField_5);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("TamanhoDimensões");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_2.setBounds(313, 185, 166, 14);
		getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Estoque de Risco");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2_1.setBounds(313, 256, 166, 14);
		getContentPane().add(lblNewLabel_1_2_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(313, 277, 166, 20);
		getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(313, 346, 166, 20);
		getContentPane().add(textField_7);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Grade");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1.setBounds(313, 325, 166, 14);
		getContentPane().add(lblNewLabel_1_1_1_1);
		
		JList list = new JList();
		list.setBounds(607, 310, 35, -70);
		getContentPane().add(list);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("");
		tglbtnNewToggleButton.setBounds(554, 134, 25, 23);
		getContentPane().add(tglbtnNewToggleButton);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Não emitir alertas e permitir vendas ");
		lblNewLabel_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3_1.setBounds(589, 137, 210, 14);
		getContentPane().add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_1_3_1_1 = new JLabel("com estoque negativo");
		lblNewLabel_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3_1_1.setBounds(589, 155, 210, 14);
		getContentPane().add(lblNewLabel_1_3_1_1);
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("");
		tglbtnNewToggleButton_1.setBounds(554, 205, 25, 23);
		getContentPane().add(tglbtnNewToggleButton_1);
		
		JLabel lblNewLabel_1_3_1_2 = new JLabel("Cada unidade do produto possui um");
		lblNewLabel_1_3_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3_1_2.setBounds(589, 208, 210, 14);
		getContentPane().add(lblNewLabel_1_3_1_2);
		
		JLabel lblNewLabel_1_3_1_1_1 = new JLabel("número de série");
		lblNewLabel_1_3_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3_1_1_1.setBounds(589, 226, 210, 14);
		getContentPane().add(lblNewLabel_1_3_1_1_1);
		
		JToggleButton tglbtnNewToggleButton_1_1 = new JToggleButton("");
		tglbtnNewToggleButton_1_1.setBounds(554, 277, 25, 23);
		getContentPane().add(tglbtnNewToggleButton_1_1);
		
		JLabel lblNewLabel_1_3_1_2_1 = new JLabel("Produto Controlado por Lote");
		lblNewLabel_1_3_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3_1_2_1.setBounds(589, 280, 210, 14);
		getContentPane().add(lblNewLabel_1_3_1_2_1);
		
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

	public static void main1(String[] args) {
		Downloads
	}

	public static void main(String[] args) {
		Downloads
	}
}
