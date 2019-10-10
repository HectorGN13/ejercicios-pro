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

        nombreLabel = new JLabel("Nombre");
        puestoLabel = new JLabel("Puesto");
        nombreField = new JTextField(16);
        puestoField = new JTextField(16);
        btnEnviar = new JButton("Enviar");

        add(nombreLabel);
        add(nombreField);
        add(puestoLabel);
        add(puestoField);

        add(btnEnviar);



    }
}
