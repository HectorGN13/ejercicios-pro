import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelFormulario extends JPanel {

    private JLabel nombreLabel;
    private JLabel puestoLabel;
    private JTextField nombreField;
    private JTextField puestoField;
    private JButton btnEnviar;
    private ReceptorFormulario receptor;
    private JList listaEdad;


    public PanelFormulario() {

        Dimension d = getPreferredSize();
        d.width = 300;
        setPreferredSize(d);

        Border interior = BorderFactory.createTitledBorder("Añadir Clientes");
        Border exterior = BorderFactory.createEmptyBorder(5,5,5,5);
        //setBackground(Color.darkGray);
        setBorder(BorderFactory.createCompoundBorder(exterior, interior)); // importante el orden, no afecta los margenes!!!

        nombreLabel = new JLabel("Nombre: ");
        puestoLabel = new JLabel("Puesto: ");
        nombreField = new JTextField(16);
        puestoField = new JTextField(16);
        listaEdad = new JList();

        DefaultListModel modeloEdad = new DefaultListModel();
        modeloEdad.addElement("Menos de 18");
        modeloEdad.addElement("18 - 65");
        modeloEdad.addElement("Más de 65");
        listaEdad.setModel(modeloEdad);

        listaEdad.setPreferredSize(new Dimension(150, 70));
        listaEdad.setBorder(BorderFactory.createEtchedBorder());
        listaEdad.setSelectedIndex(1); // obliga a seleccionar 1 , selecciona uno por defeecto

        btnEnviar = new JButton("Enviar");


        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String nombre = nombreField.getText();
            String puesto = puestoField.getText();
            String edad = (String) listaEdad.getSelectedValue();

            System.out.println(edad);

            EventoFormulario evento = new EventoFormulario(this, nombre, puesto);

            if (receptor != null)
              receptor.formEventOccurred(evento);
            }
        });


        setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();



        ///////////////////Primera fila/////////////////////

        g.weightx = 1;
        g.weighty = 0.1;

        g.gridx = 0;
        g.gridy = 0;
        g.fill = GridBagConstraints.NONE;
        g.insets = new Insets(0,0,0,5);
        g.anchor = GridBagConstraints.LINE_END;
        add(nombreLabel, g);

        g.gridx = 1;
        g. gridy = 0;
        g.insets = new Insets(0,0,0,0);
        g.anchor = GridBagConstraints.LINE_START;
        add(nombreField, g);
        ///////////////////Segunada fila/////////////////////

        g.weightx = 1;
        g.weighty = 0.1;

        g.gridy = 1;
        g. gridx = 0;
        g.insets = new Insets(0,0,0,5);
        g.anchor = GridBagConstraints.LINE_END;
        add(puestoLabel, g);

        g.gridy = 1;
        g. gridx = 1;
        g.insets = new Insets(0,0,0,0);
        g.anchor = GridBagConstraints.LINE_START;
        add(puestoField, g);
        ///////////////////Tercera fila/////////////////////

        g.weightx = 1;
        g.weighty = 0.2;

        g.gridy = 2;
        g. gridx = 1;
        g.anchor = GridBagConstraints.FIRST_LINE_START;
        g.insets = new Insets(0,0,0,0);
        add(listaEdad, g);

        ///////////////////Cuarta fila/////////////////////

        g.weightx = 1;
        g.weighty = 2.0;

        g.gridy = 3;
        g. gridx = 1;
        g.anchor = GridBagConstraints.FIRST_LINE_START;
        g.insets = new Insets(0,0,0,0);
        add(btnEnviar, g);

    }

    public void setReceptorFormulario(ReceptorFormulario receptor) {
        this.receptor = receptor;
    }
}

