import javax.swing.*;
import java.awt.*;

public class AreaTexto extends JPanel {

    private JTextArea textArea;

    public AreaTexto() {
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(200, 200));

        add(new JScrollPane(textArea),BorderLayout.CENTER);
    }

    public void colorear(Color color){
        textArea.setBackground(color);
    }

}

