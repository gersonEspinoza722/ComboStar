import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscogerCombo {
    private JTextArea textArea1;
    private JTextField codeCombo;
    private JButton aceptarButton;
    private static JFrame frame;
    public static void main(String[] args) {
        frame = new JFrame("EscogerCombo");
        frame.setContentPane(new EscogerCombo().EscogerCombo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private JButton alterarButton;
    private JPanel EscogerCombo;

    public EscogerCombo() {
        alterarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x= codeCombo.getText();
                int code=Integer.parseInt(x);
                ConstruirCombo.main(code);
            }
        });
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Resultado.main();
                frame.setVisible(false);
            }
        });
    }
}
