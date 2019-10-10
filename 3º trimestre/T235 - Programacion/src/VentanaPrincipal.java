import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class VentanaPrincipal extends JFrame {

    public VentanaPrincipal() throws HeadlessException {
        JTextArea texto = new JTextArea();
        add(texto, BorderLayout.CENTER);
        setPropiedades();
    }

    private void setPropiedades() {
        setJMenuBar(barraMenu());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setPreferredSize(new Dimension(600, 400));
        pack();
        setVisible(true);
    }

    // setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.SHIFT_MASK));

    private JMenuBar barraMenu() {
        JMenuBar barra = new JMenuBar();
        barra.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));

        JMenu archivo = new JMenu("Archivo");
        archivo.setToolTipText("Menú de opciones generales");
        barra.add(archivo);
        archivo.setMnemonic(KeyEvent.VK_A);

        JMenuItem nuevo = new JMenuItem("Nuevo");
        JMenuItem abrir = new JMenuItem("Abrir...");
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardarComo = new JMenuItem("Guardar como...");
        nuevo.setMnemonic(KeyEvent.VK_N);
        nuevo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
        abrir.setMnemonic(KeyEvent.VK_A);
        abrir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, KeyEvent.CTRL_MASK));
        guardar.setMnemonic(KeyEvent.VK_G);
        guardar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, KeyEvent.CTRL_MASK));
        archivo.add(nuevo);
        archivo.add(abrir);
        archivo.add(guardar);
        archivo.add(guardarComo);
        archivo.addSeparator();
        JMenuItem confpag = new JMenuItem("Configurar página...");
        JMenuItem imprimir = new JMenuItem("Imprimir...");
        confpag.setMnemonic(KeyEvent.VK_E);
        imprimir.setMnemonic(KeyEvent.VK_P);
        imprimir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.CTRL_MASK));
        archivo.add(confpag);
        archivo.add(imprimir);
        archivo.addSeparator();
        JMenuItem salir = new JMenuItem("Salir");
        archivo.add(salir);

        JMenu editar = new JMenu("Edición");
        editar.setToolTipText("Menú editar");
        editar.setMnemonic(KeyEvent.VK_E);
        barra.add(editar);

        JMenuItem copiar = new JMenuItem("Copiar");
        copiar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
        editar.add(copiar);
        JMenuItem cortar = new JMenuItem("Cortar");
        editar.add(cortar);
        JMenuItem pegar = new JMenuItem("Pegar");
        pegar.setMnemonic(KeyEvent.VK_P);
        pegar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_MASK));
        editar.add(pegar);
        editar.addSeparator();
        JMenuItem seleccionarTodo = new JMenuItem("Seleccionar todo");
        seleccionarTodo.setMnemonic(KeyEvent.VK_T);
        editar.add(seleccionarTodo);
        editar.addSeparator();
        JMenuItem preferencias = new JMenuItem("Preferencias");
        preferencias.setMnemonic(KeyEvent.VK_R);
        editar.add(preferencias);

        JMenu terminal = new JMenu("Formato");
        terminal.setToolTipText("Opciones de la terminal");
        terminal.setMnemonic(KeyEvent.VK_T);
        barra.add(terminal);

        JMenu ver = new JMenu("Ver");
        ver.setToolTipText("Menú ver");
        ver.setMnemonic(KeyEvent.VK_V);
        barra.add(ver);

        JCheckBoxMenuItem barraEstado = new JCheckBoxMenuItem("Barra de estado");
        barraEstado.setMnemonic(KeyEvent.VK_M);
        ver.add(barraEstado);


        JMenu ayuda = new JMenu("Ayuda");
        ayuda.setToolTipText("Ayuda para el usuario");
        ayuda.setMnemonic(KeyEvent.VK_H);
        barra.add(ayuda);

        JMenuItem contenido = new JMenuItem("Ver la ayuda");
        ayuda.add(contenido);
        ayuda.addSeparator();
        JMenuItem acerca = new JMenuItem("Acerca de Bloc de notas");
        ayuda.add(acerca);
        return barra;
    }
}
