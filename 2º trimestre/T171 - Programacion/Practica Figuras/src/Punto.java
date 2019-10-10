import java.util.Objects;

public class Punto implements Comparable<Punto>{

    private double coordenadaX;
    private double coordenadaY;


    public Punto(double coordenadaX, double coordenadaY) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
    }

    public double getCoordenadaX() {
        return coordenadaX;
    }

    public double getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaX(double coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public void setCoordenadaY(double coordenadaY) {
        this.coordenadaY = coordenadaY;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Punto)) return false;
        Punto punto = (Punto) o;
        return Double.compare(punto.getCoordenadaX(), getCoordenadaX()) == 0 &&
                Double.compare(punto.getCoordenadaY(), getCoordenadaY()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCoordenadaX(), getCoordenadaY());
    }

    @Override
    public int compareTo(Punto o) {
        return (int) (getCoordenadaX() - o.getCoordenadaX());
    }
}
