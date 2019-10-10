import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    private JButton btn;
    private PanelTexto panelTexto;
    private BarraHerramienta herramienta;

    public VentanaPrincipal() {
        super("Leccion 5");

        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        btn = new JButton("Clic aqui");
        panelTexto = new PanelTexto();
        herramienta = new BarraHerramienta();

        add(btn, BorderLayout.SOUTH);
        add(panelTexto, BorderLayout.CENTER);
        add(herramienta, BorderLayout.NORTH);





        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //areaTexto.append("Has clicado sobre el boton");
                panelTexto.insertarTexto("Has clicado \n");

            }
        });

        setVisible(true);



    }




}
