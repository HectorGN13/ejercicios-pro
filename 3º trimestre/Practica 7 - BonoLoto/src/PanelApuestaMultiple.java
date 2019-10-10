import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.util.ArrayList;

public class PanelApuestaMultiple extends JPanel {

    ArrayList<JTextField> numeros;
    JTextField complementario;
    JPanel apuestas;
    JPanel complemento;

    public PanelApuestaMultiple() {
        setLayout(new GridLayout(2,1));
        numeros = new ArrayList<>();
        apuestas = new JPanel();
        apuestas.setLayout(new FlowLayout());
        apuestas.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(),"Apuesta múltiple",
                TitledBorder.CENTER, TitledBorder.ABOVE_TOP,
                new java.awt.Font("Calibri", 1, 20),
                new java.awt.Color(1, 1, 1)));

        for (int i = 0; i < 6; i++) {
            JTextField numero = new JTextField();
            numero.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK),
                    BorderFactory.createEmptyBorder(10,20,20,20)));
            numeros.add(numero);
            apuestas.add(numero);
        }
        complementario = new JTextField();
        complementario.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(10,20,20,20)));
        complemento = new JPanel();
        complemento.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(),"Complementario",
                TitledBorder.CENTER, TitledBorder.ABOVE_TOP,
                new java.awt.Font("Calibri", 1, 20),
                new java.awt.Color(1, 1, 1)));
        complemento.add(complementario);
        this.add(apuestas);
        this.add(complemento);
    }

    public ArrayList<JTextField> getNumeros() {
        return numeros;
    }

    public JTextField getComplementario() {
        return complementario;
    }

    public void setNumeros(ArrayList<JTextField> numeros) {
        this.numeros = numeros;
    }

    public void setComplementario(JTextField complementario) {
        this.complementario = complementario;
    }
}
