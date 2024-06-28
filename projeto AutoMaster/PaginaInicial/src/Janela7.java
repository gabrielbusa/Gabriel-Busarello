import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela7 extends JFrame {
    public Janela7() {
        setTitle("Janela 7");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null); // Usando layout nulo para posicionamento absoluto

        JLabel label = new JLabel("Conteúdo da Janela 1");
        label.setBounds(50, 50, 200, 30);
        getContentPane().add(label);
    }
}
