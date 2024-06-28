import javax.swing.JFrame;
import javax.swing.JLabel;

public class Janela4 extends JFrame {
    public Janela4() {
        setTitle("Janela 4");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null); // Usando layout nulo para posicionamento absoluto

        JLabel label = new JLabel("Conteúdo da Janela 1");
        label.setBounds(50, 50, 200, 30);
        getContentPane().add(label);
    }
}

