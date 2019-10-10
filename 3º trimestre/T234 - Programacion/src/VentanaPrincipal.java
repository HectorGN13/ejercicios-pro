import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame{
    private JButton boton;
    private JCheckBox casilla;

    public VentanaPrincipal() throws HeadlessException {
        boton = new JButton("BOTON");
        casilla = new JCheckBox("CHECK BOX");
        add(boton, BorderLayout.NORTH);
        add(casilla, BorderLayout.SOUTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setPreferredSize(new Dimension(800,600));
        pack();
        setVisible(true);
    }
}
