public class Plato {

    private TipoColor color;              // No nulo, No Modificable

    public Plato(TipoColor color) {
        setColor(color);
    }

    private void setColor(TipoColor color) {
        assert color != null : "Error el color no puede ser nulo";
        this.color = color;
    }

    public TipoColor getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Plato de color:"+ color.name();
    }
}
