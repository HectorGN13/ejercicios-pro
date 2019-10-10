import java.util.Random;

public class Tanque {


    private static final int FILAMAX = 7;
    private static final int COLUMNAMAX = 7;

    private int fila;
    private int columna;


    public Tanque() {
        Random rnd = new Random();
        setFila(rnd.nextInt(FILAMAX));
        setColumna(rnd.nextInt(COLUMNAMAX));
    }

    private void setFila(int fila) {
        assert (fila <= FILAMAX) : "Error: .....";
        this.fila = fila;
    }

    public void setColumna(int columna) {
        assert (columna <= COLUMNAMAX);
        this.columna = columna;
    }

    @Override
    public String toString() {
        return "Tanque{" +
                "fila=" + fila +
                ", columna=" + columna +
                '}';
    }
}