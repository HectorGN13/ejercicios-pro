import java.awt.*;
import java.io.Serializable;

public class Animal implements Serializable {

    private static int id = 0;
    private String alias;
    private TipoAnimal tipoAnimal;
    private Color color;
    private int peso;

    public Animal(String alias, TipoAnimal tipoAnimal, Color color, int peso) {
        this.alias = alias;
        this.tipoAnimal = tipoAnimal;
        this.color = color;
        this.peso = peso;
        id++;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", alias='" + alias + '\'' +
                ", tipoAnimal=" + tipoAnimal +
                ", color=" + color +
                ", peso=" + peso +
                '}';
    }
}
