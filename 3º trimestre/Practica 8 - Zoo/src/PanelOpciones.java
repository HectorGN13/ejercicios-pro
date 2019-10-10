import javax.swing.*;
import java.awt.*;

public class PanelOpciones extends JPanel {
    private JTabbedPane tabbedPane;



    public PanelOpciones() {
        setLayout(new BorderLayout());
        tabbedPane = new JTabbedPane();
        setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        tabbedPane.addTab("Insertar",new JPanelInsert());
        tabbedPane.addTab("Consultar", new JPanelSelect());
        tabbedPane.addTab("Modificar", new JPanelUpdate());
        tabbedPane.addTab("Eliminar", new JPanelDelete());

        add(tabbedPane,BorderLayout.CENTER);
    }
}
