import javax.swing.*;
import java.awt.*;
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

            boton1.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    interfaz.cambiarColor(0);
                }
            });

            boton2.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    interfaz.cambiarColor(1);
                }
            });

            boton3.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    interfaz.cambiarColor(2);
                }
            });

            boton4.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    interfaz.cambiarColor(3);
                }
            });

            boton5.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    interfaz.cambiarColor(4);
                }
            });

            boton6.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    interfaz.cambiarColor(5);
                }
            });

            boton7.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    interfaz.cambiarColor(6);
                }
            });
    }

    public void setInterfaz(Escuchadora e) {
        this.interfaz = e;
    }
}
