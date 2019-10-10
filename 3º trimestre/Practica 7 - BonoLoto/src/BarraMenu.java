import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class BarraMenu extends JMenuBar {


    public BarraMenu() {

        JMenu archivo = new JMenu("File");
        JMenu ayuda = new JMenu("Help");
        JMenu herramientas = new JMenu("Tools");

        JMenuItem salir = new JMenuItem("Exit");
        JMenuItem nuevo = new JMenuItem("New");
        JMenuItem abrir = new JMenuItem("Open");

        archivo.setMnemonic(KeyEvent.VK_F);
        ayuda.setMnemonic(KeyEvent.VK_H);
        herramientas.setMnemonic(KeyEvent.VK_T);

        salir.setMnemonic(KeyEvent.VK_X);
        salir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int opcion = JOptionPane.showConfirmDialog(new Ventana(), "¿Estas seguro de que quieres salir?", "LA PRIMITIVA -- Apuestas del Estado", JOptionPane.YES_NO_OPTION);
                if (opcion == JOptionPane.YES_OPTION){
                    System.exit(EXIT_ON_CLOSE);
                }
            }
        });

        this.add(archivo);
        this.add(herramientas);
        this.add(ayuda);


        archivo.add(nuevo);
        archivo.add(abrir);
        archivo.add(salir);


    }
}
