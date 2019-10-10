import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class JPanelInsert extends JPanel {

    private JTable tabla;
    private JPanel formulario;
    private JTextField campoAlias;
    private JTextField campoPeso;
    private ButtonGroup generoGroup;


    public JPanelInsert() {
        setLayout(new BorderLayout());

        //Creamos componentes
        tabla = new JTable();
        tabla.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
        formulario = new JPanel();

        //Personalizamos componentes

        Border interior = BorderFactory.createTitledBorder("Insertar Animales");
        Border exterior = BorderFactory.createEmptyBorder(15,15,15,15);
        formulario.setBorder(BorderFactory.createCompoundBorder(exterior, interior));
        //formulario.setBackground(new Color(196, 223,232));
        formulario.setLayout(new GridBagLayout());

        JLabel alias = new JLabel("Alias: ");
        JLabel sexo = new JLabel("Sexo: ");
        JLabel peso = new JLabel("Id: ");

        JRadioButton masculinoRadio = new JRadioButton("V");
        masculinoRadio.setActionCommand("V");
        masculinoRadio.setSelected(true);
        JRadioButton femeninoRadio = new JRadioButton("F");
        femeninoRadio.setActionCommand("F");
        generoGroup = new ButtonGroup();
        generoGroup.add(masculinoRadio);
        generoGroup.add(femeninoRadio);

        JButton insertar = new JButton("Insertar");
        JButton actualizar = new JButton("Actualizar");

        campoAlias = new JTextField(20);
        campoPeso = new JTextField(20);

        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0; //Columna
        constraints.gridy = 0; //Fila
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.insets = new Insets(10,0,0,0);
        formulario.add(alias,constraints);

        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.insets = new Insets(10,0,0,0);
        formulario.add(campoAlias,constraints);

        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.insets = new Insets(10,0,0,0);
        formulario.add(peso,constraints);

        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        formulario.add(campoPeso,constraints);

        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.insets = new Insets(0,0,0,0);
        formulario.add(sexo,constraints);

        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        formulario.add(masculinoRadio,constraints);

        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        formulario.add(femeninoRadio,constraints);

        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.anchor = GridBagConstraints.LINE_START;
        constraints.insets = new Insets(20,0,0,5);
        formulario.add(insertar,constraints);

        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.anchor = GridBagConstraints.LINE_END;
        constraints.insets = new Insets(20,0,0,5);
        formulario.add(actualizar,constraints);

        insertar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                insertarDatos();
            }
        });

        actualizar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mostrarDatos();
            }
        });

        mostrarDatos();

        //Agregamos componentes
        add(new JScrollPane(tabla),BorderLayout.CENTER);
        add(formulario,BorderLayout.SOUTH);
    }

    public void insertarDatos() {

        Connection con = BDUtil.conectar();
        String sql = "INSERT INTO animals(id, alias, sexo) VALUES(?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(2,campoAlias.getText());
            ps.setString(3,generoGroup.getSelection().getActionCommand());
            ps.setInt(1, Integer.parseInt(campoPeso.getText()));
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Se inserto correctamente");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Error al insertar en la base de datos"+e.getMessage());

        }

        mostrarDatos();

    }

    public void mostrarDatos() {
        Connection con = BDUtil.conectar();
        String[] titulos = {"ID","ALIAS","SEXO"};
        String[] elementos = new String[3];
        String sql = "SELECT * FROM animals";
        DefaultTableModel model = new DefaultTableModel(null, titulos);

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())  {

                elementos[0] = rs.getString("id");
                elementos[1] = rs.getString("alias");
                elementos[2] = rs.getString("sexo");
                //elementos[3] = rs.getString("peso");

                model.addRow(elementos);
            }

            tabla.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al insertar un registro: " +
                    " "+e.getMessage());
        }
    }
}
