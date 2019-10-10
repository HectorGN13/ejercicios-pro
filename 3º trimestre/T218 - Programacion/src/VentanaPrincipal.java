import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private BarraHerramientas toolBar;
    private AreaDeTexto etiqueta;

    public VentanaPrincipal() throws HeadlessException {

        setTitle("T218 - Programacion");
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        toolBar = new BarraHerramientas();
        etiqueta = new AreaDeTexto();

        add(toolBar,BorderLayout.NORTH);
        add(etiqueta, BorderLayout.CENTER);

        toolBar.setEscuchadora(new Escuchadora() {
            @Override
            public void escribir(String text) {
                etiqueta.escribir(text);
            }
        });
    }


}
