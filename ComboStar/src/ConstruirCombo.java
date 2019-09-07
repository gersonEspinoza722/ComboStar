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
    private Combo.ComboBuilder builder;

    public static void main(String[] args) {
        frame = new JFrame("ConstruirCombo");
        frame.setContentPane(new ConstruirCombo().ventanaBuild);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        //codeComboCambiar = code; SACAR CÓDIGO
        if(codeComboCambiar>0){
            //builder.setPrincipal();
            //builder.addBebida();
            //builder.addAdicional();

        }
    }

    public ConstruirCombo() {


        agregarBebidaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Bebida escogida;
                String codestr= codeBebida.getText();
                int code= Integer.parseInt(codestr);
                //builder.addBebida(escogida);
            }
        });
        agregarAdicionalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Adicional escogido;
                String codestr= codeAdicional.getText();
                int code= Integer.parseInt(codestr);
                //builder.addAdicional(escogido);
            }
        });
        agregarPrincipalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //Principal escogido;
                String codestr= codePrincipal.getText();
                int code= Integer.parseInt(codestr);
                //builder.setPrincipal(escogido);
            }
        });
        CONSTRUIRMENÚButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboEnConstruccion = builder.build();
                //Meterlo en alguna lista
                Resultado.main();
                frame.setVisible(false);

            }
        });


    }
}
