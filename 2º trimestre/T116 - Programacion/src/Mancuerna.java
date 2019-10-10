public class Mancuerna implements Comparable<Mancuerna>{

    int peso;

    public Mancuerna(int peso) {
        this.peso = peso;
    }

    public void setPeso(int peso) {
        assert peso >= 0 : "Error una mancuerna debe pesar un kilo como minimo.";
        this.peso = peso;
    }

    @Override
    public int compareTo(Mancuerna o) {
        return this.peso - o.peso;
    }

    @Override
    public String toString() {
        return String.valueOf(peso);
    }
}
