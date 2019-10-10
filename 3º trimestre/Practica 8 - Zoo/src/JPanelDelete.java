import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.*;

public class JPanelDelete extends JPanel {
    private JTable tabla;
    private JPanel formulario;
    private JButton borrar;
    private JButton ordenar;


    public JPanelDelete() {
        setLayout(new BorderLayout());

        tabla = new JTable();
        formulario = new JPanel();


        Border exterior = BorderFactory.createEmptyBorder(15,15,15,15);
        setBorder(exterior);

        add(formulario, BorderLayout.SOUTH);
        add(new JScrollPane(tabla),BorderLayout.CENTER);

        borrar = new JButton("Borrar");
        ordenar = new JButton("Ordenar");

        formulario.add(borrar);
        formulario.add(ordenar);

        borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                eliminarDatos();
                mostrarDatos();
            }
        });

        ordenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ordenaDatos();
            }
        });

        tabla.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent event) {
                int filaSeleccionada = tabla.getSelectedRow();
                borrar.setEnabled(true);
            }
        });


        mostrarDatos();
    }

    public void eliminarDatos() {

        Connection con = BDUtil.conectar();
        String sql = "DELETE FROM animals WHERE id=? ";
        try {
            int filaSeleccionada = tabla.getSelectedRow();
            String id = (String) tabla.getValueAt(filaSeleccionada, 0);

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, Integer.parseInt(id));

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "El registro se elimino correctamente");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al modificar la base de datos: " + e.getMessage());

        }

        mostrarDatos();
    }

    public void mostrarDatos() {
        Connection con = BDUtil.conectar();
        String[] titulos = {"ID","ALIAS","SEXO"};
        String[] elementos = new String[4];
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
            JOptionPane.showMessageDialog(null,"Error al actualizar los datos"+e.getMessage());
        }
    }


    public void ordenaDatos() {
        Connection con = BDUtil.conectar();
        String[] titulos = {"ID","ALIAS","SEXO"};
        String[] elementos = new String[3];
        String sql = "SELECT * FROM animals ORDER BY id";
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
            JOptionPane.showMessageDialog(null,"Error al actualizar los datos"+e.getMessage());
        }
    }


}
