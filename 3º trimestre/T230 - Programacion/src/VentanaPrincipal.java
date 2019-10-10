import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {

    private JPanel panelIzq;


    public VentanaPrincipal() throws HeadlessException {
        setVisible(true);
        setPreferredSize(new Dimension(800,600));
        setResizable(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        panelIzq = crearPanelIzquierdo();
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 2;
        c.gridheight = 2;
        add(panelIzq, c);



    }

    public JPanel crearPanelIzquierdo(){

        //Inicializamos el panel.
        JPanel izquierdo = new JPanel();
        //Elegimos su configuracion.
        izquierdo.setBackground(Color.DARK_GRAY);
        izquierdo.setLayout(new BorderLayout());
        //Creamos los componentes.
        JButton inciarSesion = new JButton("Iniciar sesión");
        inciarSesion.setForeground(Color.WHITE);
                //inciarSesion.setOpaque(false);
                //inciarSesion.setContentAreaFilled(false);
        inciarSesion.setBorderPainted(false);
        inciarSesion.setBackground(new Color(52, 52, 104));
        //imagen para el boton
        ImageIcon imagen;
        imagen = new ImageIcon("iconoIniciarSesion.png");
        inciarSesion.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(30, 30,Image.SCALE_DEFAULT)));

        //Panel interno detro del panel izquierdo.


        //Añadimos los componentes.
        izquierdo.add(inciarSesion,BorderLayout.NORTH);



        return izquierdo;
    }
}
