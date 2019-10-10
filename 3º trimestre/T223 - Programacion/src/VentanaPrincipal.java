import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() throws HeadlessException {

        setSize(200,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLayout(new FlowLayout());

        String[] optiones = { "Galera", "Acedia", "Pijota", "Choco", "Ortiguilla" };
        JList combo1 = new JList(optiones);

        String[] options2 = { "Lagartito", "Berza", "Carrillá", "Parrillá" };
        JList combo2 = new JList(options2);

        Panel panel1 = new Panel();
        panel1.add(combo1);

        Panel panel2 = new Panel();
        panel2.add(combo2);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panel1, panel2);

        splitPane.setOneTouchExpandable(true);
        splitPane.setContinuousLayout(true);
        splitPane.setResizeWeight(0.5);

        add(splitPane, BorderLayout.CENTER);

    }
}
