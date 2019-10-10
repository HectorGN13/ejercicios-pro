import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ventana extends JFrame {


    JPanel panelCentral;
    PanelBotones panelBotonesNumeros;
    PanelApuestaMultiple panelApuestaMultiple;
    int contadorClicks = 0;


    public void setContadorClicks(int contadorClicks) {
        this.contadorClicks = contadorClicks;
    }

    public Ventana() throws HeadlessException {
        //Configuramos la ventana
        setTitle("LA PRIMITIVA -- Loterias del Estado.");
        setVisible(true);
        setSize(500,800);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


        //Creamos el panel de botones.
        panelBotonesNumeros = new PanelBotones();

        //Creamos el panel central.
        panelCentral = new JPanel();
        panelCentral.setLayout(new BorderLayout());

        //Creamos los componentes del panel central.

        ////////////////PANEL APUESTA MULTIPLE//////////////
        panelApuestaMultiple = new PanelApuestaMultiple();
        panelBotonesNumeros.setTextListener(new StringListener() {
            @Override
            public void textEmitted(String text) {
                if (contadorClicks < 6 ){
                panelApuestaMultiple.getNumeros().get(contadorClicks).setText(text);
                contadorClicks++;
                } else if (contadorClicks == 6){
                    panelApuestaMultiple.getComplementario().setText(text);
                    contadorClicks++;
                }
                repaint();
                revalidate();
            }
        });

        ////////////////PANEL REINTEGRO////////////////////
        JPanel panelReintegro = new JPanel();
        panelReintegro.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(),"Reintegro", TitledBorder.CENTER, TitledBorder.ABOVE_TOP, new java.awt.Font("Calibri", 1, 20), new java.awt.Color(1, 1, 1)));
        JComboBox reintegro = new JComboBox();
        for (int i = 0; i < 10; i++) {
            reintegro.addItem(i+"");
        }
        //reintegro.setBackground(Color.WHITE);
        reintegro.setBounds(10,10,80,20);
        reintegro.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.BLACK),BorderFactory.createEmptyBorder(10,20,10,20)));
        panelReintegro.add(reintegro);
        ////////////////PANEL BOTONES////////////////////
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new FlowLayout(FlowLayout.LEFT));
        JButton botonAceptar = new JButton("Enviar");
        botonAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        JButton botonBorrar = new JButton("Borrar");
        botonBorrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelApuestaMultiple.getComplementario().setText(null);
                for (JTextField apuesta: panelApuestaMultiple.getNumeros()) {
                    apuesta.setText(null);
                }
                reintegro.setSelectedIndex(0);
                for (JButton boton:panelBotonesNumeros.getBotones()){
                    boton.setEnabled(true);
                    boton.setBackground(new Color(107, 176, 107));
                }
                repaint();
                revalidate();
                contadorClicks = 0;

            }
        });
        panelBotones.setLayout(new FlowLayout());
        panelBotones.add(botonAceptar);
        panelBotones.add(botonBorrar);

        //Añadimos los componenetes al panel central.
        panelCentral.add(panelApuestaMultiple,BorderLayout.CENTER);
        panelCentral.add(panelReintegro,BorderLayout.EAST);
        JButton fantasma = new JButton();
        fantasma.setPreferredSize(new Dimension(20,30));
        fantasma.setBorderPainted(false);
        fantasma.setEnabled(false);
        panelCentral.add(fantasma, BorderLayout.NORTH);
        panelCentral.add(panelBotones, BorderLayout.SOUTH);

        //Añadimos la barra de menu.
        setJMenuBar(new BarraMenu());
        //Añadimos el panel con la imagen.
        add(new JpanelConFondo("logo-primitiva.png"),BorderLayout.NORTH);
        //Añadimos el panel de botones.
        add(panelBotonesNumeros,BorderLayout.SOUTH);
        //Añadimos el panel central.
        add(panelCentral, BorderLayout.CENTER);



    }



}
