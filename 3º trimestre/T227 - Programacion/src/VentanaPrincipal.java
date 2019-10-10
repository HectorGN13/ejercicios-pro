import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Random;

public class VentanaPrincipal extends JFrame implements ActionListener, PropertyChangeListener {

    private JProgressBar progressBar;
    private JButton start;
    private JTextArea texto;
    private Tarea tarea;


    class Tarea extends SwingWorker<Void, Void> {

        @Override
        public Void doInBackground() {
            Random random = new Random();
            int progress = 0;
            setProgress(0);
            while (progress < 100) {
                try {
                    Thread.sleep(random.nextInt(1000));
                } catch (InterruptedException ignore) {}
                progress += random.nextInt(10);
                setProgress(Math.min(progress, 100));
            }
            return null;
        }
        @Override
        public void done() {
            Toolkit.getDefaultToolkit().beep();
            start.setEnabled(true);
            setCursor(null);
            texto.append("Instalacion Finalizada!\n");
        }
    }

    public VentanaPrincipal() throws HeadlessException {
        setLayout( new BorderLayout());
        setPreferredSize(new Dimension(800,600));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setTitle("T227 - Programacion");
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        //Agregar componentes
        start = new JButton("Start");
        start.setActionCommand("start");
        start.addActionListener(this);

        progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true);

        texto = new JTextArea(5, 20);
        texto.setMargin(new Insets(5,5,5,5));
        texto.setEditable(false);

        JPanel panel = new JPanel();
        panel.add(start);
        panel.add(progressBar);

        add(panel, BorderLayout.PAGE_START);
        add(new JScrollPane(texto), BorderLayout.CENTER);
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        start.setEnabled(false);
        setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        //Las instancias de SwingWorker no son reusables por eso tenemos que volver a crear una instancia.
        tarea = new Tarea();
        tarea.addPropertyChangeListener(this);
        tarea.execute();
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("progress" == evt.getPropertyName()) {
            int progress = (Integer) evt.getNewValue();
            progressBar.setValue(progress);
            texto.append(String.format(
                    "Completado %d%% de la instalación.\n", tarea.getProgress()));
        }
    }
}
