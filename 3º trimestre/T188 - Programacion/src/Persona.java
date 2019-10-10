public class Persona {
    private String alias;       // NN, NM
    private int peso;           // > 0

    public Persona(String alias) {
        setAlias(alias);
    }

    private void setAlias(String alias) throws NullPointerException{
        if (alias == null)
            throw new NullPointerException("Error: el alias de una persona no puede ser nula");
        this.alias = alias;
    }

    public void setPeso(int peso) throws IllegalArgumentException{
        if (peso <= 0)
            throw new IllegalArgumentException(String.format(
                    "Error: el peso de una persona debe ser mayor a 0 (%d)", peso));
        this.peso = peso;
    }

    @Override
    public String toString() {
        return alias;
    }
}