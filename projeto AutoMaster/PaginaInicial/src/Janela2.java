import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela2 extends JFrame {
	private JTextField NomeSolic;
	private JTextField tel;
	private JTextField email;
	private JTextField datahora;
	private JTextField IdPed;
	private JTextField DescPed;
    public Janela2() {
        setTitle("Janela 2");
        setSize(680, 415);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        
        JLabel lblCriaoDePedido = new JLabel("Criação de Pedido");
        lblCriaoDePedido.setHorizontalAlignment(SwingConstants.CENTER);
        lblCriaoDePedido.setForeground(Color.BLACK);
        lblCriaoDePedido.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblCriaoDePedido.setBackground(Color.BLACK);
        lblCriaoDePedido.setBounds(10, 22, 644, 28);
        getContentPane().add(lblCriaoDePedido);
        
        JLabel lblNewLabel_1 = new JLabel("Nome do Solicitante:");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1.setBounds(23, 81, 143, 22);
        getContentPane().add(lblNewLabel_1);
        
        NomeSolic = new JTextField();
        NomeSolic.setColumns(10);
        NomeSolic.setBounds(165, 84, 191, 20);
        getContentPane().add(NomeSolic);
        
        JLabel lblNewLabel_1_2 = new JLabel("Telefone:");
        lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1_2.setBounds(380, 81, 62, 22);
        getContentPane().add(lblNewLabel_1_2);
        
        tel = new JTextField();
        tel.setColumns(10);
        tel.setBounds(447, 84, 191, 20);
        getContentPane().add(tel);
        
        JLabel lblNewLabel_1_1 = new JLabel("E-mail:");
        lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1_1.setBounds(23, 126, 143, 22);
        getContentPane().add(lblNewLabel_1_1);
        
        email = new JTextField();
        email.setColumns(10);
        email.setBounds(72, 129, 284, 20);
        getContentPane().add(email);
        
        JLabel lblNewLabel_1_3_2 = new JLabel("Data e Hora do pedido:");
        lblNewLabel_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1_3_2.setBounds(23, 170, 161, 22);
        getContentPane().add(lblNewLabel_1_3_2);
        
        datahora = new JTextField();
        datahora.setColumns(10);
        datahora.setBounds(182, 173, 174, 20);
        getContentPane().add(datahora);
        
        JLabel lblNewLabel_1_2_1 = new JLabel("Id do Pedido:");
        lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1_2_1.setBounds(380, 126, 143, 22);
        getContentPane().add(lblNewLabel_1_2_1);
        
        IdPed = new JTextField();
        IdPed.setColumns(10);
        IdPed.setBounds(471, 129, 167, 20);
        getContentPane().add(IdPed);
        
        JLabel lblNewLabel_1_3_2_1 = new JLabel("Descrição do Pedido:");
        lblNewLabel_1_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        lblNewLabel_1_3_2_1.setBounds(23, 219, 161, 22);
        getContentPane().add(lblNewLabel_1_3_2_1);
        
        DescPed = new JTextField();
        DescPed.setColumns(10);
        DescPed.setBounds(23, 243, 619, 88);
        getContentPane().add(DescPed);
        
        JButton btnNewButton = new JButton("Cadastrar");
        btnNewButton.setBounds(534, 342, 107, 23);
        getContentPane().add(btnNewButton);
        
        JButton btnVoltar = new JButton("Voltar");
        btnVoltar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        	}
        });
        btnVoltar.setBounds(418, 342, 107, 23);
        getContentPane().add(btnVoltar);
        
        NomeSolic.requestFocus();
        
        NomeSolic.setText("");
        email.setText("");
        datahora.setText("");
        tel.setText("");
        IdPed.setText("");
        DescPed.setText("");
        
        
    }
}
