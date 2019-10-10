import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    private BarraColores barraColores;
    private AreaTexto areaTexto;

    public Ventana() throws HeadlessException {

        setTitle("T218 - Programacion");
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        barraColores = new BarraColores();
        areaTexto = new AreaTexto();

        add(barraColores,BorderLayout.NORTH);
        add(areaTexto, BorderLayout.CENTER);

        barraColores.setInterfaz(new Escuchadora() {
            @Override
            public void cambiarColor(int color) {
                switch (color){
                    case 0:
                        areaTexto.colorear(Color.GREEN);
                        break;
                    case 1:
                        areaTexto.colorear(Color.YELLOW);
                        break;
                    case 2:
                        areaTexto.colorear(Color.RED);
                        break;
                    case 3:
                        areaTexto.colorear(Color.BLUE);
                        break;
                    case 4:
                        areaTexto.colorear(Color.ORANGE);
                        break;
                    case 5:
                        areaTexto.colorear(Color.CYAN);
                        break;
                    case 6:
                        areaTexto.colorear(Color.WHITE);
                        break;
                    default:
                        areaTexto.colorear(Color.BLACK);
                        break;
                }
            }
        });
    }
}
