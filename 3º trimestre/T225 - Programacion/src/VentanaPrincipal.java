import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {

    JLabel usuario;
    JLabel pass;
    JTextField usuarioTex;
    JPasswordField passTex;
    JCheckBox mostrar;
    JButton entrar;



    public VentanaPrincipal() throws HeadlessException {

        //Caracteristicas
        setTitle("Acceso a Séneca");
        setSize(230,280);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        this.getContentPane().setLayout(new GridBagLayout());

        //Añadir Componentes

        usuario = new JLabel("Nombre usuario");
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
        constraints.weighty = 1.0;
        constraints.insets = new Insets(20,10,0,0);
        this.getContentPane().add(usuario,constraints);
        constraints.weighty = 0.0;

        usuarioTex = new JTextField(13);
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 6;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weighty = 1.0;
        constraints.insets = new Insets(0,10,0,10);
        this.getContentPane().add(usuarioTex,constraints);
        constraints.weighty = 0.0;

        pass = new JLabel("Contraseña");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 2;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
        constraints.weighty = 1.0;
        constraints.insets = new Insets(0,0,0,0);
        this.getContentPane().add(pass,constraints);
        constraints.weighty = 0.0;

        passTex = new JPasswordField(13);
        constraints.gridx = 0;
        constraints.gridy = 4;
        constraints.gridwidth = 6;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weighty = 1.0;
        constraints.insets = new Insets(0,10,0,10);
        this.getContentPane().add(passTex,constraints);
        constraints.weighty = 0.0;

        mostrar = new JCheckBox("Mostrar contraseña");
        mostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (mostrar.isSelected()) {
                    passTex.setEchoChar((char)0);
                } else {
                    passTex.setEchoChar('•');
                }
            }
        });
        constraints.gridx = 0;
        constraints.gridy = 5;
        constraints.gridwidth = 3;
        constraints.gridheight = 1;
        constraints.insets = new Insets(0,10,0,0);
        constraints.fill = GridBagConstraints.BOTH;
        this.getContentPane().add(mostrar,constraints);

        entrar = new JButton("Entrar");
        constraints.gridx = 2;
        constraints.gridy = 6;
        constraints.gridwidth = 3;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.NONE;
        constraints.insets = new Insets(20,20,80,20);
        this.getContentPane().add(entrar,constraints);


    }
}
