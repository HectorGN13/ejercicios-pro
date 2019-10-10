import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ventana extends JFrame {

    private JButton boton1;
    private JButton boton2;


    public Ventana() {
        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana(){
        setTitle("Tarea 217");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void inicializarComponentes(){
        boton1 = new JButton(" HECTORBOTON");
        boton1.setBounds(350, 300, 100, 30);
        boton2 = new JButton(" MARIABOTON");
        boton2.setBounds(50, 300, 100, 30);



        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                if (source.equals(boton1)){
                    JOptionPane.showMessageDialog(source, "HERBoton ha sido presionado.");
                }
            }
        });
        boton2.addMouseListener(new ControladorRaton());
        boton2.addKeyListener(new ControladorTeclado());
        add(boton1);
        add(boton2);
    }

    public class ControladorRaton extends MouseAdapter {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
            boton1.setBackground(Color.RED);
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            super.mouseEntered(e);
            boton1.setBackground(Color.GREEN);
        }
    }

    public class ControladorTeclado extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            super.keyPressed(e);
            boton1.setBackground(Color.BLUE);
        }
    }





}

