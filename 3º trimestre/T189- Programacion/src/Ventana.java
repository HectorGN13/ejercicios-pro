import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;

public class Ventana extends JFrame {

    private JButton btn1;
    private JTextArea areaTexto;
    private JScrollPane scroll;

    public Ventana(String title) {
        super(title);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);


        areaTexto = new JTextArea();
        add(new JScrollPane(areaTexto), BorderLayout.CENTER);

        // setVerticalSrollBarPolicy lanza IllegalArgumentException si le pasamos por parametro valores no legales
        scroll = new JScrollPane();
        //scroll.setVerticalScrollBarPolicy(930233);
        scroll.setVerticalScrollBarPolicy(VERTICAL_SCROLLBAR_ALWAYS);

        btn1 = new JButton("BOTON1");
        add(btn1, BorderLayout.SOUTH);
        // ADD PROVOCA NULLPONTEXCEPTION si el valor es null
        //add(null, BorderLayout.NORTH);



        MiReceptor m = new MiReceptor();
        //PROVOCA CLASSCASTEXCEPTION si hacemos un casting a ActionListener
        //btn1.addActionListener((ActionListener) m);

        btn1.addMouseListener(m);

        btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                JButton b = (JButton) e.getSource();
                areaTexto.append("Hello winners! \n");
            }
        });

        setVisible(true);
    }

    private class MiReceptor extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            JButton b = (JButton) e.getSource();

        }
    }
}