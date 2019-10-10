import java.util.Objects;

public abstract class Figura implements Comparable<Figura>{

    private TipoColor Color;    //NOT NULL
    private Punto centro;

    //Metodos Abstractos
    public abstract void dibujar();
    public abstract double area();

    public Figura(TipoColor color) {
        setColor(color);
    }

    public void setColor(TipoColor color) {
        assert color != null : "Error: el color no puede ser null";
        Color = color;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    public TipoColor getColor() {
        return Color;
    }

    public Punto getCentro() {
        return centro;
    }

    public void mover(int distancia, TipoOrientacion sentido){
        switch (sentido.ordinal()){
            case 0:
                getCentro().setCoordenadaY(getCentro().getCoordenadaY()+distancia);
                break;
            case 1:
                getCentro().setCoordenadaX(getCentro().getCoordenadaX()+distancia);
                break;
            case 2:
                getCentro().setCoordenadaY(getCentro().getCoordenadaY()-distancia);
                break;
            case 3:
                getCentro().setCoordenadaX(getCentro().getCoordenadaX()+distancia);
                break;
            default:
                System.out.println("Error: programacion.");
                break;
        }
    }

    public Figura generarFigura(){
        return this;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Figura)) return false;
        Figura figura = (Figura) o;
        return getColor().equals(figura.getColor()) &&
                getCentro().equals(((Figura) o).getCentro());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor(), getCentro());
    }

    @Override
    public int compareTo(Figura o) {
        if (this.equals(o))
            return 0;
        return this.getCentro().compareTo(o.centro);
    }
}
