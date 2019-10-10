public class Animal implements Comparable<Animal> {

    private String nombre;
    private int peso;

    public Animal(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return nombre + " Peso: " + peso + "Kg.";
    }

    public int getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public int compareTo(Animal o) {
        if (nombre.equals(o.getNombre()))
            return peso - o.getPeso();
        return nombre.compareTo(o.nombre);
    }
}
