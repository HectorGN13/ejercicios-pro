import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.util.ArrayList;

public class Cara extends JPanel {

    private ArrayList<JButton> botones;

    public Cara(Color color) {
        super();
        setLayout(new GridLayout(3,3));
        setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createBevelBorder(BevelBorder.LOWERED),
                BorderFactory.createEmptyBorder(30,30,30,30)));

        agregarBotones(crearBotones(color));
    }

    private ArrayList<JButton> crearBotones(Color color){
        botones = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            JButton boton = new JButton();
            boton.setBackground(color);
            Border line = new LineBorder(Color.BLACK);
            Border margin = new EmptyBorder(15, 5, 15, 5);
            Border compound = new CompoundBorder(line, margin);
            boton.setBorder(compound);
            botones.add(boton);
        }
        return botones;
    }

    public void agregarBotones (ArrayList<JButton> botones) {

        for (int i = 0; i < botones.size(); i++) {
            add(botones.get(i));
        }
    }

}
