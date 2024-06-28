import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class PaginaInicial extends JFrame {
    public PaginaInicial() {
        setTitle("Pagina Inicial");
        setSize(598, 415);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null); // Usando layout nulo para posicionamento absoluto

        // Array de textos e janelas correspondentes
        String[] textos = {"Cadastro de Clientes", "Criação de Pedidos", "Link 3", "Link 4", "Link 5", "Link 6", "Link 7"};
        Class<?>[] janelas = {Janela1.class, Janela2.class, Janela3.class, Janela4.class, Janela5.class, Janela6.class, Janela7.class};

        JLabel lblNewLabel = new JLabel("AutoMaster");
        lblNewLabel.setForeground(new Color(0, 0, 128));
        lblNewLabel.setBackground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(10, 23, 562, 43);
        getContentPane().add(lblNewLabel);
        
        
        // Ajustando a posição inicial dos JLabels para mais abaixo e mais à direita
        int initialXPosition = 75; // Posição inicial X dos JLabels
        int initialYPosition = 100; // Posição inicial Y dos JLabels
        int yOffset = 30; // Espaçamento vertical entre os JLabels

        // Adicionando os JLabels
        for (int i = 0; i < textos.length; i++) {
            JLabel label = new JLabel(textos[i]);
            // Ajustando a largura conforme o tamanho do texto
            int labelWidth = textos[i].length() * 10; // Ajuste conforme necessário
            label.setBounds(initialXPosition, initialYPosition + (i * yOffset), labelWidth, 20); // Posicionando os JLabels
            label.setCursor(new Cursor(Cursor.HAND_CURSOR));
            int index = i; // Índice para usar dentro do listener
            label.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    try {
                        JFrame janela = (JFrame) janelas[index].getDeclaredConstructor().newInstance();
                        janela.setVisible(true);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            });
            getContentPane().add(label);
        }
    }

    public static void main(String[] args) {
        PaginaInicial frame = new PaginaInicial();
        frame.setVisible(true);
    }
}

