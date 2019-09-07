import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu_Inicial {
    private JButton escogerMenúPredeterminadoButton;
    private JButton construirMenúButton;
    private JButton verCombosAceptadosButton;
    private JPanel Menu;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu_Inicial");
        frame.setContentPane(new Menu_Inicial().Menu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Menu_Inicial() {
        verCombosAceptadosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Resultado.main();
            }
        });
        escogerMenúPredeterminadoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                EscogerCombo.main();
            }
        });
        construirMenúButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ConstruirCombo.main();
            }
        });
    }
}
