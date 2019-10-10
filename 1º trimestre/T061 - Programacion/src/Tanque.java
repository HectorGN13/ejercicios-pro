public class Tanque {

    private int fila;     //>=0
    private int columna;  //>=0
    private char direccion = 'N'; // 'N', 'S', 'E' y 'O'

    //Constructores
    public Tanque() {
        setFila(0);
        setColumna(0);
    }

    public Tanque(int fila) {
        setFila(fila);

    }

    public Tanque(int fila, int columna) {
        this(fila);
        setColumna(columna);
    }

    public Tanque(int fila, int columna, char direccion) {
        this(fila, columna);
        setDireccion(direccion);
    }

    //Accesores

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public char getDireccion() {
        return direccion;
    }

    //Mutadores


    private void setFila(int fila) {
        assert fila >= 0 : String.format("Error la fila tiene que ser mayor o igual que 0, fila introducida %d", fila);
        this.fila = fila;
    }

    private void setColumna(int columna) {
        assert columna >= 0 : String.format("Error la columna tiene que ser mayor o igual que 0, columna introducida %d", columna);
        this.columna = columna;
    }

    public void setDireccion(char direccion) {
        assert direccion == 'N' || direccion == 'S' || direccion == 'E' || direccion == 'O' : String.format("Error la diereccion solo tiene estos valores posibles 'N', 'S', 'E' y 'O'. Valor introducido: %s", direccion);
        this.direccion = direccion;
    }

    //Otros

    public void avanzar(int distancia){
        assert distancia >= 0 : String.format("Error: la distancia introducida debe ser mayor o igual que 0. Distancia introducida: %d", distancia);
        System.out.printf("El robot ha avanzado %d metros.", distancia);
    }

    @Override
    public String toString() {
        return "Tanque{" +
                "fila=" + fila +
                ", columna=" + columna +
                ", direccion=" + direccion +
                '}';
    }
}
