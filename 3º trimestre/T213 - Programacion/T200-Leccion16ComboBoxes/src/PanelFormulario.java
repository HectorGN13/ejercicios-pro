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
    private JComboBox combo;




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
        combo = new JComboBox();


        ////////////////// LIST BOX /////////////////////////////////////////////
        DefaultListModel modeloEdad = new DefaultListModel();
        modeloEdad.addElement(new CategoriaEdad(0, "Menos de 18"));
        modeloEdad.addElement(new CategoriaEdad(1, "18 a 65"));
        modeloEdad.addElement(new CategoriaEdad(2, "Más de 65"));
        listaEdad.setModel(modeloEdad);

        listaEdad.setPreferredSize(new Dimension(150, 70));
        listaEdad.setBorder(BorderFactory.createEtchedBorder());
        listaEdad.setSelectedIndex(1); // obliga a seleccionar 1 , selecciona uno por defeecto

        ///////////// COMBO BOX (Lista Desplegable)////////////////////////
        DefaultComboBoxModel modeloEmp = new DefaultComboBoxModel();
        modeloEmp.addElement("Empleado");
        modeloEmp.addElement("Desempleado");
        modeloEmp.addElement("Jubilado");
        combo.setModel(modeloEmp);
        combo.setSelectedIndex(0);
        combo.setEditable(true); // permite editar de la lista



        btnEnviar = new JButton("Enviar");


        btnEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            String nombre = nombreField.getText();
            String puesto = puestoField.getText();
            CategoriaEdad edad = (CategoriaEdad) listaEdad.getSelectedValue();
            String catEmple = (String) combo.getSelectedItem();

                System.out.println(edad.getId());

            EventoFormulario evento = new EventoFormulario(this, nombre, puesto, edad.getId(), catEmple.getCategoriaEmp());

            if (receptor != null)
              receptor.formEventOccurred(evento);
            }
        });

        componentesLayout();


    }

    public void componentesLayout(){

        setLayout(new GridBagLayout());
        GridBagConstraints g = new GridBagConstraints();



        ///////////////////Primera fila/////////////////////
        g.gridy = 0;

        g.weightx = 1;
        g.weighty = 0.1;

        g.gridx = 0;

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
        g.gridy++;
        g.weightx = 1;
        g.weighty = 0.1;


        g. gridx = 0;
        g.insets = new Insets(0,0,0,5);
        g.anchor = GridBagConstraints.LINE_END;
        add(puestoLabel, g);

        g. gridx = 1;
        g.insets = new Insets(0,0,0,0);
        g.anchor = GridBagConstraints.LINE_START;
        add(puestoField, g);
        ///////////////////Tercera fila/////////////////////
        g.gridy++;
        g.weightx = 1;
        g.weighty = 0.2;

        g. gridx = 0;
        g.insets = new Insets(0,0,0,5);
        g.anchor = GridBagConstraints.FIRST_LINE_END; //lo coloca en la primera linea de la lista y final de su espacio
        add(new JLabel("Edad: "), g);


        g. gridx = 1;
        g.anchor = GridBagConstraints.FIRST_LINE_START;
        g.insets = new Insets(0,0,0,0);
        add(listaEdad, g);

        ///////////////////Siguiente fila/////////////////////
        g.gridy++;
        g.weightx = 1;
        g.weighty = 0.2;

        g. gridx = 0;
        g.insets = new Insets(0,0,0,5);
        g.anchor = GridBagConstraints.FIRST_LINE_END; //lo coloca en la primera linea de la lista y final de su espacio
        add(new JLabel("Empleado: "), g);


        g. gridx = 1;
        g.anchor = GridBagConstraints.FIRST_LINE_START;
        g.insets = new Insets(0,0,0,0);
        add(combo, g);

        ///////////////////Siguiente fila/////////////////////
        g.gridy++;
        g.weightx = 1;
        g.weighty = 2.0;


        g. gridx = 1;
        g.anchor = GridBagConstraints.FIRST_LINE_START;
        g.insets = new Insets(0,0,0,0);
        add(btnEnviar, g);

    }

    public void setReceptorFormulario(ReceptorFormulario receptor) {
        this.receptor = receptor;
    }
}


 class CategoriaEdad {
    private int id;
    private String texto;

     @Override
     public String toString() {
         return texto;
     }

     public CategoriaEdad(int id, String texto) {
        this.id=id;
        this.texto=texto;
    }

     public int getId() {
         return id;
     }

     public String getTexto() {
         return texto;
     }
 }
