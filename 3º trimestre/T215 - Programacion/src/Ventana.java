import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame implements ActionListener {
    private JButton boton1;
    private JButton boton2;


    public Ventana() {
        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana(){
        setTitle("Tarea 215");
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

        ActionListener botonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                if(source.equals(boton1)) {
                    JOptionPane.showMessageDialog(source, "HectorBoton ha sido presionado");
                }
            }
        };

        boton1.addActionListener(botonListener);
        boton2.addActionListener(this);
        this.add(boton1);
        this.add(boton2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(this ,"Has presionado un botón controlado por receptor de eventos de la misma clase.");
    }


}
