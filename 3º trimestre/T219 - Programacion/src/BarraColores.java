import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class BarraColores extends JToolBar {

    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;
    private JButton boton6;
    private JButton boton7;

    private Escuchadora interfaz;


    public BarraColores() {

            setLayout(new FlowLayout(FlowLayout.LEFT));

            boton1 = new JButton("Verde");
            boton2 = new JButton("Amarillo");
            boton3 = new JButton("Rojo");
            boton4 = new JButton("Azul");
            boton5 = new JButton("Naranja");
            boton6 = new JButton("Celeste");
            boton7 = new JButton("Blanco");

            add(boton1,0);
            add(boton2,1);
            add(boton3,2);
            add(boton4,3);
            add(boton5,4);
            add(boton6,5);
            add(boton7,6);

            boton1.setActionCommand("Verde");
            boton1.addActionListener(new BotonPulsadoListener());
            boton2.setActionCommand("Amarillo");
            boton2.addActionListener(new BotonPulsadoListener());
            boton3.setActionCommand("Rojo");
            boton3.addActionListener(new BotonPulsadoListener());
            boton4.setActionCommand("Azul");
            boton4.addActionListener(new BotonPulsadoListener());
            boton5.setActionCommand("Naranja");
            boton5.addActionListener(new BotonPulsadoListener());
            boton6.setActionCommand("Celeste");
            boton6.addActionListener(new BotonPulsadoListener());
            boton7.setActionCommand("Blanco");
            boton7.addActionListener(new BotonPulsadoListener());
    }

    public void setInterfaz(Escuchadora e) {
        this.interfaz = e;
    }

    public class BotonPulsadoListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            interfaz.cambiarColor(e.getActionCommand());
        }
    }
}
