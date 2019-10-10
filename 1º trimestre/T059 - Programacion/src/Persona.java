public class Persona {

    int peso;

    public Persona(int peso) {
        setPeso(peso);
    }


    public void setPeso(int peso) {
        assert peso > 0 : "Error una persona no puede tener peso negativo ni cero";
        this.peso = peso;
    }
}
