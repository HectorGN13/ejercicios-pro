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
            public void cambiarColor(String color) {
                switch (color){
                    case "Verde":
                        areaTexto.colorear(Color.GREEN);
                        break;
                    case "Amarillo":
                        areaTexto.colorear(Color.YELLOW);
                        break;
                    case "Rojo":
                        areaTexto.colorear(Color.RED);
                        break;
                    case "Azul":
                        areaTexto.colorear(Color.BLUE);
                        break;
                    case "Naranja":
                        areaTexto.colorear(Color.ORANGE);
                        break;
                    case "Celeste":
                        areaTexto.colorear(Color.CYAN);
                        break;
                    case "Blanco":
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
