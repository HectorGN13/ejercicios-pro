import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class PanelFormulario extends JPanel {

    public PanelFormulario() {

        Dimension d = getPreferredSize();
        d.width = 300;
        setPreferredSize(d);

        Border interior = BorderFactory.createTitledBorder("Añadir Clientes");
        Border exterior = BorderFactory.createEmptyBorder(5,5,5,5);
        //setBackground(Color.darkGray);
        setBorder(BorderFactory.createCompoundBorder(exterior, interior)); // importante el orden, no afecta los margenes!!!

    }
}
