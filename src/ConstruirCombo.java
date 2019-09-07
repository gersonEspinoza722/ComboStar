import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConstruirCombo {
    private static JFrame frame;
    private JTextField codeBebida;
    private JTextField codeAdicional;
    private JTextField codePrincipal;
    private JButton agregarBebidaButton;
    private JButton agregarAdicionalButton;
    private JButton agregarPrincipalButton;
    private JButton CONSTRUIRMENÚButton;
    private JPanel ventanaBuild;
    private Combo comboEnConstruccion;
    private static int codeComboCambiar;


    public static void main(String[] args) {
        frame = new JFrame("ConstruirCombo");
        frame.setContentPane(new ConstruirCombo().ventanaBuild);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        if(codeComboCambiar>0){
            Combo combo= ComboStar.getCombos().getCombos().get(codeComboCambiar);
            ComboStar.getBuilder().setPrincipal(combo.getPrincipal());
            ComboStar.getBuilder().setBebidas(combo);
            ComboStar.getBuilder().setAdicionals(combo);

        }
    }

    public ConstruirCombo() {


        agregarBebidaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String codestr= codeBebida.getText();
                int code= Integer.parseInt(codestr);
                Bebida escogida=(Bebida) ComboStar.getBebidas().buscar(code);
                ComboStar.getBuilder().addBebida(escogida);
            }
        });
        agregarAdicionalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String codestr= codeAdicional.getText();
                int code= Integer.parseInt(codestr);
                Adicional escogida=(Adicional) ComboStar.getAdicionales().buscar(code);
                ComboStar.getBuilder().addAdicional(escogida);
            }
        });
        agregarPrincipalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                String codestr= codePrincipal.getText();
                int code= Integer.parseInt(codestr);
                Principal escogida=(Principal) ComboStar.getPrincipales().buscar(code);
                ComboStar.getBuilder().setPrincipal(escogida);
            }
        });
        CONSTRUIRMENÚButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboEnConstruccion =  ComboStar.getBuilder().build();
                Resultado.main();
                frame.setVisible(false);

            }
        });


    }
}
