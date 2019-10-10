import javax.swing.*;
import java.awt.*;


public class AreaDeTexto extends JPanel {
    private JTextArea textArea;



    public AreaDeTexto() {
       textArea = new JTextArea();
       setLayout(new BorderLayout());
       add(new JScrollPane(textArea),BorderLayout.CENTER);
    }

    public void escribir(String texto){
        textArea.append(texto);
    }

}
