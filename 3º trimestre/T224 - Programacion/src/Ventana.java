import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerEvent;
import java.awt.event.ContainerListener;
import java.util.ArrayList;

public class Ventana extends JFrame implements ContainerListener, ActionListener {

    JTextArea areaTexto;
    JPanel buttonPanel;
    JButton addButton, removeButton, clearButton;
    ArrayList<JButton> buttonList;

    static final String ADD = "Añadir";
    static final String REMOVE = "Borrar";
    static final String CLEAR = "Limpiar";


    public Ventana() throws HeadlessException {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,600);
        setVisible(true);
        this.getContentPane().setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();

        //Inicializar una list de buttons.
        buttonList = new ArrayList<JButton>();

        //Creamos todos los componentes.
        addButton = new JButton("Añadir un Boton");
        addButton.setActionCommand(ADD);
        addButton.addActionListener(this);

        removeButton = new JButton("Borrar un Boton");
        removeButton.setActionCommand(REMOVE);
        removeButton.addActionListener(this);

        buttonPanel = new JPanel(new GridLayout(1,1));
        buttonPanel.setPreferredSize(new Dimension(200, 75));
        buttonPanel.addContainerListener(this);

        areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(areaTexto);
        scrollPane.setPreferredSize(new Dimension(200, 75));

        clearButton = new JButton("Limpiar");
        clearButton.setActionCommand(CLEAR);
        clearButton.addActionListener(this);

        c.fill = GridBagConstraints.BOTH;
        c.weighty = 1.0;
        c.gridwidth = GridBagConstraints.REMAINDER;
        this.getContentPane().add(scrollPane, c);
        add(scrollPane);

        c.weighty = 0.0;
        this.getContentPane().add(clearButton, c);
        add(clearButton);

        c.weightx = 1.0;
        c.gridwidth = 1;
        this.getContentPane().add(addButton, c);
        add(addButton);

        c.gridwidth = GridBagConstraints.REMAINDER;
        this.getContentPane().add(removeButton, c);
        add(removeButton);

        c.weighty = 1.0;
        this.getContentPane().add(buttonPanel, c);
        add(buttonPanel);

        setPreferredSize(new Dimension(400, 400));
    }

    @Override
    public void componentAdded(ContainerEvent e) {
        mostrarMensaje(" añadido a ", e);
    }

    @Override
    public void componentRemoved(ContainerEvent e) {
        mostrarMensaje(" borrado de ", e);
    }

     private void mostrarMensaje(String mensaje, ContainerEvent e) {
         areaTexto.append(((JButton)e.getChild()).getText()
                + " se ha "
                + mensaje
                + e.getContainer().getClass().getName()
                + "\n");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        if (ADD.equals(command)) {
            JButton newButton = new JButton("Boton "
                    + (buttonList.size() + 1));
            buttonList.add(newButton);
            buttonPanel.add(newButton);
            buttonPanel.revalidate();

        } else if (REMOVE.equals(command)) {
            int ultimo = buttonList.size() - 1;
            try {
                JButton botonSelec = buttonList.get(ultimo);
                buttonPanel.remove(botonSelec);
                buttonList.remove(ultimo);
                buttonPanel.revalidate();
                buttonPanel.repaint();
            } catch (ArrayIndexOutOfBoundsException exc) {}
        } else if (CLEAR.equals(command)) {
            areaTexto.setText("");
        }
    }


}