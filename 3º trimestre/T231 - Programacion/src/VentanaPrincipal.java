import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class VentanaPrincipal extends JFrame {
    private JDialog registro;

    public VentanaPrincipal() throws HeadlessException {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setPreferredSize(new Dimension(200,250));
        pack();
        setVisible(true);

        registro = new InicioSesion(this, "Iniciar sesión", true);
        ((InicioSesion) registro).setCuenta(new ICuenta() {
            @Override
            public boolean validar(String usuario, String clave) {
                String user = "Hector";
                String password = "alba1234";
                return (user.equals(usuario) && password.equals(clave));
            }
        });
    }

    private void abrirDialogo() {
        registro.setVisible(true);
    }

    private JMenuBar menu() {
        JMenuBar barra = new JMenuBar();
        JMenu menu = new JMenu("Archivo");
        menu.setMnemonic(KeyEvent.VK_A);
        JMenuItem registro = new JMenuItem("Iniciar sesión");
        registro.setMnemonic(KeyEvent.VK_I);
        JMenuItem salir = new JMenuItem("Salir");
        salir.setMnemonic(KeyEvent.VK_S);

        barra.add(menu);
        menu.add(registro);
        menu.addSeparator();
        menu.add(salir);

        registro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                abrirDialogo();
            }
        });

        salir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(-1);
            }
        });

        return barra;
    }
}
