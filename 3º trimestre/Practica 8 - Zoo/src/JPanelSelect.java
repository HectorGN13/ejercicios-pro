import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JPanelSelect extends JPanel {
    private JTable tabla;
    private JPanel formulario;
    private Connection con = BDUtil.conectar();
    private JButton refresh;
    private JButton ordenar;

    public JPanelSelect() {
        setLayout(new BorderLayout());
        tabla = new JTable();
        formulario = new JPanel();



        Border exterior = BorderFactory.createEmptyBorder(15,15,15,15);
        setBorder(exterior);

        refresh = new JButton("Actualizar");
        ordenar = new JButton("Ordenar");

        formulario.add(refresh);
        formulario.add(ordenar);

        refresh.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                mostrarDatos();
            }
        });

        ordenar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //ordenaDatos();
            }
        });



        add(formulario,BorderLayout.SOUTH);
        add(new JScrollPane(tabla),BorderLayout.CENTER);


        mostrarDatos();
    }

    public void mostrarDatos() {
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
               // elementos[3] = rs.getString("peso");

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
