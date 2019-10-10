import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;

public class VentanaPrincipal extends JFrame {

    private JComboBox<Persona> personaJComboBox;
    private JList listaAnimales;
    private HashMap <Persona, ArrayList<Animal>> hashMapProgra;
    private DefaultListModel<Animal> modeloLista;
    private JButton boton;

    public VentanaPrincipal() throws HeadlessException {
        setTitle("T228 - Programacion");
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setPreferredSize(new Dimension(800,600));
        pack();
        setLayout(new BorderLayout());

        hashMapProgra = crearHashMap();
        modeloLista = new DefaultListModel<>();

        //Componentes
        personaJComboBox = new JComboBox<>();
        for (Persona p : hashMapProgra.keySet()) {
            personaJComboBox.addItem(p);
        }
        personaJComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int posicion = personaJComboBox.getSelectedIndex();
                DefaultListModel<Animal> modeloLista2 = new DefaultListModel<>();
                for (Animal a : hashMapProgra.get(posicion)){
                    modeloLista2.addElement(a);
                    listaAnimales.setModel(modeloLista2);
                }
            }
        });

        add(personaJComboBox, BorderLayout.NORTH);



        listaAnimales = new JList(modeloLista);
        JPanel panel = new JPanel();
        panel.add(new JScrollPane(listaAnimales));
        add(panel,BorderLayout.CENTER);

        boton = new JButton("Mostrar");
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                personaJComboBox.getSelectedItem();
            }
        });



    }


    private Persona[] crearArrayPersona(){
        Persona p1 = new Persona("JUAN",100);
        Persona p2 = new Persona("PEPE", 110);
        Persona p3 = new Persona("LUIS", 120);

        Persona[] personas = {p1,p2,p3};
        return personas;
    }

    private HashMap<Persona, ArrayList<Animal>> crearHashMap(){
        Animal animal1 = new Animal("TOBI",TipoAnimal.GATO,Color.BLACK,20);
        Animal animal2 = new Animal("TOGO",TipoAnimal.PERRO,Color.BLACK,30);
        Animal animal3 = new Animal("PETRI",TipoAnimal.GATO,Color.YELLOW,20);
        Animal animal4 = new Animal("REX",TipoAnimal.GATO,Color.RED,20);
        Animal animal5 = new Animal("CHARLI",TipoAnimal.PERRO,Color.GRAY,20);
        Animal animal6 = new Animal("TAURO",TipoAnimal.TORO,Color.BLACK,20);

        ArrayList<Animal> gatos = new ArrayList<>();
        gatos.add(animal1);
        gatos.add(animal3);
        gatos.add(animal4);

        ArrayList<Animal> perros = new ArrayList<>();
        perros.add(animal2);
        perros.add(animal5);

        ArrayList<Animal> toros = new ArrayList<>();
        toros.add(animal6);

        Persona[] personas = crearArrayPersona();
        HashMap<Persona,ArrayList<Animal>> hashMapAnimalesPersona = new HashMap<>();

        hashMapAnimalesPersona.put(personas[0],gatos);
        hashMapAnimalesPersona.put(personas[1],perros);
        hashMapAnimalesPersona.put(personas[2],toros);

        return hashMapAnimalesPersona;
    }



}
