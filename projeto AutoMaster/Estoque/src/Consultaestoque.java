import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Color;

public class Consultaestoque {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;
	private JTextField textField_31;
	private JTextField textField_32;
	private JTextField textField_33;
	private JTextField textField_34;
	private JTextField textField_35;
	private JTextField textField_36;
	private JTextField textField_37;
	private JTextField textField_38;
	private JTextField textField_39;
	private JTable table;
	private JLabel lblProduto_1;
	private JLabel lblProduto_2;
	private JLabel lblProduto_3;
	private JLabel lblProduto_4;
	private JLabel lblProduto_5;
	private JTextField textField_40;
	private JLabel lblBuscaRapida;
	private JTextField textField_41;
	private JTextField textField_42;
	private JTextField textField_43;
	private JTextField textField_44;
	private JTextField textField_46;
	private JTextField textField_47;
	private JTextField textField_48;
	private JTextField textField_45;
	private JTextField textField_49;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consultaestoque window = new Consultaestoque();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Consultaestoque() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 645, 460);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblBuscaRapida = new JLabel("Busca rapida de produto:");
		lblBuscaRapida.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblBuscaRapida.setBounds(9, 48, 203, 26);
		frame.getContentPane().add(lblBuscaRapida);
		
		lblProduto_5 = new JLabel("Estoque Final");
		lblProduto_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblProduto_5.setBounds(477, 144, 112, 31);
		frame.getContentPane().add(lblProduto_5);
		
		lblProduto_4 = new JLabel("Saidas");
		lblProduto_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblProduto_4.setBounds(393, 144, 78, 31);
		frame.getContentPane().add(lblProduto_4);
		
		lblProduto_2 = new JLabel("Entradas");
		lblProduto_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblProduto_2.setBounds(293, 144, 84, 31);
		frame.getContentPane().add(lblProduto_2);
		
		lblProduto_1 = new JLabel("Estoque inicial");
		lblProduto_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblProduto_1.setBounds(163, 144, 112, 31);
		frame.getContentPane().add(lblProduto_1);
		
		JLabel lblProduto = new JLabel("Produto");
		lblProduto.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblProduto.setBounds(67, 144, 84, 31);
		frame.getContentPane().add(lblProduto);
		
		JDesktopPane Painel = new JDesktopPane();
		Painel.setBackground(new Color(255, 165, 121));
		Painel.setBounds(-11, -48, 847, 94);
		frame.getContentPane().add(Painel);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(20, 22, 769, 0);
		Painel.add(menuBar);
		
		JLabel lblNewLabel = new JLabel("CONTROLE DE ESTOQUE");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(30, 56, 261, 31);
		Painel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 157, 111));
		textField.setForeground(new Color(255, 128, 64));
		textField.setColumns(10);
		textField.setBounds(42, 141, 116, 36);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 157, 111));
		textField_1.setForeground(new Color(255, 128, 64));
		textField_1.setColumns(10);
		textField_1.setBounds(159, 141, 116, 36);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBackground(new Color(255, 157, 111));
		textField_2.setForeground(new Color(255, 128, 64));
		textField_2.setColumns(10);
		textField_2.setBounds(276, 141, 103, 36);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setBackground(new Color(255, 157, 111));
		textField_3.setForeground(new Color(255, 128, 64));
		textField_3.setColumns(10);
		textField_3.setBounds(380, 141, 91, 36);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setBackground(new Color(255, 157, 111));
		textField_4.setForeground(new Color(255, 128, 64));
		textField_4.setColumns(10);
		textField_4.setBounds(473, 141, 116, 36);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(473, 177, 116, 27);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(380, 177, 91, 27);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(276, 177, 103, 27);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(159, 177, 116, 27);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(42, 177, 116, 27);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(42, 205, 116, 27);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(42, 232, 116, 27);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(159, 232, 116, 27);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(159, 205, 116, 27);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(276, 205, 103, 27);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(276, 232, 103, 27);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(380, 205, 91, 27);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(473, 205, 116, 27);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(473, 232, 116, 27);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(380, 232, 91, 27);
		frame.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(473, 342, 116, 27);
		frame.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setColumns(10);
		textField_21.setBounds(473, 315, 116, 27);
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setColumns(10);
		textField_22.setBounds(473, 287, 116, 27);
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setColumns(10);
		textField_23.setBounds(473, 260, 116, 27);
		frame.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setColumns(10);
		textField_24.setBounds(380, 260, 91, 27);
		frame.getContentPane().add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setColumns(10);
		textField_25.setBounds(380, 287, 91, 27);
		frame.getContentPane().add(textField_25);
		
		textField_26 = new JTextField();
		textField_26.setColumns(10);
		textField_26.setBounds(380, 315, 91, 27);
		frame.getContentPane().add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setColumns(10);
		textField_27.setBounds(380, 342, 91, 27);
		frame.getContentPane().add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setColumns(10);
		textField_28.setBounds(276, 342, 103, 27);
		frame.getContentPane().add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setColumns(10);
		textField_29.setBounds(276, 315, 103, 27);
		frame.getContentPane().add(textField_29);
		
		textField_30 = new JTextField();
		textField_30.setColumns(10);
		textField_30.setBounds(276, 287, 103, 27);
		frame.getContentPane().add(textField_30);
		
		textField_31 = new JTextField();
		textField_31.setColumns(10);
		textField_31.setBounds(276, 260, 103, 27);
		frame.getContentPane().add(textField_31);
		
		textField_32 = new JTextField();
		textField_32.setColumns(10);
		textField_32.setBounds(159, 260, 116, 27);
		frame.getContentPane().add(textField_32);
		
		textField_33 = new JTextField();
		textField_33.setColumns(10);
		textField_33.setBounds(159, 287, 116, 27);
		frame.getContentPane().add(textField_33);
		
		textField_34 = new JTextField();
		textField_34.setColumns(10);
		textField_34.setBounds(159, 315, 116, 27);
		frame.getContentPane().add(textField_34);
		
		textField_35 = new JTextField();
		textField_35.setColumns(10);
		textField_35.setBounds(159, 342, 116, 27);
		frame.getContentPane().add(textField_35);
		
		textField_36 = new JTextField();
		textField_36.setColumns(10);
		textField_36.setBounds(42, 260, 116, 27);
		frame.getContentPane().add(textField_36);
		
		textField_37 = new JTextField();
		textField_37.setColumns(10);
		textField_37.setBounds(42, 287, 116, 27);
		frame.getContentPane().add(textField_37);
		
		textField_38 = new JTextField();
		textField_38.setColumns(10);
		textField_38.setBounds(42, 315, 116, 27);
		frame.getContentPane().add(textField_38);
		
		textField_39 = new JTextField();
		textField_39.setColumns(10);
		textField_39.setBounds(42, 342, 116, 27);
		frame.getContentPane().add(textField_39);
		
		table = new JTable();
		table.setBounds(35, 130, 154, 0);
		frame.getContentPane().add(table);
		
		lblProduto_3 = new JLabel("Entradas");
		lblProduto_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblProduto_3.setBounds(381, 144, 112, 31);
		frame.getContentPane().add(lblProduto_3);
		
		textField_40 = new JTextField();
		textField_40.setBackground(new Color(255, 181, 145));
		textField_40.setColumns(10);
		textField_40.setBounds(-2, 44, 259, 31);
		frame.getContentPane().add(textField_40);
		
		textField_41 = new JTextField();
		textField_41.setColumns(10);
		textField_41.setBounds(0, 144, 28, 27);
		frame.getContentPane().add(textField_41);
		
		textField_42 = new JTextField();
		textField_42.setColumns(10);
		textField_42.setBounds(0, 169, 28, 27);
		frame.getContentPane().add(textField_42);
		
		textField_43 = new JTextField();
		textField_43.setColumns(10);
		textField_43.setBounds(0, 219, 28, 27);
		frame.getContentPane().add(textField_43);
		
		textField_44 = new JTextField();
		textField_44.setColumns(10);
		textField_44.setBounds(0, 194, 28, 27);
		frame.getContentPane().add(textField_44);
		
		textField_46 = new JTextField();
		textField_46.setColumns(10);
		textField_46.setBounds(0, 246, 28, 27);
		frame.getContentPane().add(textField_46);
		
		textField_47 = new JTextField();
		textField_47.setColumns(10);
		textField_47.setBounds(0, 271, 28, 27);
		frame.getContentPane().add(textField_47);
		
		textField_48 = new JTextField();
		textField_48.setColumns(10);
		textField_48.setBounds(0, 296, 28, 27);
		frame.getContentPane().add(textField_48);
		
		textField_45 = new JTextField();
		textField_45.setColumns(10);
		textField_45.setBounds(0, 349, 28, 27);
		frame.getContentPane().add(textField_45);
		
		textField_49 = new JTextField();
		textField_49.setColumns(10);
		textField_49.setBounds(0, 322, 28, 27);
		frame.getContentPane().add(textField_49);
	}
}
