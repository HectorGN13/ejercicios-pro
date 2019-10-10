import javax.swing.*;
import java.awt.*;


public class VentanaPrincipal extends JFrame {

    private Paneltexto paneltexto;
    private BarraHerramienta barraHerramienta;
    private PanelFormulario panelFormulario;


    public VentanaPrincipal(String title) throws HeadlessException {
        super(title);

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);


        paneltexto = new Paneltexto();
        barraHerramienta = new BarraHerramienta();
        panelFormulario = new PanelFormulario();


        add(paneltexto, BorderLayout.CENTER);
        add(barraHerramienta, BorderLayout.NORTH);
        add(panelFormulario, BorderLayout.WEST);

        //barraHerramienta.setPanelTexto(paneltexto); // ahora usamos la interface StringListener
        barraHerramienta.setStringListener(new StringListener() {
            @Override
            public void emitirTexto(String texto) {
                paneltexto.insertarTexto(texto);
            }
        });

        panelFormulario.setReceptorFormulario(new ReceptorFormulario() {
            @Override
            public void formEventOccurred(EventoFormulario e) {
                String nombre = e.getNombre();
                String puesto = e.getPuesto();
                int categoriaEdad = e.getCategoriaEdad();

                paneltexto.insertarTexto(nombre+ ": "+ puesto+": "+ categoriaEdad +"\n");
            }
            });
    }
}
