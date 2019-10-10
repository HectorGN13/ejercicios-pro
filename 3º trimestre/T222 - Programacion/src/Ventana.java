import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {

    public Ventana() {

        super ("Ejemplo 1");        // El título
        setVisible(true);
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout (new GridBagLayout()); // Le ponemos el GridBagLayout

        JTextArea areaTexto = new JTextArea("Area texto");
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0; // El área de texto empieza en la columna cero.
        constraints.gridy = 0; // El área de texto empieza en la fila cero
        constraints.gridwidth = 2; // El área de texto ocupa dos columnas.
        constraints.gridheight = 2; // El área de texto ocupa 2 filas.
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 1.0; // La fila 0 debe estirarse, le ponemos un 1.0
        this.getContentPane().add (areaTexto, constraints);
        constraints.weighty = 0.0; // Restauramos al valor por defecto, para no afectar a los siguientes componentes.

        JButton boton1 = new JButton ("Boton 1");
        constraints.gridx = 2;
        constraints.gridy = 0;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weighty = 1.0; /* La fila 0 debe estirarse, le ponemos un 1.0. Ya lo hicimos en el area de texto, pero aquí debemos ser coherentes y poner lo mismo.*/
        constraints.anchor = GridBagConstraints.NORTH;
        constraints.fill = GridBagConstraints.NONE;
        this.getContentPane().add (boton1, constraints);
        constraints.anchor = GridBagConstraints.CENTER;
        constraints.weighty = 0.0; // Restauramos al valor por defecto, para no afectar a los siguientes componentes.

        JButton boton2 = new JButton ("Boton 2");
        constraints.gridx = 2;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weighty = 1.0; // La fila 1 debe estirarse, le ponemos 1.0
        // El boton 2 debe ocupar la posición NORTH de su celda.
        constraints.anchor = GridBagConstraints.NORTH;
        this.getContentPane().add (boton2, constraints);
        constraints.weighty = 0.0; // Restauramos el valor por defecto.
        constraints.anchor = GridBagConstraints.CENTER;

        JButton boton3 = new JButton ("Boton 3");
        constraints.gridx = 0;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.getContentPane().add (boton3, constraints);

        JButton boton4 = new JButton ("Boton 4");
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        this.getContentPane().add (boton4, constraints);

        JTextField campoTexto = new JTextField ("Campo texto");
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0; // La columna 1 debe estirarse, ponemos el 1.0 en weigthx
        // El campo de texto debe estirarse sólo en horizontal.
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weighty = 0.0; // Restauramos el valor por defecto.
        this.getContentPane().add (campoTexto, constraints);

        JTextArea areaTexto2 = new JTextArea("Area texto");
        constraints.gridx = 3; // El área de texto empieza en la columna cero.
        constraints.gridy = 0; // El área de texto empieza en la fila cero
        constraints.gridwidth = 1; // El área de texto ocupa 1 columna1.
        constraints.gridheight = 2; // El área de texto ocupa 2 filas.
        constraints.fill = GridBagConstraints.BOTH;
        constraints.weighty = 1.0; // La fila 0 debe estirarse, le ponemos un 1.0
        this.getContentPane().add (areaTexto2, constraints);
        constraints.weighty = 0.0; // Restauramos al valor por defecto, para no afectar a los siguientes componentes.

        JButton boton5 = new JButton ("Boton 5");
        constraints.gridx = 3;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.weightx = 1.0;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.weighty = 0.0;
        this.getContentPane().add (boton5, constraints);
    }
}
