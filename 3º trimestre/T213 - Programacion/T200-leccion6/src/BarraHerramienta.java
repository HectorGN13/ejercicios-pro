import javax.swing.*;
import java.awt.*;

public class BarraHerramienta extends JPanel {

    private JButton hbtn1;
    private JButton hbtn2;

    public BarraHerramienta() {

        hbtn1 = new JButton("HOLA");
        hbtn2 = new JButton("ADIOS");

        setLayout(new FlowLayout(FlowLayout.LEFT)); // FlowLayout es el gestor de contenido por defecto dee JPanel

        add(hbtn1);
        add(hbtn2);
    }
}
