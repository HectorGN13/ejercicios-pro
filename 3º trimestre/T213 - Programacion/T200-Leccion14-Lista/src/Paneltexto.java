import javax.swing.*;
import java.awt.*;

public class Paneltexto extends JPanel {

    private JTextArea areaTexto;

    public Paneltexto() {

        setLayout(new BorderLayout());

        areaTexto = new JTextArea();
        add(new JScrollPane(areaTexto), BorderLayout.CENTER);
    }

    public void insertarTexto(String texto) {
        areaTexto.append(texto);
    }
}
