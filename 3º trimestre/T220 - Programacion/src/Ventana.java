import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;

    private JButton boton1;
    private JButton boton2;
    private JButton boton3;



    public Ventana() throws HeadlessException {
        setTitle("T220 - Programacion");
        setSize(200,150);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();

        boton1 = new JButton();
        boton2 = new JButton();
        boton3 = new JButton();

        add(panel1, BorderLayout.CENTER);
        add(panel2, BorderLayout.WEST);

        panel1.setBackground(Color.magenta);
        panel2.setBackground(Color.black);
        panel3.setBackground(Color.green);

        panel1.setLayout(new BorderLayout());
        panel1.add(panel3,BorderLayout.CENTER);
        panel1.add(boton1, BorderLayout.SOUTH);

        panel3.setLayout(new FlowLayout(FlowLayout.LEFT));
        panel3.add(boton2);
        panel3.add(boton3);
    }
}
