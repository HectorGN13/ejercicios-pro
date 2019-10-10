import java.util.Arrays;

public class Casa {
    private static final int MINFILAS=1;
    private static final int MINCOLUMNAS=1;
    private Habitacion[][] habitaciones;

    public Casa(int filas, int columnas) {
        assert filas >= MINFILAS
                : String.format("Error: la casa debe tener como mínimo una fila de habitaciones (%d)", filas);
        assert filas >= MINCOLUMNAS
                : String.format("Error: la casa debe tener como mínimo una columna de habitaciones (%d)", columnas);
        habitaciones = new Habitacion[filas][columnas];
        inicializarHabitaciones();
    }

    private void inicializarHabitaciones() {
        for (int i = 0; i < habitaciones.length ; i++)
            for (int j = 0; j < habitaciones[i].length ; j++)
                habitaciones[i][j] = new Habitacion(this);
    }

    /**
     * Comprueba si la puerta existe en alguna habitación de la casa
     *
     * @param p Puerta a buscar
     * @return  true si la puerta existe (e.o.c. false)
     */
    public boolean esPuerta(Puerta p) {
        assert p != null : "Error: la puerta no puede ser nula";
        for (int i = 0; i < habitaciones.length ; i++)
            for (int j = 0; j < habitaciones[i].length ; j++)
                if (habitaciones[i][j].esPuerta(p))
                    return true;
        return false;
    }

    public boolean agregar(Puerta p, TipoOrientacion o, Coordenada c) {
        assert p != null : "Error: puerta no puede ser nulo";
        boolean correcto = false;
        for (int i = 0; i < habitaciones.length; i++)
            for (int j = 0; j < habitaciones[i].length; j++)
                if (habitaciones[i][j].esPuerta(p)) {
                    correcto = true;
                    break;
                }
        return correcto;
    }

    public boolean puertasCompletas(Coordenada c) {
        assert c != null : "Error: la coordenada de entrada no puede ser nula";
        return habitaciones[c.getFila()][c.getColumna()].puertasCompletas();
    }

    private boolean esCoordenada(Coordenada c) {
        assert c != null : "Error: la coordenada de entrada no puede ser nula";

        boolean filaCorrecta = false;
        boolean columnaCorrecta = false;

        for (int i = 0; i < habitaciones.length; i++)
            if (c.getColumna() <= habitaciones[i].length)
                columnaCorrecta = true;

        filaCorrecta = c.getFila() <= habitaciones.length;

        return filaCorrecta && columnaCorrecta;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "habitaciones=" + Arrays.toString(habitaciones) +
                '}';
    }
}
