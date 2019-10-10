import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    private JButton boton1;
    private JButton boton2;


    public Ventana() {
        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana(){
        setTitle("Tarea 214");
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

        ControladorBoton c1 = new ControladorBoton(this);

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                if (source.equals(boton1)){
                    JOptionPane.showMessageDialog(source, "HECTORBoton ha sido presionado.");
                }
            }
        });
        boton2.addActionListener(c1);
        add(boton1);
        add(boton2);
    }

    public class ControladorBoton implements ActionListener{
        public Ventana vista;

        public ControladorBoton(Ventana vista) {
            this.vista = vista;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(vista, "Has presionado un botón controlado por ControladorBoton");
        }
    }

}

