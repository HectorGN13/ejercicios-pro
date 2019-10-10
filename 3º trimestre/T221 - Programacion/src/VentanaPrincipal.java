import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaPrincipal extends JFrame {

    private JPanel contenedorBotones;
    private ArrayList<Boton> botones;


    public VentanaPrincipal(int tamanio) throws HeadlessException {

        setTitle("T221 - Programacion");
        setVisible(true);
        setSize(500,400);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contenedorBotones = new JPanel();
        botones = new ArrayList<>();

        while (botones.size() < (Math.pow(tamanio,2))){
            Boton boton = new Boton();
            boton.setBackground(Color.green);
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Boton llamante = (Boton)e.getSource();
                    if (llamante.isActivado()){
                        llamante.setBackground(Color.RED);
                        llamante.setActivado(false);
                    } else {
                        llamante.setBackground(Color.green);
                        llamante.setActivado(true);
                    }
                }
            });
            botones.add(boton);
        }

        contenedorBotones.setLayout(new GridLayout(tamanio,tamanio));
        for (int i = 0; i < botones.size() ; i++) {
            contenedorBotones.add(botones.get(i));
        }

        add(contenedorBotones);
    }
}
