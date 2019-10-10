public class Puerta {
    private boolean abierta;
    private int numHabitaciones = 0;
    private static final int MAXHABITACIONES = 2;

    public Puerta(boolean abierta) {
        this.abierta = false;
    }

    private void setContador() {
        assert numHabitaciones <= 2 : "Error una puerta no puede estar en mas de dos habitaciones";
        ++numHabitaciones;
    }

    public void abrir() {
        abierta = true;
    }

    public void cerrar() {
        abierta = false;
    }

    public boolean estaAbierta() {
        return abierta;
    }

    @Override
    public String toString() {
        return abierta ? "/" : "|";
    }
}
