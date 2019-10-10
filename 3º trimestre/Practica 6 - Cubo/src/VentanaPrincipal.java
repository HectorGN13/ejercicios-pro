import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaPrincipal extends JFrame implements ActionListener {

    private ArrayList<Cara> caras;

    //Botones que se usan para mostrar las caras del cubo
    private JButton arriba;
    private JButton abajo;
    private JButton derecha;
    private JButton izquierda;

    //Cara del cubo que se muestra.
    private Cara cara;

    public VentanaPrincipal() throws HeadlessException {
        setTitle("Cubo de Rubik. Version 0.1");
        setSize(800,600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        //Creacion de componentes.
        arriba = new JButton("▲");
        arriba.setActionCommand("arriba");
        arriba.addActionListener(this);
        abajo = new JButton("▼");
        abajo.setActionCommand("abajo");
        abajo.addActionListener(this);
        derecha = new JButton("▶");
        derecha.setActionCommand("derecha");
        derecha.addActionListener(this);
        izquierda = new JButton("◀");
        izquierda.setActionCommand("izquierda");
        izquierda.addActionListener(this);

        //Cara principal.
       caras = crearCaras();
       cara = caras.get(0);


        //Agregar los componentes
        add(arriba,BorderLayout.NORTH);
        add(izquierda,BorderLayout.WEST);
        add(derecha,BorderLayout.EAST);
        add(abajo,BorderLayout.SOUTH);
        add(cara,BorderLayout.CENTER);


    }

    private ArrayList<Cara> crearCaras(){
        ArrayList<Cara> result = new ArrayList<>();
        result.add(new Cara(Color.ORANGE));
        result.add(new Cara(Color.CYAN));
        result.add(new Cara(Color.PINK));
        result.add(new Cara(Color.YELLOW));
        result.add(new Cara(Color.GREEN));
        result.add(new Cara(Color.WHITE));
        return result;
    }

    public void setCara(Cara cara) {
        this.cara = cara;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton botonpulsado = (JButton) e.getSource();
        if (botonpulsado.getActionCommand().equals("arriba")){
            cara.removeAll();
            cara = caras.get(4);
            cara.validate();
            cara.repaint();
        }
        if (botonpulsado.getActionCommand().equals("abajo")){
            cara.removeAll();
            cara.add(caras.get(5));
            cara.validate();
            cara.repaint();
        }
        if (botonpulsado.getActionCommand().equals("izquierda")) {


        }
        if (botonpulsado.getActionCommand().equals("derecha")){

        }
    }
}