import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame {

    private JButton boton1;
    private JButton boton2;
    private JLabel etiqueta;


    public Ventana() {
        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana(){
        setTitle("Tarea 216");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void inicializarComponentes(){
        boton1 = new JButton(" HECTORBOTON");
        boton1.setBounds(350, 300, 100, 30);
        boton2 = new JButton(" MARIABOTON");
        boton2.setBounds(50, 300, 100, 30);
        etiqueta = new JLabel("Etiqueta.");


        boton1.addMouseListener(new ControladorBoton());
        etiqueta.addMouseListener(new ControladorBoton());

        add(boton1);
        add(boton2);
        add(etiqueta, BorderLayout.CENTER);
    }

    public class ControladorBoton extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            etiqueta.setText("HERBOTON ha sido presionado.");

        }
    }

}