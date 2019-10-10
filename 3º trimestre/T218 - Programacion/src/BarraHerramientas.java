import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class BarraHerramientas extends JToolBar{

    private JButton holaBoton;
    private JButton adiosBoton;
    private Escuchadora escuchadora;


    public BarraHerramientas() {

        setLayout(new FlowLayout(FlowLayout.LEFT));
        holaBoton = new JButton("HOLA");
        adiosBoton = new JButton("ADIOS");

        add(holaBoton);
        add(adiosBoton);

        holaBoton.addMouseListener(new ControlRaton() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                escuchadora.escribir("Hola Jerele\n");
            }
        });

        adiosBoton.addMouseListener(new ControlRaton() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                escuchadora.escribir("Adios Jerele\n");
            }
        });
    }

    public void setEscuchadora(Escuchadora e) {
        this.escuchadora = e;
    }


//    public void mouseClicked(MouseEvent e) {
//        JButton click = (JButton) e.getSource();
//        if (escuchadora != null){
//            if (click == holaBoton)
//                escuchadora.escribir("Hola");
//            else if (click == adiosBoton)
//                escuchadora.escribir("Adios");
//        }
//    }

}
