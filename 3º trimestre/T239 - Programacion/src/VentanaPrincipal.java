import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    public static final String IMAGEN = "/recursos/";
    private JButton boton;

    public VentanaPrincipal() throws HeadlessException {
        boton = new JButton();
        boton.setIcon(new ImageIcon(getClass().getResource(IMAGEN + "ok.png")));
        add(boton, BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        boton.setBackground(new Color(96, 255, 143));
        setPreferredSize(new Dimension(500,300));
        pack();
        setVisible(true);
    }
}
