import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela5 extends JFrame {
    public Janela5() {
        setTitle("Janela ");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null); // Usando layout nulo para posicionamento absoluto

        JLabel label = new JLabel("Conteúdo da Janela 1");
        label.setBounds(50, 50, 200, 30);
        getContentPane().add(label);
    }
}
