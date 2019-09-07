import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EscogerCombo {
    private JTextArea textArea1;
    private JTextField codeCombo;
    private JButton aceptarButton;
    private static JFrame frame;
    private ComboStar comboStar = ComboStar.getInstance();

    public static void main() {
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
                ComboStar.setComboPred(code);
                ConstruirCombo.main();
                frame.setVisible(false);
            }
        });
        aceptarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String x= codeCombo.getText();
                int code=Integer.parseInt(x);
                ComboStar.addComboAceptado(ComboStar.getCombos().get(code));

                Resultado.main();
                frame.setVisible(false);
            }
        });
    }
}
