import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class VentanaPrincipal extends JFrame {

    private JButton botonDestino;
    private JTextField textoDestino;

    public VentanaPrincipal() throws HeadlessException {
        botonDestino = new JButton("Guardar");
        textoDestino = new JTextField();
        botonDestino.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                guardar();
            }
        });
        add(botonDestino, BorderLayout.NORTH);
        add(textoDestino,BorderLayout.SOUTH);
        setVisible(true);
        setSize(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void guardar() {
        JFileChooser chooser = new JFileChooser();
        //chooser.setCurrentDirectory(new File(destino));
        int retrival = chooser.showSaveDialog(null);
        if (retrival == JFileChooser.APPROVE_OPTION) {
            textoDestino.setText(chooser.getSelectedFile().toString());
        }
    }


}
