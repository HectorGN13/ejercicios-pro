import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PanelFormulario extends JPanel {

    private JLabel nombreLabel;
    private JLabel puestoLabel;
    private JTextField nombreField;
    private JTextField puestoField;
    private JButton btnEnviar;


    public PanelFormulario() {

        Dimension d = getPreferredSize();
        d.width = 300;
        setPreferredSize(d);

        Border interior = BorderFactory.createTitledBorder("Añadir Clientes");
        Border exterior = BorderFactory.createEmptyBorder(5,5,5,5);
        //setBackground(Color.darkGray);
        setBorder(BorderFactory.createCompoundBorder(exterior, interior)); // importante el orden, no afecta los margenes!!!

        nombreLabel = new JLabel("Nombre: ");
        puestoLabel = new JLabel("Puesto: ");
        nombreField = new JTextField(16);
        puestoField = new JTextField(16);
        btnEnviar = new JButton("Enviar");

//        add(nombreLabel);
//        add(nombreField);
//        add(puestoLabel);
//        add(puestoField);

        //add(btnEnviar);

        setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();



        ///////////////////Primera fila/////////////////////

        g.weightx = 1;
        g.weighty = 0.1;

        g.gridx = 0;
        g.gridy = 0;
        g.fill = GridBagConstraints.NONE;
        g.insets = new Insets(0,0,0,5);
        g.anchor = GridBagConstraints.LINE_END;
        add(nombreLabel, g);

        g.gridx = 1;
        g. gridy = 0;
        g.insets = new Insets(0,0,0,0);
        g.anchor = GridBagConstraints.LINE_START;
        add(nombreField, g);
        ///////////////////Segunada fila/////////////////////

        g.weightx = 1;
        g.weighty = 0.1;

        g.gridy = 1;
        g. gridx = 0;
        g.insets = new Insets(0,0,0,5);
        g.anchor = GridBagConstraints.LINE_END;
        add(puestoLabel, g);

        g.gridy = 1;
        g. gridx = 1;
        g.insets = new Insets(0,0,0,0);
        g.anchor = GridBagConstraints.LINE_START;
        add(puestoField, g);
        ///////////////////Tercera fila/////////////////////

        g.weightx = 1;
        g.weighty = 1.0;

        g.gridy = 2;
        g. gridx = 1;
        g.anchor = GridBagConstraints.FIRST_LINE_START;
        g.insets = new Insets(0,0,0,0);
        add(btnEnviar, g);




    }
}
