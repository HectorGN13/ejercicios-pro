import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    private JTabbedPane panelPestana;
    public VentanaPrincipal() throws HeadlessException {
        panelPestana = new JTabbedPane();
        for (int i = 0; i < 5; i++) {
            panelPestana.addTab(String.format("Pestaña nº %d", i), new JPanel());
        }
        add(panelPestana, BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setPreferredSize(new Dimension(800, 500));
        pack();
        setVisible(true);
    }
}
