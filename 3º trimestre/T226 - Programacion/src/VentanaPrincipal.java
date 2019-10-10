import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class VentanaPrincipal extends JFrame {



    //Izquierda
    private JPanel panelIzquierdo;
    private JLabel etiqueta1;
    private JList<String> listIzquierda;
    private DefaultListModel<String> modeloIzquierda;

    //Derecha
    private JPanel panelDerecho;
    private JLabel etiqueta2;
    private JList<String> listDerecha;
    private DefaultListModel modeloDerecha;

    //Centro
    private JPanel panelBotones;
    private JButton agregar;
    private JButton quitar;
    private JButton agregarTodos;
    private JButton quitarTodos;


    public VentanaPrincipal() throws HeadlessException {

        setLayout(new GridLayout(1,3));
        setTitle("T226 - Programacion");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setSize(800,600);
        setLocationRelativeTo(null);

        //Organizando componentes.
        organizarComponentes();

        //inicializar
        add(panelIzquierdo);
        add(panelBotones);
        add(panelDerecho);

    }

    private void organizarComponentes(){

        //PANEL IZQUIERDO
        modeloIzquierda = new DefaultListModel<>();
        modeloIzquierda.addElement("Garcia Nuñez, Hector");
        modeloIzquierda.addElement("Pacheco Jimenez, Juan");
        modeloIzquierda.addElement("Barra Balao, Eduardo");
        modeloIzquierda.addElement("Buzon Hernandez, Luisa");
        modeloIzquierda.addElement("Perez Galo, Maria");


        panelIzquierdo = new JPanel();
        panelIzquierdo.setLayout(new BorderLayout());
        etiqueta1 = new JLabel("Alumnos/as candidatos/as");
        listIzquierda = new JList<>(modeloIzquierda);
        listIzquierda.setVisibleRowCount(3);
        listIzquierda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        panelIzquierdo.add(etiqueta1, BorderLayout.NORTH);
        panelIzquierdo.add(new JScrollPane(listIzquierda), BorderLayout.CENTER);
        panelIzquierdo.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.gray),
                BorderFactory.createEmptyBorder(20,20,20,20)));


        //PANEL CENTRAL
        agregar = new JButton("AGREGAR");
        agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = listIzquierda.getSelectedIndex();
                modeloDerecha.addElement(listIzquierda.getSelectedValue());
                modeloIzquierda.remove(index);

                int size = modeloIzquierda.getSize();

                if (size == 0) {
                    agregar.setEnabled(false);
                    quitar.setEnabled(true);

                } else {
                    if (index == modeloIzquierda.getSize()) {
                        index--;
                    }
                    quitar.setEnabled(true);
                    listIzquierda.setSelectedIndex(index);
                    listIzquierda.ensureIndexIsVisible(index);
                    quitarTodos.setEnabled(true);
                }
            }
        });

        quitar = new JButton("QUITAR");
        quitar.setEnabled(false);
        quitar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = listDerecha.getSelectedIndex();
                modeloIzquierda.addElement(listDerecha.getSelectedValue());
                modeloDerecha.remove(index);

                int size = modeloDerecha.getSize();

                if (size == 0) {
                    quitar.setEnabled(false);
                    agregar.setEnabled(true);

                } else {
                    if (index == modeloDerecha.getSize()) {
                        index--;
                    }
                    agregar.setEnabled(true);
                    listDerecha.setSelectedIndex(index);
                    listDerecha.ensureIndexIsVisible(index);
                    agregarTodos.setEnabled(true);
                }
            }
        });


        agregarTodos = new JButton("AGREGAR TODOS");
        agregarTodos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < modeloIzquierda.getSize(); i++) {
                    modeloDerecha.addElement(modeloIzquierda.elementAt(i));
                }

                modeloIzquierda.clear();
                agregar.setEnabled(false);
                quitar.setEnabled(true);
                agregarTodos.setEnabled(false);
                quitarTodos.setEnabled(true);
            }
        });

        quitarTodos = new JButton("QUITAR TODOS");
        quitarTodos.setEnabled(false);
        quitarTodos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < modeloDerecha.getSize(); i++) {
                    modeloIzquierda.addElement((String) modeloDerecha.elementAt(i));
                }

                modeloDerecha.clear();
                agregar.setEnabled(true);
                quitar.setEnabled(false);
                quitarTodos.setEnabled(false);
                agregarTodos.setEnabled(true);
            }
        });

        panelBotones = new JPanel();
        panelBotones.setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();

        //BOTON AGREGAR
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 0.2;
        constraints.weightx = 0.2;
        constraints.insets = new Insets(150,50,0,50);
        panelBotones.add(agregar,constraints);
        constraints.weighty = 0.0;
        constraints.weightx = 0.0;
        //BOTON QUITAR
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 0.2;
        constraints.weightx = 0.2;
        constraints.insets = new Insets(10,50,10,50);
        panelBotones.add(quitar,constraints);
        constraints.weighty = 0.0;
        constraints.weightx = 0.0;
        //BOTON AGREGAR TODOS
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 0.2;
        constraints.weightx = 0.2;
        panelBotones.add(agregarTodos,constraints);
        constraints.weighty = 0.0;
        constraints.weightx = 0.0;
        //BOTON QUITAR TODOS
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 0.2;
        constraints.weightx = 0.2;
        constraints.insets = new Insets(0,50,150,50);
        panelBotones.add(quitarTodos,constraints);
        constraints.weighty = 0.0;
        constraints.weightx = 0.0;

        //PANEL DERECHO

        modeloDerecha = new DefaultListModel();
        panelDerecho = new JPanel();
        panelDerecho.setLayout(new BorderLayout());
        etiqueta2 = new JLabel("Alumnos/as seleccionados/as");
        listDerecha = new JList<>(modeloDerecha);
        listDerecha.setVisibleRowCount(3);
        listDerecha.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        panelDerecho.add(etiqueta2, BorderLayout.NORTH);
        panelDerecho.add(new JScrollPane(listDerecha), BorderLayout.CENTER);
        panelDerecho.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.gray),
                BorderFactory.createEmptyBorder(20,20,20,20)));
    }
}
