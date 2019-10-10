import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class PanelBotones extends JPanel {

    private static final int FILAS = 5;
    private static final int COLUMNAS = 10;
    ArrayList<JButton> botones;

    private StringListener textListener;



    public PanelBotones() {
        super();
        setLayout(new GridLayout(FILAS,COLUMNAS));
        agregarBotones(this,crearBotones());
        this.setBorder(javax.swing.BorderFactory.createTitledBorder(BorderFactory.createLoweredBevelBorder(),"Selecciona 6 numeros y tu numero complementario.", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new java.awt.Font("Calibri", 1, 20), new java.awt.Color(1, 1, 1)));

    }

    private ArrayList<JButton> crearBotones(){
        botones = new ArrayList<>();
        int i = 1;
        while (botones.size() < (FILAS*COLUMNAS)){
            JButton boton = new JButton(""+i);
            boton.setBackground(new Color(107, 176, 107));
            Border line = new LineBorder(Color.white);
            Border margin = new EmptyBorder(15, 5, 15, 5);
            Border compound = new CompoundBorder(line, margin);
            boton.setBorder(compound);

            boton.addMouseListener(new MouseAdapter() {

                @Override
                public void mousePressed(MouseEvent e) {
                    JButton botonAccionado = (JButton) e.getSource();
                    botonAccionado.setBackground(new Color(123, 220, 123));
                    botonAccionado.setEnabled(false);
                    botonAccionado.setForeground(Color.BLACK);
                    if (textListener != null){
                        textListener.textEmitted(botonAccionado.getText());
                    }
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    JButton botonAccionado = (JButton) e.getSource();
                    botonAccionado.setBackground(new Color(123, 220, 123));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    JButton botonAccionado = (JButton) e.getSource();
                    if (botonAccionado.isEnabled()){
                    botonAccionado.setBackground(new Color(107, 176, 107));
                    }

                }
            });

            if (i == FILAS*COLUMNAS){
                boton.setVisible(false);
            }

            botones.add(boton);
            i++;
        }
        return botones;
    }


    public void agregarBotones (JPanel contenedor, ArrayList<JButton> botones) {
        contenedor.removeAll();
        for (int i = 0; i < botones.size(); i++) {
            contenedor.add(botones.get(i));
        }
    }

    public ArrayList<JButton> getBotones() {
        return botones;
    }

    public void setTextListener(StringListener listener){
        this.textListener = listener;
    }
}
