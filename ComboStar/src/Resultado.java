import javax.swing.*;

public class Resultado {
    private JPanel Resultado;
    private JTextArea textArea1;

    public static void main() {
        JFrame frame = new JFrame("Resultado");
        frame.setContentPane(new Resultado().Resultado);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
