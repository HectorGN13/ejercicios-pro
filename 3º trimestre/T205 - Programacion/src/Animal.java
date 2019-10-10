import java.io.Serializable;
import java.util.Comparator;

public class Animal implements Comparator<Animal>, Serializable {

    private String alias;                             // NO NULO, NO VACIO
    private int peso;                                 // >=1

    public Animal(String alias, int peso) {
        setAlias(alias);
        setPeso(peso);
    }

    public void setAlias(String alias) {
        if (alias == null)
            throw new NullPointerException("Error: el alias del animal no puede ser nulo");
        if (alias.isEmpty())
            throw new IllegalArgumentException("Error: el alias recibido no puede estar vacio");

        this.alias = alias;
    }

    public void setPeso(int peso) {
        if (peso<1)
            throw new IllegalArgumentException("Error: el peso no puede ser menor que uno");
        this.peso = peso;
    }

    public String getAlias() {
        return alias;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "alias='" + alias + '\'' +
                ", peso=" + peso +
                '}';
    }



    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.peso-o2.peso;
    }
}
