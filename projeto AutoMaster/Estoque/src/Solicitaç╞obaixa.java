import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Solicitaçãobaixa extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Solicitaçãobaixa frame = new Solicitaçãobaixa();
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
	public Solicitaçãobaixa() {
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
		
		JMenu mnNewMenu = new JMenu("CADASTRO PEÇAS");
		mnNewMenu.setBounds(0, 0, 192, 26);
		getContentPane().add(mnNewMenu);
		
		JMenu mnConsultaDeEstoque = new JMenu("CONSULTA DE ESTOQUE");
		mnConsultaDeEstoque.setBounds(360, 0, 192, 26);
		getContentPane().add(mnConsultaDeEstoque);
		
		JMenu mnConsultaDeEstoque_1 = new JMenu("CONSULTA DE ESTOQUE");
		mnConsultaDeEstoque_1.setBounds(539, 0, 192, 26);
		getContentPane().add(mnConsultaDeEstoque_1);
		
		JMenu mnConsultaDeEstoque_1_1 = new JMenu("CRIAÇÃO PEDIDOS COMPRA");
		mnConsultaDeEstoque_1_1.setBounds(170, 37, 290, 26);
		getContentPane().add(mnConsultaDeEstoque_1_1);
		
		JMenu mnConsultaDeEstoque_1_1_1 = new JMenu("SOLICITAÇÃO BAIXA ESTOQUE");
		mnConsultaDeEstoque_1_1_1.setBounds(138, 0, 257, 26);
		getContentPane().add(mnConsultaDeEstoque_1_1_1);
		
		JMenu mnConsultaDeEstoque_1_1_2 = new JMenu("ABERTURA ORDEM SERVIÇO");
		mnConsultaDeEstoque_1_1_2.setBounds(-12, 39, 187, 26);
		getContentPane().add(mnConsultaDeEstoque_1_1_2);
		
		JMenu mnConsultaDeEstoque_1_1_3 = new JMenu("CONTROLE FATURAMENTO");
		mnConsultaDeEstoque_1_1_3.setBounds(549, 33, 197, 32);
		getContentPane().add(mnConsultaDeEstoque_1_1_3);
		
		JMenu mnCadastroDeClientes = new JMenu("CADASTRO DE CLIENTES");
		mnCadastroDeClientes.setBounds(370, 37, 192, 26);
		getContentPane().add(mnCadastroDeClientes);
		
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
