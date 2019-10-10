public class Bateria {

    private int capacidad;              //>=0
    private int peso;                   //>=0
    private int carga;                  //[0,CAPACIDAD]

    public Bateria(int capacidad, int peso) {
        setCapacidad(capacidad);
        setCarga(capacidad);
        setPeso(peso);

    }

    private void setCapacidad(int capacidad){
        assert capacidad >= 0 :"Error: la capacidad no puede ser negativa";
        this.capacidad = capacidad;
    }


    private void setPeso(int peso) {
        assert peso >= 0 : "Error: el peso no puede ser negativo";
        this.peso = peso;
    }

    private void setCarga(int carga) {
        assert carga >= 0 && carga <= capacidad: "Error: la carga no puede ser negativa, ni superior a la capacidad.";
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void descargarBateria(int carga){
        setCarga(getCarga() - carga);
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Bateria{" +
                "capacidad=" + capacidad +
                ", peso=" + peso +
                ", carga=" + carga +
                '}';
    }
}
