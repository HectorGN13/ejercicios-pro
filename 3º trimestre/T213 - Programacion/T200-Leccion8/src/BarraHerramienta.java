import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BarraHerramienta extends JPanel implements ActionListener {

    private JButton btn1;
    private JButton btn2;
    //private Paneltexto panelTexto;
    private StringListener textoListener;



    public BarraHerramienta() {

        setLayout(new FlowLayout(FlowLayout.LEFT));

        btn1 = new JButton("HOLA");
        btn2 = new JButton("ADIOS");

        btn1.addActionListener(this);
        btn2.addActionListener(this);

        add(btn1);
        add(btn2);
    }

//    public void setPanelTexto(Paneltexto panelTexto) {
//       this.panelTexto =panelTexto;
//
//    }

    public void setStringListener(StringListener listener) {
        this.textoListener= listener;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        JButton click =(JButton) e.getSource();
        if (click == btn1)
           if (textoListener != null)
               textoListener.emitirTexto("Hola que tal \n");
        if (click == btn2)
            if (textoListener != null)
                textoListener.emitirTexto("Hasta luego Luca!!! \n");

    }
}
