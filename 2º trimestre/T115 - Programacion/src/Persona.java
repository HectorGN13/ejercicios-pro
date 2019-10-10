import java.util.Random;

public class Persona implements Comparable<Persona> {

    private int altura;    //>=0

    public Persona() {
        Random rnd = new Random();
        setAltura(rnd.nextInt(220));
    }

    public Persona(int altura) {
        setAltura(altura);
    }

    private void setAltura(int altura) {
        assert altura >= 0 : String.format("Error la altura no puede ser negativa, altura introducida: %d", altura);
        this.altura = altura;
    }

    @Override
    public int compareTo(Persona o) {
        return this.altura - o.altura;
    }

    @Override
    public String toString() {
        return String.valueOf(altura);
    }
}
