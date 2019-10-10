import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class InicioSesion extends JDialog {

    private ICuenta cuenta;
    private JButton jButtonConectar;
    private JButton jButtonCancelar;
    private JLabel jLabelTitulo;
    private JLabel usuario;
    private JLabel contrasenia;
    private JLabel jLabelCerrar;
    private JLabel jLabelMin;
    private JLabel jLabelValidacion;
    private JPanel jPanel1;
    private JPanel fondo;
    private JPasswordField jPasswordField1;
    private JTextField jTextField1;

    public InicioSesion(Frame owner, String title, boolean modal) throws HeadlessException {
        super(owner, title, modal);
        inicializarComponentes();
        setVisible(true);
        setLocationRelativeTo(null);

    }

    private void inicializarComponentes() {

        jPanel1 = new JPanel();
        jLabelCerrar = new JLabel();
        jLabelTitulo = new JLabel();
        jLabelMin = new JLabel();
        fondo = new JPanel();
        usuario = new JLabel();
        contrasenia = new JLabel();
        jTextField1 = new JTextField();
        jPasswordField1 = new JPasswordField();
        jButtonConectar = new JButton();
        jButtonCancelar = new JButton();
        jLabelValidacion = new JLabel();

        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(248, 148, 6));

        jLabelCerrar.setFont(new Font("Tahoma", 1, 24)); // NOI18N
        jLabelCerrar.setForeground(new Color(255, 255, 255));
        jLabelCerrar.setText("X");
        jLabelCerrar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jLabelCerrar.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                cerrar(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Iniciar sesion");

        jLabelMin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                minimizar(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);

        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelMin)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelCerrar)
                                .addGap(21, 21, 21))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jLabelTitulo)
                                        .addContainerGap(236, Short.MAX_VALUE)))
        );

        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabelMin, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                                        .addComponent(jLabelCerrar))
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabelTitulo, GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                        .addContainerGap()))
        );

        fondo.setBackground(new Color(44, 62, 80));

        usuario.setFont(new Font("Tahoma", 0, 15));
        usuario.setForeground(new Color(236, 240, 241));
        usuario.setText("Usuario:");

        contrasenia.setFont(new Font("Tahoma", 0, 15));
        contrasenia.setForeground(new Color(236, 240, 241));
        contrasenia.setText("Contraseña:");

        jTextField1.setBackground(new Color(108, 122, 137));
        jTextField1.setFont(new Font("Tahoma", 0, 14));
        jTextField1.setForeground(new Color(228, 241, 254));

        jPasswordField1.setBackground(new Color(108, 122, 137));
        jPasswordField1.setFont(new Font("Tahoma", 0, 14));
        jPasswordField1.setForeground(new Color(228, 241, 254));

        jButtonConectar.setBackground(new Color(34, 167, 240));
        jButtonConectar.setFont(new Font("Tahoma", 1, 11));
        jButtonConectar.setForeground(new Color(255, 255, 255));
        jButtonConectar.setText("Conectar");
        jButtonConectar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (!(cuenta.validar(jTextField1.getText(), jPasswordField1.getSelectedText()))) {
                    jLabelValidacion.setText("La validación del usuario\nno ha sido correcta.\nPor favor, inténtelo de nuevo");
                } else {
                    cerrar(e);
                }
            }
        });

        jButtonCancelar.setBackground(new Color(242, 38, 19));
        jButtonCancelar.setFont(new Font("Tahoma", 1, 11));
        jButtonCancelar.setForeground(new Color(255, 255, 255));
        jButtonCancelar.setText("Cancelar");

        jLabelValidacion.setFont(new Font("Tahoma", 0, 9)); // NOI18N
        jLabelValidacion.setForeground(new Color(255, 4, 25));
        jLabelValidacion.setText("");

        GroupLayout fondoLayout = new GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
                fondoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(fondoLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(fondoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(fondoLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addGroup(fondoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(fondoLayout.createSequentialGroup()
                                                                .addComponent(contrasenia, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPasswordField1))
                                                        .addGroup(fondoLayout.createSequentialGroup()
                                                                .addComponent(usuario, GroupLayout.PREFERRED_SIZE, 92, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 188, GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(fondoLayout.createSequentialGroup()
                                                        .addComponent(jButtonCancelar, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(26, 26, 26)
                                                        .addComponent(jButtonConectar, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(fondoLayout.createSequentialGroup()
                                                .addGap(76, 76, 76)
                                                .addComponent(jLabelValidacion)))
                                .addContainerGap(59, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
                fondoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(fondoLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addGroup(fondoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(usuario)
                                        .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(fondoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addComponent(contrasenia)
                                        .addComponent(jPasswordField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(fondoLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonConectar, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonCancelar, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabelValidacion)
                                .addContainerGap(22, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fondo, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(fondo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }


    private void cerrar(MouseEvent evt) { System.exit(0); }

    private void minimizar(MouseEvent evt) { //this.setState(JFrame.ICONIFIED);
    }

    public void setCuenta(ICuenta cuenta) {
        this.cuenta = cuenta;
    }


}
