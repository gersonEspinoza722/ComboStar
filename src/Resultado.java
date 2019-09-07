import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Resultado {
    private JPanel Resultado;
    private JTextArea textArea1;
    private JButton imprimirButton;
    private JButton salirButton;
    private ComboStar comboStar = ComboStar.getInstance();
    private static JFrame frame;
    public Resultado() {
        imprimirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String h="";
                for(int x=0;x<ComboStar.getCombosAceptados().size();x++){
                    h+="PRINCIPAl: ";
                    h+=String.valueOf(ComboStar.getCombosAceptados().get(x).getPrincipal());
                    h+="|| ADICIONALES: ";

                    for(int w=0;w<ComboStar.getCombosAceptados().get(x).getAdicionales().size();w++){
                        h+=String.valueOf(ComboStar.getCombosAceptados().get(x).getAdicionales().get(w).getNombre());
                        h+=", ";
                    }
                    h+="|| BEBIDAS: ";

                    for(int w=0;w<ComboStar.getCombosAceptados().get(x).getBebidas().size();w++){
                        h+=String.valueOf(ComboStar.getCombosAceptados().get(x).getBebidas().get(w).getNombre());
                        h+=", ";
                    }
                    h+="   COSTO TOTAL::" + String.valueOf(ComboStar.getCombosAceptados().get(x).getCostoTotal());
                    h+="\n\n";
                }
                int tot=0;
                for(int x=0;x<ComboStar.getCombosAceptados().size();x++) {
                    tot+= ComboStar.getCombosAceptados().get(x).getCostoTotal();
                }
                h+="\n\nCOSTO TOTAL DEL COMBO- - - - - - - - - "+String.valueOf(tot);
                textArea1.setText(h);
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                frame.setVisible(false);
            }
        });
    }
    public static void main() {
        frame = new JFrame("Resultado");
        frame.setContentPane(new Resultado().Resultado);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
