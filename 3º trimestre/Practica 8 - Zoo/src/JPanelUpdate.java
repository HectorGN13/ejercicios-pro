import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JPanelUpdate extends JPanel {

    private JTable tabla;
    private JPanel formulario;
    private JTextField campoAlias;
    private JTextField campoPeso;
    private ButtonGroup generoGroup;

    public JPanelUpdate() {
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

        JButton actualizar = new JButton("Actualizar datos");

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

        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.anchor = GridBagConstraints.LINE_END;
        constraints.insets = new Insets(20,0,0,5);
        formulario.add(actualizar,constraints);


//        actualizar.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent actionEvent) {
//                actualizarDatos();
//                mostrarDatos();
//            }
//        });

        tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                int filaSeleccionada = tabla.getSelectedRow();

                campoAlias.setText(tabla.getValueAt(filaSeleccionada,1).toString());

                String sexo = tabla.getValueAt(filaSeleccionada,2).toString();
                if (sexo.equals("V")) masculinoRadio.setSelected(true);
                else femeninoRadio.setSelected(true);

                campoPeso.setText(tabla.getValueAt(filaSeleccionada,3).toString());
                actualizar.setEnabled(true);
            }
        });

//        mostrarDatos();

        //Agregamos componentes
        add(new JScrollPane(tabla),BorderLayout.CENTER);
        add(formulario,BorderLayout.SOUTH);
    }
/*
    public void actualizarDatos() {

        Connection con = BDUtil.conectar();
        String sql = "UPDATE animales SET alias=? , sexo=? , peso=? WHERE id =? ";
            int filaSeleccionada = tabla.getSelectedRow();
            String id = (String) tabla.getValueAt(filaSeleccionada,0);

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,campoAlias.getText());
            ps.setString(2,generoGroup.getSelection().getActionCommand());
            ps.setInt(3, Integer.parseInt(campoPeso.getText()));
            ps.setInt(4, Integer.parseInt(id));

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"El registro se actualizo correctamente");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Error al modificar la base de datos: "+e.getMessage());

        }


        mostrarDatos();

    }

    public void mostrarDatos() {
        Connection con = BDUtil.conectar();
        String[] titulos = {"ID","ALIAS","SEXO","PESO"};
        String[] elementos = new String[4];
        String sql = "SELECT * FROM animales";
        DefaultTableModel model = new DefaultTableModel(null, titulos);

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())  {

                elementos[0] = rs.getString("id");
                elementos[1] = rs.getString("alias");
                elementos[2] = rs.getString("sexo");
                elementos[3] = rs.getString("peso");

                model.addRow(elementos);
            }

            tabla.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error al insertar un registro: " +
                    " "+e.getMessage());
        }
    }*/

}
