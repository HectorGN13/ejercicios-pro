import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    private JPanel panelOpciones;

    public VentanaPrincipal() throws HeadlessException {

        setTitle("Practica 8 - Zoo");
        setSize(500,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        panelOpciones = new PanelOpciones();
        panelOpciones.setBackground(new Color(157, 196, 255));
        add(panelOpciones,BorderLayout.CENTER);

        BDUtil.conectar();
    }
}
