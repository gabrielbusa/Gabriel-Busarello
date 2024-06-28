import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela3 extends JFrame {
    public Janela3() {
        setTitle("Janela 3");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null); // Usando layout nulo para posicionamento absoluto

        JLabel label = new JLabel("Conteúdo da Janela 1");
        label.setBounds(50, 50, 200, 30);
        getContentPane().add(label);
    }
}
