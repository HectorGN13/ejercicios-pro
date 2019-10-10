public class Persona {
    private String alias;           // NN, NM
    private int peso;               // > 0
    private Gato gato;
    private boolean alergicoGatos;

    /**
     * Constructor de persona
     *
     * @param alias                         alias de la persona que no puede ser nulo y no se puede modificar
     * @param peso                          peso de la persona que debe seer > 0
     * @param alergico                 establece si la persona es alergica a los gatos
     * @throws NullPointerException         si el alias de la persona es nulo
     * @throws IllegalArgumentException     si el peso de una persona es <= a 0
     */
    public Persona(String alias, int peso, boolean alergico)
            throws NullPointerException, IllegalArgumentException {
        setAlias(alias);
        setPeso(peso);
        esAlergicoGatos(alergico);
    }

    private void setAlias(String alias) throws NullPointerException {
        if (alias == null)
            throw new NullPointerException("Error: el alias de una persona no puede ser nula");
        this.alias = alias;
    }

    private void setPeso(int peso) throws IllegalArgumentException {
        if (peso <= 0)
            throw new IllegalArgumentException(
                    String.format("Error: el peso de una persona debe ser mayor a 0 (%d)", peso));
        this.peso = peso;
    }

    /**
     * Asigna un gato la persona
     *
     * @param gato                      gato a asignar que no puede ser nulo
     * @throws IllegalStateException    si la persona a asignar el gato es alérgica
     */
    public void setGato(Gato gato) throws NullPointerException, IllegalStateException {
        if (gato == null)
            throw new NullPointerException("Error: el gato a asignar no puede ser nulo");
        if (alergicoGatos)
            throw new IllegalStateException("Error: una persona alergica no puede tener gato");
        this.gato = gato;
    }

    private void esAlergicoGatos(boolean alergico) {
        this.alergicoGatos = alergico;
    }


    @Override
    public String toString() {
        return alias;
    }
}
