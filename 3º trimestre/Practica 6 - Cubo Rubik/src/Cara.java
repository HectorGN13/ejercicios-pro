import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Cara extends JPanel {
    private static int serie;
    private ArrayList<JButton> botones;

    public Cara() {
        super();
        setLayout(new GridLayout(3,3));
        crearBotones();
        colorearBotones(serie);
        serie++;
    }

    private void crearBotones(){
        botones = new ArrayList<>();
        for (int i = 0; i < 3*3; i++) {
            botones.add(new JButton());
            add(botones.get(i));
        }
    }

    private void colorearBotones(int num){
        switch (num){
            case 0:
                for (int i = 0; i < 3*3; i++) {
                    botones.get(i).setBackground(Color.WHITE);
                }
                break;
            case 1:
                for (int i = 0; i < 3*3; i++) {
                    botones.get(i).setBackground(Color.RED);
                }
                break;
            case 2:
                for (int i = 0; i < 3*3; i++) {
                    botones.get(i).setBackground(Color.GREEN);
                }
                break;
            case 3:
                for (int i = 0; i < 3*3; i++) {
                    botones.get(i).setBackground(Color.YELLOW);
                }
                break;
            case 4:
                for (int i = 0; i < 3*3; i++) {
                    botones.get(i).setBackground(Color.BLUE);
                }
                break;
            case 5:
                for (int i = 0; i < 3*3; i++) {
                    botones.get(i).setBackground(Color.ORANGE);
                }
                break;
            default:
                for (int i = 0; i < 3*3; i++) {
                    botones.get(i).setBackground(Color.BLACK);
                }
                break;
        }
    }

}
