public class Rango {

    private int inicio;
    private int fin;

    public Rango(int inicio, int fin) {
        this.inicio = inicio;
        setFin(fin);
    }


    public void setFin(int fin) {
        assert fin >= this.inicio : "Error: el final del rango tiene que ser mayor o igual que el inicio.";
        this.fin = fin;
    }

    public int getInicio() {
        return inicio;
    }

    public int getFin() {
        return fin;
    }
}
