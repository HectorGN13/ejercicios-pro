import javax.swing.*;
import java.awt.*;


public class VentanaPrincipal extends JFrame {

    private Paneltexto paneltexto;
    private BarraHerramienta barraHerramienta;


    public VentanaPrincipal(String title) throws HeadlessException {
        super(title);

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


        paneltexto = new Paneltexto();
        barraHerramienta = new BarraHerramienta();


        add(paneltexto, BorderLayout.CENTER);
        add(barraHerramienta, BorderLayout.NORTH);

        //barraHerramienta.setPanelTexto(paneltexto); // ahora usamos la interface StringListener
        barraHerramienta.setStringListener(new StringListener() {
            @Override
            public void emitirTexto(String texto) {
                paneltexto.insertarTexto(texto);
            }
        });


    }
}
