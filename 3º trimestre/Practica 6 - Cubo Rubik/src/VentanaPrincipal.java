import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class VentanaPrincipal extends JFrame implements ActionListener{

    private ArrayList<Cara> caras;
    private JPanel caraQueSeMuestra;
    private int num;
    private int aux;

    private JButton up;
    private JButton down;
    private JButton left;
    private JButton right;

    public VentanaPrincipal() throws HeadlessException {
        setTitle("Cubo de Rubik. Version 0.1");
        setSize(800, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        caras = new ArrayList<>();
        crearCaras();
        caraQueSeMuestra = new JPanel();
        caraQueSeMuestra.setLayout(new BorderLayout());


        up = new JButton("▲");
        up.setActionCommand("up");
        up.addActionListener(this::actionPerformed);
        up.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                up.setBackground(Color.cyan);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                up.setBackground(null);
            }
        });
        down = new JButton("▼");
        down.setActionCommand("down");
        down.addActionListener(this::actionPerformed);
        down.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                down.setBackground(Color.cyan);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                down.setBackground(null);
            }
        });
        right = new JButton("▶");
        right.setActionCommand("right");
        right.addActionListener(this::actionPerformed);
        right.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                right.setBackground(Color.cyan);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                right.setBackground(null);
            }
        });
        left = new JButton("◀");
        left.setActionCommand("left");
        left.addActionListener(this::actionPerformed);
        left.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                left.setBackground(Color.cyan);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                left.setBackground(null);
            }
        });


        add(up,BorderLayout.NORTH);
        add(left,BorderLayout.WEST);
        add(right,BorderLayout.EAST);
        add(down,BorderLayout.SOUTH);
        System.out.println(caraQueSeMuestra);
        add(caraQueSeMuestra,BorderLayout.CENTER);
        caraQueSeMuestra.add(caras.get(num),BorderLayout.CENTER);
    }

    private void crearCaras(){
        for (int i = 0; i < 6; i++) {
            caras.add(new Cara());
        }
    }

    private int generarLado(int x, ActionEvent e){
        int result = x;
        switch (e.getActionCommand()){
            case "right":
                if(x < 4){
                    result = x+1;
                } else {
                    result = 1;
                }
                break;
            case "left":
                if(x > 0 && x < 4){
                    result = x-1;
                } else {
                    result = 3;
                }
                break;
            case "up":
                if(x < 4){
                    result = 4;
                } else if (x == 4) {
                    result = x+1;
                } else if (x == 5){
                    result = 0;
                }
                break;
            case "down":
                if(x < 4){
                    result = 5;
                } else if (x == 5) {
                    result = x-1;
                } else if (x == 4){
                    result = 0;
                }
                break;
        }
        return result;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        caraQueSeMuestra.removeAll();
        num = generarLado(num,e);
        caraQueSeMuestra.add(caras.get(num),BorderLayout.CENTER);
        repaint();
        revalidate();
    }

}
