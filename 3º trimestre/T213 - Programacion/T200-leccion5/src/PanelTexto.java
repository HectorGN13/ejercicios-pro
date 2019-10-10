import javax.swing.*;
import java.awt.*;

public class PanelTexto extends JPanel {

    private JTextArea areaTexto;
    public PanelTexto() {

        areaTexto = new JTextArea();
        add(new JScrollPane(areaTexto), BorderLayout.CENTER);
    }

    public void insertarTexto(String texto) {
        areaTexto.append(texto);
    }
}
