import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal  extends JFrame {

    private JButton btn;
    private JTextArea areaTexto;

    public VentanaPrincipal(String title)  {
        super(title);

        btn = new JButton("Cick aquí");
        add(btn, BorderLayout.SOUTH);

        areaTexto = new JTextArea();
        add(areaTexto, BorderLayout.NORTH);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                areaTexto.append("Has clicado \n");

            }
        });



        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }
}
