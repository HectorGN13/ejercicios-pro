import javax.swing.*;
import java.awt.*;

public class VentanaPrincial extends JFrame {
    private JButton btn;
    private JTextArea areaTexto;

    public VentanaPrincial() {
        super("Leccion2");

        setLayout(new BorderLayout()); //Opcional, lo crea el gestor de colocacion automaticamente

        btn = new JButton("Click aqui");
        areaTexto = new JTextArea();

        add(areaTexto, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);

        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }
}
